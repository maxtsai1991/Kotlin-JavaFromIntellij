package com.max

fun main() {
    /*
    Kotlin 裡面
    list 是不可變的 , 意思是不能用".add"去添加list裡面的數值
     */
    val list  = listOf(5,1,2,7)
    println("印出list:$list")
    val scores = listOf(68,88,77,99,50) //不可變list
    for(score in scores){
        println("kotlin不可寫入的List: $score")
    }
    println("list變數第3個位置的數字 : " + list.get(2))

    var mutableList : MutableList<Int> = mutableListOf(5,1,2,7) //可變(可寫)list , 也可以寫成 var mutableList = mutableListOf(5,1,2,7), 因kotlin 會自行推斷 等號右邊的型別
    mutableList.add(6)
    println("kotlin可寫入的List: $mutableList" )
}