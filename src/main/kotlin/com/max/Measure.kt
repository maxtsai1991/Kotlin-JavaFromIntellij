package com.max

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main() {
    /*
        Kotlin 執行緒 測試耗費時間
        產生一個執行緒 ,此執行序工作 將counter 加 1
        該類別主要測試 thread 執行緒 和 協程 兩者運算 10萬筆加1 哪個時間比較短 , A : 協程較短
     */
    var counter = 1 // 計數器

//    var ms = measureTimeMillis { // measureTimeMillis { } 計算時間有多久,會得到一個毫秒,單位:millisecond(毫秒)
//        for (n in 1..100_000){   // 執行10萬次 , Kotlin 整數值可以用底線來分隔 :100_000 (10萬的意思)
//            thread{              // Kotlin 執行緒  thread{ }
//                counter++
//            }
//        }
//    }
        /*
          產生Kotlin 協程(Coroutines) 類似 java 的執行緒(thread)
         */
    var ms = measureTimeMillis {
        for (n in 1..100_000){
            GlobalScope.launch {
                counter++
            }
        }
    }

    println(ms)
}