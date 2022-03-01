package com.max.student;

import java.util.Scanner;

public class SchoolRunner {
    /*
    static 筆記:
        1. 他是獨立的, 一開始就存在了,不需要new 出schoolrunner物件 即可使用的方法
     */
    public static void main(String[] args) {
//        userInput();

        com.max.Student.getPass();   // 在Java使用Kotlin的Student類別,是取得Kotlin的Pass靜態欄位
        com.max.Student.setPass(40); // 在Java使用Kotlin的Student類別,是設定Kotlin的Pass靜態欄位

        Student.pass = 50; // 靜態欄位的用法,Student物件下有個pass靜態欄位,降低及格標準( 原60分 改為 50分 )

        Student stu = new Student("Max",97,10);
        stu.print();
        System.out.println("\t最高科目分數(High score):" + stu.highest());

        Student stu2 = new Student("Eric",60,40);
        stu2.print();

        Student stu3 = new Student("Jane",30,55);
        stu3.print();

        GraduateStudent gstu = new GraduateStudent("Jack",55,65,60);
        System.out.println("練習GraduateStudent物件,繼承父類別Student印出:" );
        gstu.print();

    }

    private static void userInput() {
        System.out.println("Please enter student's name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please enter student's English: ");
        int english = scanner.nextInt();
        System.out.println("Please enter student's Math: ");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();

        System.out.println("兩科最高成績:" + stu.highest());
    }
}
