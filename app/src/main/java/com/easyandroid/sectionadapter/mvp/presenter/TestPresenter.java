package com.easyandroid.sectionadapter.mvp.presenter;

import com.easyandroid.sectionadapter.entity.TestEntity;
import com.easyandroid.sectionadapter.mvp.base.Module;
import com.easyandroid.sectionadapter.util.DatasUtil;

import java.util.List;

/**
 * package: com.easyandroid.sectionadapter.mvp.presenter.TestPresenter
 * author: gyc
 * description:
 * time: create at 2017/7/8 9:53
 */

public class TestPresenter implements Module.Presenter{

    private Module.View view;

    public TestPresenter(Module.View view) {
        this.view = view;
    }

    @Override
    public void loadData(int loadType) {
        List<TestEntity.BodyBean.EListBean> datas = DatasUtil.createDatas();
        if(view!=null){
            view.updateList(loadType, datas);
        }
    }
}
