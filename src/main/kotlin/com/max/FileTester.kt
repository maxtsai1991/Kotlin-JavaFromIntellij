package com.max

import java.io.File

fun main() {
    write() // 寫入
    reader()// 讀出
}

private fun reader() {
    println("下面為讀取檔案資料")
    File("kotlinwikidoc.txt").bufferedReader().lines().forEach {
        //把每一行資料一一讀出來
        println(it)
    }
}

private fun write() {
    println("下面為寫出資料到檔案")
    //  寫法一 Kotlin把字串寫到檔案中: 把一段字(abc123)寫在output.txt檔案中 , .writeText("abc123") > 寫一段字 , .writeBytes() > 寫一個陣列
    File("output.txt").writeText("abc123")

    //  寫法二 Kotlin把字串寫到檔案中:得到一個File物件,在取得他的輸出串流物件,然後進入這個use區塊當中
    // use的特色 : 使用use他會自動得幫你關閉 ,不用像java要寫 .flush(); .close();
    File("output.txt").printWriter().use {
        it.println("1st line")
        it.println("2st line")
        it.println("3st line")
        it.println("4st line")
    }

    //  寫法三 Kotlin把字串寫到檔案中: 寫出很大量資料的時候用bufferedWriter
    File("output.txt").bufferedWriter().use {
        it.write("4st line\n")
        it.write("5st line\n")
        it.write("6st line\n")
        it.write("7st line\n")
    }
}