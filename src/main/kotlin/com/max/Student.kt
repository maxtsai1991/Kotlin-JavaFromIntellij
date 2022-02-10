package com.max

import java.util.*


    fun main(args: Array<String>) {
        val Scanner = Scanner(System.`in`)
        print("Please enter student's name: ")
        var name = Scanner.next()
        print("Please enter student's english: ")
        var english = Scanner.nextInt()
        print("Please enter student's math: ")
        var math = Scanner.nextInt()
        val stu = Student(name,english,math)
        stu.print()
        stu.nameCheck()
    }
    // var name : String? ->允許null值得宣告方法
    class Student (var name : String? , var english : Int , var math : Int) {
        fun print(){
            println("姓名:" + name + "\t英文:" + english + "\t數學:" + math + "\t" + "平均分數: " +( english + math ) / 2 )
        }

        fun nameCheck(){
            println("name字元:"+name?.length) // 因為name 已經宣告 允許null值 所以這邊也要加? 才不會報錯
        }


}