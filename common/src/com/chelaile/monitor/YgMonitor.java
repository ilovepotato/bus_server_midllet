package com.chelaile.monitor;

import com.chelaile.OutputResetable;
import com.chelaile.YgInterceptor;
import com.chelaile.logcenter.YgLogger;
import com.chelaile.output.OutPutter;

import java.util.List;

/**
 * ��ؽӿ���
 * Created by wangshiyu on 2015/8/7.
 */
public interface YgMonitor extends YgInterceptor, OutputResetable{

    /**
     * ��������
     */
    void reset();

    /**
     * �����Ϣ���
     * @param list
     */
    void output(List<OutPutter> list);

}
