package com.max.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {

        try {
            /*
                此範例 可抓到 綠豆湯的api測試網址 或是 桃園停車場(政府openData)
             */
//            URL url = new URL("https://atm201605.appspot.com/h"); // 綠豆湯的api測試網址 1. 利用URL類別建一個網址資料 2. URL 會拋出MalformedURLException 要用try..catch包起來
            URL url = new URL("https://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f"); // 桃園停車場(政府openData) 1. 利用URL類別建一個網址資料 2. URL 會拋出MalformedURLException 要用try..catch包起來
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // url連線方式有兩種 : 1. .openConnection() 回傳URLConnection 2. .openStream() 回傳InputStream 3. 要轉型因為 url.openConnection() 型態是URLConnection ,而HttpURLConnection是子類別,父類別是URLConnection 4. 會拋出IOException例外,需做處理
            InputStream is = connection.getInputStream(); // 上面連線之後,最終都要得到一個輸入串流, 而connection.getInputStream() 可以得到InputStream輸入串流 , InputStream 每次讀的單位是一個byte , 所以也可以把他轉成BufferedReader
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();            // 每次讀一行進來
            StringBuffer json = new StringBuffer(); // 收集字串會用StringBuffer
            while (line != null){                   // 做判斷最後讀到會是null  , 所以當不是null時就會一直讀
                System.out.println(line);           // 讀一行印出一行
                json.append(line);                  // 將上面收集起來的字串添加進去, 跳行會被去除掉
                line = in.readLine();               // 印出一行後在繼續往下讀一行
            }
            System.out.println("------可以拿這些資料再去做Json的解析 : ------" + json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
