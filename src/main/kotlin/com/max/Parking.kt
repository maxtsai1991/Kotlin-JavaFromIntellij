package com.max

import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime

fun main() {

    // 設定 進場時間 及 離場時間
    val enter = LocalDateTime.of(2022,2,16,8,0,0)
    val level = LocalDateTime.of(2022,2,16,10,8,0)

    var car = Car("AAA-0001",enter) // car的物件,車牌及進場時間

    car.leave = level // Setter: 設定屬性的方法 ； car.leave 會呼叫 Car類別下的var leave (28到33行)
    println("停車的時間 : ${car.duration()} (分鐘)")

    val hours = Math.ceil(car.duration()/60.0).toLong() // Math.ceil() 會回傳double型態
    println("停車的時間 : $hours (小時)")
    println("停車費用(小時 * 30) : ${hours *30} (元)")

}


// Car 類別:含建構子及屬性,兩個屬性(車牌及進場時間)
class Car(val id : String , val enter: LocalDateTime){
    // 設定離場時間
    var leave : LocalDateTime? = null //leave離場時間(資料型態是LocalDateTime) : 加問號是因為 一開始可能是null ,然後再給他初始值
        // 客製化的Setter方法 ,傳進來的資料統一都叫做value ,value事由14行的 等於後面level傳來的
        set(value) {
            if(enter.isBefore(value)) // 進場時間是不是在(value)你傳入的時間 之前,如果是的話就將傳到leave身上； if(enter.isBefore(value)) 判斷進場時間是不是在離場時間之前
                field = value // field泛指set所代表的leave
        }

    // 設計停車時間方法
    fun duration() : Long{
        return  Duration.between(enter,leave).toMinutes()
    } // 簡化寫法 (38行) : 等於 fun duration() = Duration.between(enter,leave).toMinutes()

//    fun duration() = Duration.between(enter,leave).toMinutes() // 不用寫": Long" 是因為 "="的右邊是Long型態
}