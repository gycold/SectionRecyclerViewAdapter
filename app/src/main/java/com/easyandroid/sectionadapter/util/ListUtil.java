package com.easyandroid.sectionadapter.util;

import java.util.List;

/**
 * package: com.easyandroid.sectionadapter.util.ListUtil
 * author: gyc
 * description:
 * time: create at 2017/7/8 3:24
 */

public class ListUtil {
    /**
     * 判断list数据是否为空
     * @param list
     * @param <P>
     * @return
     */
    public static <P> boolean isEmpty(List<P> list) {
        return list == null || list.isEmpty();
    }
}
