package com.chelaile.monitor;

import com.chelaile.OutputResetable;
import com.chelaile.YgInterceptor;
import com.chelaile.logcenter.YgLogger;
import com.chelaile.output.OutPutter;

import java.util.List;

/**
 * 监控接口类
 * Created by wangshiyu on 2015/8/7.
 */
public interface YgMonitor extends YgInterceptor, OutputResetable{

    /**
     * 重置数据
     */
    void reset();

    /**
     * 监控信息输出
     * @param list
     */
    void output(List<OutPutter> list);

}
