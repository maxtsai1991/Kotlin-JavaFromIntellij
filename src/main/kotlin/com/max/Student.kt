package com.max

import java.util.*


    fun main(args: Array<String>) {
//        userInput()
        val stu = Student("Nico",20,99)
        stu.print()

        println("------------------------------------------------")

        println("\nHigh Score:${stu.highest()}") //字串裡面要塞變數 ,用"$"符號隔開即可,方法呼叫需加{}大括號

        val testnum = 123
        println("This is num:$testnum")
    }

// var name : String? ->允許null值得宣告方法
    class Student (var name : String? , var english : Int , var math : Int) {

    fun print(){
        // 寫法一:
        println("姓名: " + name + "\t英文: " + english + "\t數學: " + math + "\t平均分數: " + getAverage() +"\t"+
        "\n平均成績是否及格(大於等於60分) : " + passOrFailed() + "\n平均分數等級:" + grading())

        println("-------------------------------------------------------------------------------------")

        // 寫法二(用"$"符號去串接變數或是方法):
        println(" 姓名:$name \n 英文:$english \n 數學:$math \n 平均分數:${getAverage()} \n 平均成績是否及格(大於等於60分) : ${passOrFailed()} \n 平均分數等級: ${grading()}")
    }

    fun passOrFailed() = if(getAverage() >= 60) "及格(PASS)" else "不及格(FAILED)"

    fun grading() : Char{

        // 寫法一:
        return when(getAverage()) { // Kotlin 的when 等於 Java Which case
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }

    // 寫法二:
//        var grading = when(getAverage()){ // Kotlin 的when 等於 Java Which case
//            in 90..100 -> 'A'
//            in 80 .. 89 -> 'B'
//            in 70.. 79 ->'C'
//            in 60.. 69 ->'D'
//            else -> 'F'
//        }
//        return grading;

    }

    // 兩科目平均寫法一:
//    fun getAverage() : Int{
//        return ( english + math ) / 2
//    }

    // 兩科目平均寫法二:
    fun getAverage() = ( english + math ) / 2

    fun highest() : Int {
        //if...else 回傳兩科目最高分數

        //回傳最高科目 方法一 :
        var max = if(english > math) {
            print("English 為最高科目!")
            english
        } else {
            print("Math為最高科目!")
            math
        };

        //回傳最高科目 減略寫法 方法二 :
//        fun highest() = if(english > math) {
//            print("English 為最高科目: ")
//            english
//        } else {
//            print("Math為最高科目: ")
//            math
//        };

        //回傳最高科目 傳統寫法 方法三 :
        if(english > math){
            max = english
        }else{
            max = math
        }

        return max
    }

    fun nameCheck(){
        println("name字元:"+name?.length) // 因為name 已經宣告 允許null值 所以這邊也要加? 才不會報錯
    }


private fun userInput() { // 讓使用者自行輸入姓名英文數學成績
    val Scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    var name = Scanner.next()
    print("Please enter student's english: ")
    var english = Scanner.nextInt()
    print("Please enter student's math: ")
    var math = Scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}




}