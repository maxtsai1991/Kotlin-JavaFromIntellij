package com.max.student

import java.util.*


fun main(args: Array<String>) {
    val Scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    var name = Scanner.next()
    print("Please enter student's name: ")
    var english = Scanner.nextInt()
    print("Please enter student's name: ")
    var math = Scanner.nextInt()
    val stu = Student(name,english,math)
    stu.print()
}

class Student (var name : String , var english : Int , var math : Int) {
    fun print(){
        println("姓名:" + name + "\t英文:" + english + "\t數學:" + math + "\t" + "平均分數: " +( english + math ) / 2 )
    }
}