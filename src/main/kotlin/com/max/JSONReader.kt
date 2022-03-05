package com.max

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

    /*
        Kotlin Http網路連線取的資料 範例 , 可參考 Java 的 network下的Tester.java
        桃園停車場(政府openData) :  https://data.gov.tw/dataset/25940
     */
fun main() {
    val url = URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f")

    // 第一種寫法 (像Kotlin寫法)
    with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader()
        var line = br.readLine()
        val json = StringBuffer()
        while (line != null){
            json.append(line)
            line = br.readLine()
        }
        println("第一種寫法 : ${json.toString()} ")
    }

    // 第二種寫法 (Kotlin 更快寫法)
    with(url.openConnection() as HttpURLConnection){
        val br = inputStream.bufferedReader().lines().forEach {
            println("第二種寫法 (Kotlin 更快寫法) : $it")
        }
    }

    // 第三種寫法
        println("第三種寫法 : ${url.readText()}")

    // 第四種寫法 (像java寫法)
    val connection = url.openConnection() as HttpURLConnection // as HttpURLConnection 轉型的意思 ,將url.openConnection() 轉型成HttpURLConnection
    val br = BufferedReader(InputStreamReader(connection.inputStream))
    var line = br.readLine()
    val json = StringBuffer()
    while (line != null){
        json.append(line)
        line = br.readLine()
    }
    println("第四種寫法 : ${json.toString()} ")
}