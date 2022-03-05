package com.max

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    /**
     * 重點摘要:
     * Kotlin _ for迴圈印出1到10的範圍這樣寫 : for (i in 1..10){}
     * 寫法二是寫法一的簡易寫法 , 省去寫.start()方法
     *
     * Coroutines 協程 是 Kotlin 執行緒的另一種 , 而花費的資源卻非常的低
     * Coroutines 需要外加一個函示庫 步驟如下:
     * 1.Google keyword 搜尋 : kotlin coroutines gradle
     * 2.https://github.com/Kotlin/kotlinx.coroutines 找到gradle 並貼到步驟3
     * 3. build.gradle dependencies { implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0") }
     */
    //寫法一:
    Thread({
        for (i in 1..10){
            println("Thread: ${i}")
            Thread.sleep(50)
        }
    }).start()
    //寫法二:
    thread {
        for (i in 1..10){
            println("thread() ${i}")
            Thread.sleep(50)
        }
    }

    // Coroutines 協程 ,GlobalScope 選的時候要選kotlinx.coroutines的
    GlobalScope.launch {
        for (i in 1..10){
            println("Coroutines:${i}")
            delay(50L) // 等同Thread.sleep(50) ,()括號裡面放Long型態所以用50L
        }
    }

}