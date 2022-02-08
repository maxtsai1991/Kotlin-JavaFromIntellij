package com.max;

import static sun.misc.Version.print;

public class Hello {
    /*
    debug 模式筆記 :
    F7 (Step Into) 快捷鍵 : 追蹤進入當前程式碼方法裏頭
    F8 (Step Over) 快捷鍵 : 執行當前程式碼
    F9 (Resume Program) 快捷鍵 : 直接跑到下個中斷點
     */
    public static void main(String[] args) {

//        System.out.println("Hello World!!456789");

//        new Person().hello();

        Person p = new Person();
        p.hello();

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

    }
}
