package com.chelaile;

import com.chelaile.domain.DataInfo;

/**
 * �������ӿ�
 * Created by wangshiyu on 2015/8/7.
 */
public interface YgInterceptor {
    /**
     * ����ǰ
     * @param content
     */
    void preParse(String content);

    /**
     * �����
     * @param dataInfo
     */
    void afterParse(DataInfo dataInfo);
}
