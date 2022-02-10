package com.max.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();

        Student stu = new Student("Max",97,60);
        stu.print();
        System.out.println("\tHigh score:" + stu.highest());
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
