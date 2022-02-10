package com.max

import java.util.*


    fun main(args: Array<String>) {
//        userInput()
        val stu = Student("Nico",88,99)
        stu.print()
        println("High Score:{$stu.highest()}") //字串裡面要塞變數用"$"符號隔開即可,方法呼叫需加{}大括號
        val testnum = 123
        println("This is num:$testnum")
    }

// var name : String? ->允許null值得宣告方法
class Student (var name : String? , var english : Int , var math : Int) {
    fun print(){
        println("姓名:" + name + "\t英文:" + english + "\t數學:" + math + "\t" + "平均分數: " +( english + math ) / 2 )
    }

    fun highest() : Int {
        //if...else 回傳兩科目最高分數
        //新寫法 方法一 :
        var max = if(english > math) {
            print("English 為最高科目: ")
            english
        } else {
            print("Math 為最高科目: ")
            math
        };

        //傳統寫法 方法二 :
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


private fun userInput() {
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