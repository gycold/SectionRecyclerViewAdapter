package com.easyandroid.sectionadapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.easyandroid.sectionadapter.R;

/**
 * package: com.easyandroid.sectionadapter.holder.TestSectionHeaderHolder
 * author: gyc
 * description:SectionHeader的holder
 * time: create at 2017/7/8 3:01
 */

public class TestSectionHeaderHolder extends RecyclerView.ViewHolder {
    public TextView tvNike, tvEvaluate, tvDate;
    public ImageView imgHead;

    public TestSectionHeaderHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        tvNike = (TextView) itemView.findViewById(R.id.tv_nike_name);
        tvEvaluate = (TextView) itemView.findViewById(R.id.tv_evaluate);
        tvDate = (TextView) itemView.findViewById(R.id.tv_date);
        imgHead = (ImageView) itemView.findViewById(R.id.img_head);
    }
}
