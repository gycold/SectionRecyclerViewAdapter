package com.easyandroid.sectionadapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * package: com.easyandroid.sectionadapter.holder.TypeAbstractViewHolder
 * author: gyc
 * description:
 * time: create at 2017/8/3 22:21
 */

public abstract class TypeAbstractViewHolder<T> extends RecyclerView.ViewHolder {

    public TypeAbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindHolder(T entity);
}
