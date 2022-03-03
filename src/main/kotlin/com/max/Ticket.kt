package com.kotlin

import java.util.*

/*
    kotlin 裡寫data class 可視為 Java的Model or JavaBean or POJO
    Kotlin 的Extensions擴充
 */
data class Ticket(val origin:Int, val destination:Int,val price:Int) // 起訖站及價格 JavaBean + 建構子


fun main() {
    var ticket = Ticket(20,51,420)
    val s = "abcdefg"
    s.validate()
    println(s.validate()) // 字串判斷長度是否大於等於6的擴充,判斷s字串是否大於等於6, s > String

    /*
       擴充寫法:1到10亂數產生數字
    */
    println((1..10).random()) // 隨機產生1到10範圍的擴充, (1..10) > IntRange

    /*
       原寫法:1到10亂數產生數字
     */
    val r = Random().nextInt(10) + 1
    println(r)
}

fun String.validate() : Boolean{ // Extensions擴充
    return this.length >= 6
}

fun IntRange.random() : Int{ // 產生1到10範圍的擴充
    val r = Random().nextInt(endInclusive-start) + start //endInclusive : 包含最後一個數值(ex:1到10 ,代表有包含10)
    return r
}

