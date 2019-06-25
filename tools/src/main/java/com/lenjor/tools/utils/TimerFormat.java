package com.lenjor.tools.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Lenjor
 * @version 1.0
 * @date 2019/6/25 11:22
 * @see "时间操作相关的方法"
 */
public class TimerFormat {
    private final static String FORMAT = "yyyy-MM-dd HH:mm:ss";
    private final static String DAY_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private static SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT);
    private static SimpleDateFormat dayFormat = new SimpleDateFormat(DAY_FORMAT);

    /**
     * 日期字符串转时间
     *
     * @param timeStr
     * @return
     */
    public static Date stringToDate(String timeStr) {
        try {
            return dateFormat.parse(timeStr);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 日期字符串转时间
     *
     * @param timeStr
     * @param format
     * @return
     */
    public static Date stringToDate(String timeStr, String format) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            return simpleDateFormat.parse(timeStr);
        } catch (ParseException e) {
            return null;
        }
    }


    /**
     * Date转日期字符串
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        return dateFormat.format(date);
    }

    /**
     * Date转日期字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String DateToString(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * 获取
     *
     * @return
     */
    public static String getToday() {
        return dayFormat.format(new Date());
    }

    /**
     * 获取有时差的日期
     *
     * @param hour
     * @return
     */
    public static String getToday(int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, hour);
        return dayFormat.format(calendar.getTime());
    }

    /**
     * 当前时间戳
     *
     * @return
     */
    public long now() {
        return System.currentTimeMillis();
    }

    /**
     * 获取今天开始时间
     *
     * @return
     */
    public Date getTodayDate() {
        try {
            return dayFormat.parse(getToday());
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取今天开始时间
     *
     * @param hour 时差
     * @return
     */
    public Date getTodayDate(int hour) {
        try {
            return dayFormat.parse(getToday(hour));
        } catch (ParseException e) {
            return null;
        }
    }
}
