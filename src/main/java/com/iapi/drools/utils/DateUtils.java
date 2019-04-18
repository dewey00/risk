package com.iapi.drools.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateUtils {

    /**
     * 功能：判断字符串是否为日期格式
     * 日期格式：yyyy-MM-dd HH:mm:ss
     *
     * @param
     * @return
     */
    public static boolean isDate(String strDate) {
        Pattern pattern = Pattern.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
        Matcher m = pattern.matcher(strDate);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static String dateStr(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("MM月dd日 hh:mm");
        String str = format.format(date);
        return str;
    }

    public static String dateStr(Date date, String f) {
        SimpleDateFormat format = new SimpleDateFormat(f);
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化时间
     *
     * @param str
     * @param format
     * @return
     */
    public static Date stringToDate(String str, String format) {
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//		date = java.sql.Date.valueOf(str);

        return date;
    }

    public static String dateStr2(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyy年MM月dd日hh时mm分ss秒
     *
     * @param date
     * @return
     */
    public static String dateStr5(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyyMMddhhmmss
     *
     * @param date
     * @return
     */
    public static String dateStr3(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String dateStr4(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String str = format.format(date);
        return str;

    }

    /**
     * 格式化日期 yyyy年MM月dd日
     *
     * @param date
     * @return
     */
    public static String dateStr6(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyyMMdd
     *
     * @param date
     * @return
     */
    public static String dateStr7(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 MM-dd
     *
     * @param date
     * @return
     */
    public static String dateStr8(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyyMMdd
     *
     * @param date
     * @return
     */
    public static String dateStr9(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyy-MM
     *
     * @param date
     * @return
     */
    public static String dateStr10(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        String str = format.format(date);
        return str;
    }

    /**
     * 格式化日期 yyyyMM
     *
     * @param date
     * @return
     */
    public static String dateStr11(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyMM");
        String str = format.format(date);
        return str;
    }

    /**
     * 将秒转换成时间
     *
     * @param times
     * @return
     */
    public static Date getDate(String times) {
        long time = Long.parseLong(times);
        return new Date(time / 1000);
    }

    public static String dateStr(String times) {
        return dateStr(getDate(times));
    }

    public static String dateStr2(String times) {
        return dateStr2(getDate(times));
    }

    public static String dateStr3(String times) {
        return dateStr3(getDate(times));
    }

    public static String dateStr4(String times) {
        return dateStr4(getDate(times));
    }

    public static String dateStr5(String times) {
        return dateStr5(getDate(times));
    }

    public static long getTime(Date date) {
        return date.getTime() / 1000;
    }

    /**
     * @return
     */
    public static long getLastDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = Calendar.getInstance();
        cale.set(Calendar.DAY_OF_MONTH, 0);// 设置为1号,当前日期既为本月第一天
        String lastDay = format.format(cale.getTime());
        long ss = DateUtils.getLastDateTime(lastDay + " 23:59:59");
        return ss;
    }

    /**
     * 返回当前月的最后前一天的时间戳
     *
     * @param time
     * @return
     */
    public static long getLastDateTime(String time) throws ParseException {
        // Date或者String转化为时间戳
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String time="1970-01-06 11:45:55";
        Date date = format.parse(time);
        long ss = date.getTime();
        // System.out.print("Format To times:"+date.getTime());
        return ss;
    }

    public static int getDay(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * s - 表示 "yyyy-mm-dd" 形式的日期的 String 对象
     *
     * @param s
     * @return
     */
    public static Date valueOf(String s) {
        final int YEAR_LENGTH = 4;
        final int MONTH_LENGTH = 2;
        final int DAY_LENGTH = 2;
        final int MAX_MONTH = 12;
        final int MAX_DAY = 31;
        int firstDash;
        int secondDash;
        int threeDash = 0;
        int fourDash = 0;
        Date d = null;

        if (s == null) {
            throw new java.lang.IllegalArgumentException();
        }

        firstDash = s.indexOf('-');
        secondDash = s.indexOf('-', firstDash + 1);
        if (s.contains(":")) {
            threeDash = s.indexOf(':');
            fourDash = s.indexOf(':', threeDash + 1);
        }
        if ((firstDash > 0) && (secondDash > 0)
                && (secondDash < s.length() - 1)) {
            String yyyy = s.substring(0, firstDash);
            String mm = s.substring(firstDash + 1, secondDash);
            String dd = "";
            String hh = "";
            String MM = "";
            String ss = "";
            if (s.contains(":")) {
                dd = s.substring(secondDash + 1, threeDash - 3);
                hh = s.substring(threeDash - 2, threeDash);
                MM = s.substring(threeDash + 1, fourDash);
                ss = s.substring(fourDash + 1);
            } else {
                dd = s.substring(secondDash + 1);
            }
            if (yyyy.length() == YEAR_LENGTH && mm.length() == MONTH_LENGTH
                    && dd.length() == DAY_LENGTH) {
                int year = Integer.parseInt(yyyy);
                int month = Integer.parseInt(mm);
                int day = Integer.parseInt(dd);
                int hour = 0;
                int minute = 0;
                int second = 0;
                if (s.contains(":")) {
                    hour = Integer.parseInt(hh);
                    minute = Integer.parseInt(MM);
                    second = Integer.parseInt(ss);
                }
                if (month >= 1 && month <= MAX_MONTH) {
                    int maxDays = MAX_DAY;
                    switch (month) {
                        // February determine if a leap year or not
                        case 2:
                            if ((year % 4 == 0 && !(year % 100 == 0))
                                    || (year % 400 == 0)) {
                                maxDays = MAX_DAY - 2; // leap year so 29 days in
                                // February
                            } else {
                                maxDays = MAX_DAY - 3; // not a leap year so 28 days
                                // in February
                            }
                            break;
                        // April, June, Sept, Nov 30 day months
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            maxDays = MAX_DAY - 1;
                            break;
                    }
                    if (day >= 1 && day <= maxDays) {
                        Calendar cal = Calendar.getInstance();
                        cal.set(year, month - 1, day, hour, minute, second);
                        cal.set(Calendar.MILLISECOND, 0);
                        d = cal.getTime();
                    }
                }
            }
        }
        if (d == null) {
            throw new java.lang.IllegalArgumentException();
        }
        return d;
    }

    /**
     * 由出生日期获得年龄  精确到天
     *
     * @param birthDay
     * @return
     * @throws Exception
     */
    public static int calcAge(Date birthDay) {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) {
            return 0;
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }

    /**
     * @return int
     * @Author cheng
     * @Description //TODO
     * @Date 13:31 2018/12/21
     * @Param [beginDate, endDate]
     */
    public static int getTimeDistance(Date beginDate, Date endDate) {
        Calendar beginCalendar = Calendar.getInstance();
        beginCalendar.setTime(beginDate);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        long beginTime = beginCalendar.getTime().getTime();
        long endTime = endCalendar.getTime().getTime();
        //先算出两时间的毫秒数之差大于一天的天数
        int betweenDays = (int) ((endTime - beginTime) / (1000 * 60 * 60 * 24));
        //使endCalendar减去这些天数，将问题转换为两时间的毫秒数之差不足一天的情况
        endCalendar.add(Calendar.DAY_OF_MONTH, -betweenDays);
        //再使endCalendar减去1天
        endCalendar.add(Calendar.DAY_OF_MONTH, -1);
        //比较两日期的DAY_OF_MONTH是否相等
        if (beginCalendar.get(Calendar.DAY_OF_MONTH) == endCalendar.get(Calendar.DAY_OF_MONTH)) {
            //相等说明确实跨天了
            return betweenDays + 1;
        } else {
            //不相等说明确实未跨天
            return betweenDays;
        }

    }


    /**
     * @param Begin
     * @param end   传入开始时间 和 结束时间 格式如：2012-09-07
     * @return 返回Map 获取相隔多少年 get("YEAR")及为俩个时间年只差，月 天，类推 Key ： YEAR MONTH DAY
     * 如果开始时间 晚于 结束时间 return null；
     */

    public static Map<String, Integer> getApartTime(String Begin, String end) {
        String[] temp = Begin.split("-");
        String[] temp2 = end.split("-");
        Map<String, Integer> map = new HashMap<String, Integer>(0);
        if (temp.length > 1 && temp2.length > 1) {
            Calendar ends = Calendar.getInstance();
            Calendar begin = Calendar.getInstance();

            begin.set(NumberUtils.getInt(temp[0]), NumberUtils.getInt(temp[1]), NumberUtils.getInt(temp[2]));
            ends.set(NumberUtils.getInt(temp2[0]), NumberUtils.getInt(temp2[1]), NumberUtils.getInt(temp2[2]));
            if (begin.compareTo(ends) < 0) {
                ends.add(Calendar.YEAR, -NumberUtils.getInt(temp[0]));
                ends.add(Calendar.MONTH, -NumberUtils.getInt(temp[1]));
                ends.add(Calendar.DATE, -NumberUtils.getInt(temp[2]));
                map.put("YEAR", ends.get(Calendar.YEAR));
                map.put("MONTH", ends.get(Calendar.MONTH) + 1);
                map.put("DAY", ends.get(Calendar.DATE));

            }
        }
        return map;
    }

    /**
     * 当前日期，加上day天数，返回相加后的日期
     *
     * @param d
     * @param day
     * @return
     */
    public static Date rollDay(Date d, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }

    /**
     * 月份相加
     *
     * @param d
     * @param mon
     * @return
     */
    public static Date rollMon(Date d, int mon) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.MONTH, mon);
        return cal.getTime();
    }

    /**
     * 年份相加
     *
     * @param d
     * @param year
     * @return
     */
    public static Date rollYear(Date d, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.YEAR, year);
        return cal.getTime();
    }

    /**
     * 年月日相加
     *
     * @param d
     * @param year
     * @return
     */
    public static Date rollDate(Date d, int year, int mon, int day) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.YEAR, year);
        cal.add(Calendar.MONTH, mon);
        cal.add(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }

    /**
     * date2与date1相隔的天数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static int differentDays(String startDate, String endDate) {
        Date date1 = DateUtils.stringToDate(DateUtils.getSubDateTime(startDate), "yyyy-MM-dd HH:mm:ss");
        Date date2 = DateUtils.stringToDate(DateUtils.getSubDateTime(endDate), "yyyy-MM-dd HH:mm:ss");
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1 = cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if (year1 != year2)   //同一年
        {
            int timeDistance = 0;
            for (int i = year1; i < year2; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)    //闰年
                {
                    timeDistance += 366;
                } else    //不是闰年
                {
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2 - day1);
        } else    //不同年
        {
            System.out.println("判断day2 - day1 : " + (day2 - day1));
            return day2 - day1;
        }
    }

    /**
     * 获取当前时间的秒数字符串
     *
     * @return String 返回类型
     */
    public static String getNowTimeStr() {
        String str = Long.toString(System.currentTimeMillis() / 1000);
        return str;
    }

    /**
     * 获取当前时间的毫秒数字符串
     *
     * @return String 返回类型
     */
    public static String getNowTimeStrMillis() {
        String str = Long.toString(System.currentTimeMillis());
        return str;
    }

    /**
     * 获取当前时间-时间戳
     *
     * @return int 返回类型
     */
    public static int getNowTime() {
        return Integer.parseInt((System.currentTimeMillis() / 1000) + "");
    }

    /**
     * 当前时间转换为时间戳
     *
     * @return String 返回类型
     */
    public static String getTimeStr(Date time) {
        long date = time.getTime();
        String str = Long.toString(date / 1000);
        return str;
    }

    public static String getTimeStr(String dateStr, String format)
            throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date;
        date = sdf.parse(dateStr);
        String str = DateUtils.getTimeStr(date);
        return str;
    }

    public static String rollMonth(String addtime, String time_limit) {
        Date t = DateUtils.rollDate(DateUtils.getDate(addtime), 0, NumberUtils.getInt(time_limit), 0);
        return t.getTime() / 1000 + "";
    }

    public static String rollDay(String addtime, String time_limit_day) {
        Date t = DateUtils.rollDate(DateUtils.getDate(addtime), 0, 0, NumberUtils.getInt(time_limit_day));
        return t.getTime() / 1000 + "";
    }

    public static Date getIntegralTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date getLastIntegralTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date getLastSecIntegralTime(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(d.getTime());
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


    /**
     * 字符串 转 日期
     *
     * @param date2
     * @return
     */
    public static Date getDatetime(String date2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // 获取本周日的日期
    public static String getCurrentWeekday() {
        int weeks = 0;
        int mondayPlus = DateUtils.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
        Date monday = currentDate.getTime();

        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    // 获得当前日期与本周日相差的天数
    private static int getMondayPlus() {
        Calendar cd = Calendar.getInstance();
        // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1; // 因为按中国礼拜一作为第一天所以这里减1
        if (dayOfWeek == 1) {
            return 0;
        } else {
            return 1 - dayOfWeek;
        }
    }

    // 获得本周一的日期
    public static String getMondayOFWeek() {
        int weeks = 0;
        int mondayPlus = DateUtils.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus);
        Date monday = currentDate.getTime();

        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    // 获取当前月第一天：
    public static String getFirstDayOfMonth(String first) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
        first = format.format(c.getTime());
        return first;
    }

    // 获取当月最后一天
    public static String getLastDayOfMonth(String last) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH,
                ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        last = format.format(ca.getTime());
        return last;
    }

    /**
     * @return String 返回类型
     * @throws
     * @Title: getFirstDayOfLastMonth
     * @Description: 获取上个月第一天 00:00:00
     */
    public static String getFirstDayOfLastMonth() {
        long time = 0;
        String monthBegin = getFirstDayOfMonth(null);
        try {
            Date lastMonthBegin = getDate(getTimeStr(monthBegin, "yyyy-MM-dd"));
            Date dateBegin = rollMon(lastMonthBegin, -1);
            time = dateBegin.getTime() / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(time);
    }

    /**
     * @return String 返回类型
     * @throws
     * @Title: getLastDayOfLastMonth
     * @Description: 获取上个月最后一天 23:59:59
     */
    public static String getLastDayOfLastMonth() {
        long time = 0;
        String monthEnd = getLastDayOfMonth(null);
        try {
            Date lastMonthEnd = getDate(getTimeStr(monthEnd, "yyyy-MM-dd"));
            Date dateEnd = rollMon(lastMonthEnd, -1);
            time = getLastSecIntegralTime(dateEnd).getTime() / 1000;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(time);
    }

    /**
     * 日期月份处理
     *
     * @param d     时间
     * @param month 相加的月份，正数则加，负数则减
     * @return
     */
    public static Date timeMonthManage(Date d, int month) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(d);
        rightNow.add(Calendar.MONTH, month);
        return rightNow.getTime();
    }

    /**
     * 获取指定年月的最后一天
     *
     * @param year_time  指定年
     * @param month_time 指定月
     * @return
     */
    public static Date monthLastDay(int year_time, int month_time) {
        Calendar cal = Calendar.getInstance();
        cal.set(year_time, month_time, 0, 23, 59, 59);
        return cal.getTime();
    }

    /**
     * 获取指定年月的第一天
     *
     * @param year_time  指定年
     * @param month_time 指定月
     * @return
     */
    public static Date monthFirstDay(int year_time, int month_time) {
        Calendar cal = Calendar.getInstance();
        cal.set(year_time, month_time - 1, 1, 0, 0, 0);
        return cal.getTime();
    }

    /**
     * 获取指定时间月的第一天
     *
     * @param d 指定时间，为空代表当前时间
     * @return
     */
    public static Date currMonthFirstDay(Date d) {
        Calendar cal = Calendar.getInstance();
        if (d != null)
            cal.setTime(d);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 0, 0, 0);
        return cal.getTime();
    }

    /**
     * 获取指定时间（date）月的最后一天
     *
     * @param d 指定时间，为空代表当前时间
     * @return
     */
    public static Date currMonthLastDay(Date d) {
        Calendar cal = Calendar.getInstance();
        if (d != null)
            cal.setTime(d);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 23, 59, 59);
        return cal.getTime();
    }

    /**
     * 当前系统时间，格式：yyyy-MM-dd HH:mm:ss
     *
     * @param d 指定时间，为空代表当前时间
     * @return
     */
    public static String currentTime(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.format(new Date());
    }

    /**
     * 获取指定时间（date）的年
     *
     * @param date 指定时间
     * @return
     */
    public static int getTimeYear(Date date) {
        if (date == null)
            date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    /**
     * 获取指定时间（date）的月
     *
     * @param date 指定时间
     * @return
     */
    public static int getTimeMonth(Date date) {
        if (date == null)
            date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH) + 1;
    }

    /**
     * 获取指定时间（date）的天
     *
     * @param date 指定时间
     * @return
     */
    public static int getTimeDay(Date date) {
        if (date == null)
            date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DATE);
    }

    public static Date getFirstSecIntegralTime(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(d.getTime());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        cal.set(Calendar.DATE, 0);
        return cal.getTime();
    }

    /**
     * 格式化日期，日期格式：20100101
     *
     * @param date
     * @return
     */
    public static String getSubDateTime(String date) {
        String year = date.substring(0, 4);
        String month = date.substring(4, 6);
        String day = date.substring(6, 8);
        String time = "";
        if (date.length() > 8) {
            String hour = " " + date.substring(8, 10);
            String minute = ":" + date.substring(10, 12);
            String second = ":" + date.substring(12, date.length());
            time = hour + minute + second;
        } else {
            time = date.substring(8, date.length());
        }

        return year + "-" + month + "-" + day + time;
    }

    /**
     * @return java.lang.String
     * @Author cheng
     * @Description
     * @Date 17:23 2018/12/21
     * @Param [num, newDate]
     */
    public static String plusDay(int num, Date newDate) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(newDate);
        // num为增加的天数，可以改变的
        ca.add(Calendar.DATE, num);
        Date currdate = ca.getTime();
        return new SimpleDateFormat("yyyyMMdd").format(currdate);
    }

    /**
     * 生成随机文件名：当前年月日+五位随机数
     *
     * @return
     */
    public static String getRandomFileName() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String str = simpleDateFormat.format(date);

        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数  

        return str + rannum;// 当前时间  
    }

    public static void main(String[] args) {
        String str = "20001229182114";
        String date = str.substring(0, 10);
        System.out.println(date);
    }
}
