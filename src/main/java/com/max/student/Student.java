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
        System.out.println( "姓名:" + name + "\t英文:" + english + "\t數學:" + math + "\t" + " 平均分數 "+
                ( english + math ) / 2 );
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
