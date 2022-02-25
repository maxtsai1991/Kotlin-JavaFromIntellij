package com.max.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        /**
         * ctrl + alt + m 從MAIN抽取出來方法快捷鍵
         */
        map();          // Map<Key,Value> 特性: 1.一筆資料裡面包含兩樣東西,一個是Key(鍵值),一個是鍵值所對應到的值叫Value 2.不能重複(有重複的話,只會印出重複的一筆) 3. 不帶有資料放入的順序
        set();          // Set 特性: 1.不希望有任何重複性的資料,可以避免再去檢查裏頭有沒有重複(如有重複數值,只會顯示一個) 2. 沒有index值(沒有次序的概念,不能用index值去取得某一筆資料) 3.HashSet沒有排序功能,TreeSet才有排序功能
        list();         // List 特性: 1.順序 2.索引 3.可以放重覆性的資料 ; 加<Integer>代表只能放Integer整數
        arrayTest();    // Array

    }

    private static void map() {
        HashMap<String,String> stocks = new HashMap<>(); // HashMap<String,String> stocks股票當範例 : < 股票的股號(EX:0050) , 公司的名稱(EX:台積電) >
        // Map放值用.put
        stocks.put("2330","台積電");
        stocks.put("2330","TSMC");// key要是一樣 ,印出的Value 會覆蓋成新的【台積電 > TSMC】
        stocks.put("2317","鴻海");
        stocks.put("2317","鴻海");// 不能重複(有重複的話,只會印出重複的一筆)

        // 印出Map 裡的全部資料
        System.out.println("印出Map : " + stocks);

        // Map 取單一筆的值 用.get方法
        System.out.println(" 取得2330的字串值 : " + stocks.get("2330"));

        // Map 取出所有得key 及 value 值 ,用 for迴圈
        for (String key : stocks.keySet()){ // 先用for迴圈取得key, 在利用key值呼叫stocks的get方法,然後再得到所有的Value值
            System.out.println("印出股票Map所有Key字串 : " + key + ", 及所有Value字串 : " + stocks.get(key));
        }
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println("印出HashSet : " + set);
        for (int n : set){
            System.out.println("取出HashSet裡的的所有值 : " + n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList(); // List的特性: 1.順序 2.索引 3.可以放重覆性的資料 ; 加<Integer>代表只能放Integer整數
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(1);
        list.add(1);

        System.out.println("印出list : " + list);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println("n1 & n2 : " + n1 +" & "+ n2);
        System.out.println("印出list裡面有幾個 : " + list.size());

        List<Integer> scores = Arrays.asList(68, 88, 77, 99, 50);
        for(int score : scores){
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 7; 超出範圍(最多到5)

        int[] scores = {68, 88, 77,99,50};
        // 傳統for迴圈
        for(int i =0; i < 5 ; i++){
            System.out.println("傳統for迴圈 : " + scores[i]); // 陣列分別印出
        }

        System.out.println("---------");

        //  foreach迴圈
        for(int n : scores){
            System.out.println("foreach迴圈 : " + n);
        }
    }
}
