package com.max

import java.time.LocalDateTime

fun main() {
    // 用車牌方式找到車,用HashMap
    val parkingLot = HashMap<String, Car?>() // 建立一個停車場物件 可以存放Key是字串,Value是Car物件的一個資料集合, ?代表可以接受null值
    var enter = LocalDateTime.of(2018,12,25,8,0,0) // 設定進場時間

    var car : Car? = Car("AAA-0001",enter) // 第一台車, ?代表可以接受null值
    parkingLot.put(car!!.id,car) // 停車場停了第一台車 , key是車牌 , value是car物件(包含車牌及進場時間) ,兩個!!代表如果key是null是可以接受的

    car = Car("BBB-0002",enter.plusMinutes(15)) // 第二台車進場時間 ,enter.plusMinutes(15) : 第一台車的時間往後加15分鐘
    parkingLot.put(car.id,car) // 停車場停了第二台車 , key是車牌 , value是car物件(包含車牌及進場時間)

    println("停車場目前停放數輛 : " + parkingLot.size)

    // 第一台車離開時間 (Car 1 Leaving) 進場時間: 8點整 ,離場時間: 9點整
    var leave = LocalDateTime.of(2018,12,25,9,0,0) // 設定離場時間
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} 這台車停了多久時間(單位:分鐘,英譯:duration): ${car?.duration()}")
    parkingLot.remove(car?.id) // 第一台車離開停車場需移除
    println("停車場目前停放數輛 : " + parkingLot.size)

    // 第二台車離開時間 (Car 2 Leaving) 進場時間: 8點15分 ,離場時間: 11點
    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2) // 假設第二台車 兩個小時後出場 , .plusHours(2) : leave時間 往後加兩小時
    println("${car?.id} 這台車停了多久時間(單位:分鐘,英譯:duration): ${car?.duration()}")
    parkingLot.remove(car?.id) // 第二台車離開停車場需移除
    println("停車場目前停放數輛 : " +parkingLot.size)


    /*
    Kotlin 裡面
    list 是不可變的 , 意思是不能用".add"去添加list裡面的數值
     */
//    val list  = listOf(5,1,2,7)
//    println("印出list:$list")
//
//    val scores = listOf(68,88,77,99,50) //不可變list
//    for(score in scores){
//        println("kotlin不可寫入的List: $score")
//    }
//
//    println("list變數第3個位置的數字 : " + list.get(2))
//
//    var mutableList : MutableList<Int> = mutableListOf(5,1,2,7) //可變(可寫)list , 也可以寫成 var mutableList = mutableListOf(5,1,2,7), 因kotlin 會自行推斷 等號右邊的型別
//    mutableList.add(6)
//    println("kotlin可寫入的List: $mutableList" )

}