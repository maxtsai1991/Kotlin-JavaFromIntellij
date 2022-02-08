package com.max


   fun main(args: Array<String>) {
       /*
       val & var 筆記
       val = value 數值 不可變型態
       var = variable 變數 可變型態
        */

//    println("maxtsaiHello")
       // 方法一
//        Human().hello()
       // 方法二
       val h = Human(66.5f,1.7f)
       h.hello()
       h.bmi()
       println(" BMI : " + h.bmi())

       var age = 19;
       age = 20;
       var weight = 66.5f;
       var name : String;
       name = "MaxTsai";
   }

class Human (var weight : Float , var height : Float){

     fun hello(){
      println("Hello from Kotlin555")
     }

    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }
}

