package com.max

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    /*
    1. 產生亂數
    2. 查看亂數產生的值
    3. 產生使用者可自行輸入的值
    4. 執行while迴圈, 直到 使用者輸入的值 同 亂數值 即跳出迴圈
    5. 當使用者輸入的值 小於 亂數值 提示 "再高一點" 反之 提示 "最低一點"
    6. 當猜對時 印出 猜對了 並 跳出迴圈 結束
     */

    val secret = Random.nextInt(10) + 1;
    println("Kotlin猜數字(範圍是1~10),秘密數字為:$secret")
//    val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret ){
        println("Please enter a number:")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()  // 等同scanner.nextInt(),讓使用者輸入值
        if (number < secret){
            println("再高一點(higher)")
        }else if (number > secret){
            println("再低一點(lower)")
        }else{
            println("你猜對了,秘密數字跟你猜的數字同為$number")
        }
    }

}