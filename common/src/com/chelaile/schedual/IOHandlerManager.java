package com.chelaile.schedual;

import com.chelaile.Constant;
import com.chelaile.logcenter.YgLogger;
import com.chelaile.util.DateUtil;

import java.util.*;

/**
 * ����ļ�output�۲�����
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
     * ��ʼ�����ȣ�ÿ���賿����һ�Σ�
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
     * ע����־��
     * @param logger
     */
    public void regist(YgLogger logger) {
        loggerList.add(logger);
    }

    /**
     * �Ƴ�ע��
     * @param logger
     */
    public void remove(YgLogger logger) {
        loggerList.remove(logger);
    }
}
