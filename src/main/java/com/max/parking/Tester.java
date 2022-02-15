package com.max.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        /*
        Date內部使用
        long 長整數
        1970/1/1 00:00:00 至今的毫秒數
        1000毫秒 = 1秒鐘
         */
        Date date = new Date();
        System.out.println("印出當下時間 : " + date);
        System.out.println("印出long長整數值 : " + date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 參考https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        System.out.println("印出時間格視為(yyyy/MM/dd HH:mm:ss) : " + sdf.format(date));

        String s = "2022/02/15 10:32:37";
        try {
            Date other = sdf.parse(s);
            System.out.println("字串物件轉換Date : " + other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 使用Calendar日歷物件,因Date物件比較陽春 ,以及 可以特別對時間做處理 EX: 設定修改月份 日期 等等
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar物件,印出當下時間: " + calendar.getTime());
        calendar.set(Calendar.MONDAY,9); // 補充: 0是1月 , 9是10月
        System.out.println("將月份改成10月" + calendar.getTime()); // Sat Oct 15 10:48:09 CST 2022
        calendar.add(Calendar.DAY_OF_YEAR,3);
        System.out.println("將日期往後加三天:" + calendar.getTime()); // Tue Oct 18 10:53:49 CST 2022
    }
}
