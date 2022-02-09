package com.max;

public class Person {
    // Person 身上的屬性
    String name;
    float weight;
    float height;

    public Person() {
    }

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void hello(){
        System.out.println("Hello World From Java!");
    }

    public void printname(){
        System.out.println(name);
    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }

}
