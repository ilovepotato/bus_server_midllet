package com.chelaile.schedual;

import com.chelaile.Constant;
import com.chelaile.logcenter.YgLogger;
import com.chelaile.util.DateUtil;

import java.util.*;

/**
 * 输出文件output观察者类
 * Created by wangshiyu on 2015/8/7.
 */
public class IOHandlerManager {

    private List<YgLogger> loggerList;

    private Timer timer;

    public IOHandlerManager() {
        loggerList= new ArrayList<>();
        initSchedule();
    }

    /**
     * 初始化调度（每天凌晨调度一次）
     */
    private void initSchedule() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String date = DateUtil.date2String();
                for (YgLogger logger : loggerList) {
                    logger.resetOutput(date);
                }
            }
        }, DateUtil.getStartDateOfNextDay(), Constant.LOG_OUTPUT_RESET_CYCLE);
    }

    /**
     * 注册日志类
     * @param logger
     */
    public void regist(YgLogger logger) {
        loggerList.add(logger);
    }

    /**
     * 移除注册
     * @param logger
     */
    public void remove(YgLogger logger) {
        loggerList.remove(logger);
    }
}
