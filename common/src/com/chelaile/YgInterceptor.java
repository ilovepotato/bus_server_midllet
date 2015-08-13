package com.chelaile;

import com.chelaile.domain.DataInfo;

/**
 * 拦截器接口
 * Created by wangshiyu on 2015/8/7.
 */
public interface YgInterceptor {
    /**
     * 处理前
     * @param content
     */
    void preParse(String content);

    /**
     * 处理后
     * @param dataInfo
     */
    void afterParse(DataInfo dataInfo);
}
