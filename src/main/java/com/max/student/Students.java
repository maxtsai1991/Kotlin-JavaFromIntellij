package com.max.student;

public class Students {
    String id;
    String name;
    int english;
    int math;

    public Students() {
    }

    public Students(String id, String name, int english, int math) {
        this.id = id;
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public Students(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println( name + "\t" + english + "\t" + math + "\t" + " 平均分數 "+
                ( english + math ) / 2 );
    }
}
