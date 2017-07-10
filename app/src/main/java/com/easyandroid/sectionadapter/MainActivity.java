package com.easyandroid.sectionadapter;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.easyandroid.sectionadapter.adapter.SectionedRecyclerViewAdapter;
import com.easyandroid.sectionadapter.adapter.SectionedSpanSizeLookup;
import com.easyandroid.sectionadapter.entity.TestEntity;
import com.easyandroid.sectionadapter.listener.LoadMoreListener;
import com.easyandroid.sectionadapter.mvp.base.Module;
import com.easyandroid.sectionadapter.mvp.presenter.TestPresenter;
import com.easyandroid.sectionadapter.util.ListUtil;
import com.easyandroid.sectionadapter.widgets.SectionedGridDivider;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout
        .OnRefreshListener, Module.View {

    @BindView(R.id.swip_root)
    SwipeRefreshLayout refreshLayout;
    @BindView(R.id.rv)
    RecyclerView rv;

    private TestAdapter mAdapter;
    private GridLayoutManager mGridLayoutManager;
    private SectionedGridDivider mDivider;
    private List<TestEntity.BodyBean.EListBean> mDatas = new ArrayList<>();
    private boolean isPull = true;//是否下拉刷新

    private LoadMoreListener loadMoreListener;

    private TestPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPresenter = new TestPresenter(this);
        initAdapter();
    }

    private void initAdapter() {
        mAdapter = new TestAdapter(mDatas, this);
        mGridLayoutManager = new GridLayoutManager(this, 3);
        mGridLayoutManager.setSpanSizeLookup(new SectionedSpanSizeLookup(mAdapter,
                mGridLayoutManager));
        rv.setLayoutManager(mGridLayoutManager);
        rv.setAdapter(mAdapter);
        mDivider = new SectionedGridDivider(this, 50, Color.parseColor("#F5F5F5"));
        rv.addItemDecoration(mDivider);

        loadMoreListener = new LoadMoreListener(mGridLayoutManager) {
            @Override
            public void onLoadMore() {
                isPull = false;
                isLoading = true;
                mAdapter.changeMoreStatus(SectionedRecyclerViewAdapter.LOADING_MORE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mPresenter.loadData(1);
                    }
                }, 1000);
            }
        };
        rv.setOnScrollListener(loadMoreListener);

        refreshLayout.setOnRefreshListener(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mPresenter.loadData(1);
            }
        }, 300);
    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mPresenter.loadData(0);
            }
        }, 1000);
    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String errorMsg) {

    }

    @Override
    public void updateList(int type, List<TestEntity.BodyBean.EListBean> datas) {
        loadMoreListener.isLoading = false;
        if (refreshLayout.isRefreshing()) {
            refreshLayout.setRefreshing(false);
        }
        if (isPull) {
            if (!ListUtil.isEmpty(datas)) {
                mAdapter.getData().clear();
                mAdapter.notifyDataSetChanged();
                mAdapter.addMoreData(datas);
                if (loadMoreListener.isFullAScreen(rv)) {//显示item满一屏了
                    mAdapter.changeMoreStatus(SectionedRecyclerViewAdapter.PULLUP_LOAD_MORE);
                } else {
                    mAdapter.changeMoreStatus(SectionedRecyclerViewAdapter.LOADING_FINISH);
                }
                mAdapter.notifyDataSetChanged();
            } else {
                //显示空布局
            }
        } else {
            if (datas.size() > 0) {
                mAdapter.addMoreData(datas);
                mAdapter.changeMoreStatus(SectionedRecyclerViewAdapter.PULLUP_LOAD_MORE);
            } else {
                mAdapter.changeMoreStatus(SectionedRecyclerViewAdapter.LOADING_FINISH);
            }
        }

    }
}
