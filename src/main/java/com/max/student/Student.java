package com.max.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student() {
    }

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
        if(getAverage() >= 60){
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
        //方法二 (if...else):
        if(english > math){
            max = english;
        }else {
            max = math;
        }
        return max;
    }
}
