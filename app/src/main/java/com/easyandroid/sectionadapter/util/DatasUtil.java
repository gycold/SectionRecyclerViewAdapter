package com.easyandroid.sectionadapter.util;

import com.easyandroid.sectionadapter.entity.TestEntity;
import com.easytools.tools.TimeUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * package: com.easyandroid.sectionadapter.util.DatasUtil
 * author: gyc
 * description:
 * time: create at 2017/7/8 9:58
 */

public class DatasUtil {

    static String url1 = "http://g.hiphotos.baidu" +
            ".com/image/pic/item/4b90f603738da977c76ab6fab451f8198718e39e.jpg";
    static String url2 = "http://www.zjito.com/upload/resources/image/2015/11/21/8577adeb-c075-409d-b910-9d29137f8b84_720x1500.jpg?1483574072000";


    public static List<TestEntity.BodyBean.EListBean> createDatas() {
        List<TestEntity.BodyBean.EListBean> mDatas = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            TestEntity.BodyBean.EListBean bean = new TestEntity.BodyBean.EListBean();
            List<String> urls = new ArrayList<>();
            bean.setPicture(url1);
            bean.setContent("炎热的夏日，深深的森林里，据说，有妖怪");
            bean.setTime(TimeUtil.getTimeString());
            bean.setBrowser("103");
            bean.setUserName("WD");
            urls.add(url2);
            urls.add(url2);
            urls.add(url2);
            urls.add(url2);
            urls.add(url2);
            urls.add(url2);
            bean.setEPicture(urls);
            mDatas.add(bean);
        }
        return mDatas;
    }
}
