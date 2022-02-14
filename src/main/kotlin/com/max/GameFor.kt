package com.max

import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

//    // 1 印到 5
//    for(i in 1..5){
//        println(i)
//    }

    val secret = java.util.Random().nextInt(10)+1
    println("秘密數字為:$secret")
    val scanner = Scanner(System.`in`)
    for (i in 1..5){
        println("Please enter a number (${i}/4): ")
        var number = scanner.nextInt();
        println("第${i}次輸入,值為:$number")

        if(secret > number){
            println("higher(再高一點!)")
        }else if (secret < number){
            println("lower(再低一點!)")
        }else{
            println("你猜對了")
            break
        }

//        //當輸入-1 則立即跳出for迴圈, 可省略寫大括號 因裡面只有break
//        if(number == -1)
//            break;


    }

}