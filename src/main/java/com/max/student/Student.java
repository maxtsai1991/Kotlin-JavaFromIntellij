package com.max.student;

public class Student {
    /*
    靜態欄位 VS. 一般欄位 區別
         1.一般欄位 ,New出Student物件都會有的欄位(stu,stu2,stu3物件都有id,name,english,math欄位)
         Ex1-1. Student stu = new Student("Max",97,10);
         Ex1-2. Student stu2 = new Student("Eric",60,40);
         Ex1-3. Student stu3 = new Student("Jane",30,55);
         2.靜態欄位 : 不需new出可以直接用,
         Ex1. Student.pass
         Ex2. Student.pass = 50; 即可改變靜態欄位的初始值
     */
    String id;
    String name;
    int english;
    int math;
    static int pass = 60; // 及格標準


    public Student(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println( "\t姓名:" + name + "\t英文:" + english + "\t數學:" + math + "\t" + " 平均分數 "+
                getAverage());
        if(getAverage() >= pass){ // pass : 及格分數的靜態欄位
            System.out.print("\t平均分數及格(Pass)");
        }else {
            System.out.println("\t平均分數不及格(Failed)");
        }
        int average = getAverage();
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            case 5:
                grading = 'F';
                break;
        }
        System.out.println("\t" + grading);
    }

    public int getAverage(){ // 算平均
       return  ( english + math ) / 2;
    }

    //比對最高成績
    public int highest(){
        //方法一 (三元運算):
        int max = (english > math) ? english : math ;
//        //方法二 (if...else):
//        if(english > math){
//            max = english;
//        }else {
//            max = math;
//        }
        return max;
    }
}
