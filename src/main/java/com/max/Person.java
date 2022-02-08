package com.max;

public class Person {
    // Person 身上的屬性
    String name;
    float weight;
    float height;

    public void hello(){
        System.out.println("Hello World From Java!");
    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }
}
