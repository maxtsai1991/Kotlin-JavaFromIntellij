package com.max;

import static sun.misc.Version.print;

/*
   Ddebug 模式筆記 :
    F7 (Step Into) 快捷鍵 : 追蹤進入當前程式碼方法裏頭
    F8 (Step Over) 快捷鍵 : 往下執行(執行當前程式碼)
    Shift + F8 (Step Out) 快捷鍵 : 結束當前方法
    F9 (Resume Program) 快捷鍵 : 直接跑到下個中斷點
 */


public class Hello {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));

        System.out.println(s.length());


//        new Person().hello();

        Person p = new Person("This is MaxTsai.",70.5f,1.7f);
        System.out.println( " BMI1 : " + p.bmi());
        p.printname();

        p.hello();

        p.name = "MaxTsai";
        p.weight = 66.5f;
        p.height = 1.7f;

        System.out.println(" BMI2 : " + p.bmi());

        int score = 88;
        System.out.println( score > 70 && score < 80 );
        System.out.println( score < 80 || score > 90 );

        char c = 'A';
        System.out.println(c > 60);
        /*
        區域型變數
        int age = 19;
        Integer age2 = 19;
        Character c2 = 'B';
        char c = 'A';
        char tsai = 'C';
        byte b = 120;
        float weight = 66.5f;
        double weights = 66.4;
        float height = 1.7f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Max";
        */

    }
}
