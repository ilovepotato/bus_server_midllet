package com.chelaile.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期转换工具
 *
 * @author wangshiyu
 *         2015年6月9日 上午10:24:18
 * @version 1.0.0
 */
public class DateUtil {

    public static final String YMDHMS = "yyyy-MM-dd HH:mm:ss"; //年月日时分秒

    //全局转换器
    public static Map<String, SimpleDateFormat> dateFormatMap;

    static {
        dateFormatMap = new HashMap<String, SimpleDateFormat>();
        dateFormatMap.put(YMDHMS, new SimpleDateFormat(YMDHMS));
    }

    /**
     * Date型的数据转换成String
     *
     * @param date
     * @param format
     * @return
     */
    public static String date2String(Date date, String format) {
        return dateFormatMap.get(format).format(date);
    }

    /**
     * 当前日期转换为时间字符串
     *
     * @return
     */
    public static String date2String() {
        return date2String(new Date(), YMDHMS);
    }

    /**
     * 将字符串转换为String
     *
     * @param date
     * @param format
     * @return
     */
    public static Date string2Date(String date, String format) {
        Date rel = null;
        try {
            rel = dateFormatMap.get(format).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return rel;
    }


    /**
     * 将日期字符串转换为指定的日期字符串文本格式。 <br/>
     *
     * @param date       日期字符串
     * @param fromFormat 字符串原本的日期格式
     * @param toFormat   将要转变成的日期格式
     * @return 指定格式的日期字符串
     * @author danruliu
     */
    public static String string2Format(String date, String fromFormat, String toFormat) {
        Date d = string2Date(date, fromFormat);
        return date2String(d, toFormat);
    }

    /**
     * 获取明天零点对应的Date
     * @return
     */
    public static Date getStartDateOfNextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
