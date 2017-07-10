package com.easyandroid.sectionadapter.mvp.base;

/**
 * package: com.easyandroid.sectionadapter.mvp.base.BaseView
 * author: gyc
 * description:
 * time: create at 2017/7/8 9:50
 */

public interface BaseView {
    void showLoading(String msg);
    void hideLoading();
    void showError(String errorMsg);
}
