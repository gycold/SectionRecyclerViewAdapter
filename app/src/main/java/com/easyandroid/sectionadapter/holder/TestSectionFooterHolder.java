package com.easyandroid.sectionadapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.easyandroid.sectionadapter.R;

/**
 * package: com.easyandroid.sectionadapter.holder.TestSectionFooterHolder
 * author: gyc
 * description:SectionFooter的holder
 * time: create at 2017/7/8 3:01
 */

public class TestSectionFooterHolder extends RecyclerView.ViewHolder{

    public TextView tvLookNum,tvLikeNum, tvEvaluateNum;
    public LinearLayout llZan, llNum;
    public ImageView imgZan;

    public TestSectionFooterHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        tvLookNum = (TextView) itemView.findViewById(R.id.tv_look_num);
        llNum = (LinearLayout) itemView.findViewById(R.id.ll_evaluate);
    }
}
