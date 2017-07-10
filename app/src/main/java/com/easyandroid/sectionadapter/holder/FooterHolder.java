package com.easyandroid.sectionadapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.easyandroid.sectionadapter.R;

/**
 * package: com.easyandroid.sectionadapter.holder.FooterHolder
 * author: gyc
 * description:上拉加载的footer
 * time: create at 2017/7/7 20:50
 */

public class FooterHolder extends RecyclerView.ViewHolder {
    public TextView tvFooter;

    public FooterHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        tvFooter = (TextView) itemView.findViewById(R.id.tv_footer);
    }
}
