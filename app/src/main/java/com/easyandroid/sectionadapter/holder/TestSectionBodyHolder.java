package com.easyandroid.sectionadapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.easyandroid.sectionadapter.R;

/**
 * package: com.easyandroid.sectionadapter.holder.TestSectionBodyHolder
 * author: gyc
 * description:SectionBody的holder
 * time: create at 2017/7/8 3:00
 */

public class TestSectionBodyHolder extends RecyclerView.ViewHolder{

    public LinearLayout llRoot;
    public ImageView imgEvaluate;

    public TestSectionBodyHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        llRoot = (LinearLayout) itemView.findViewById(R.id.ll_root);
        imgEvaluate = (ImageView) itemView.findViewById(R.id.img_evaluate);
    }
}
