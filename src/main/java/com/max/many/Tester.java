package com.max.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
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
        arrayTest(); // array練習抽取出來的方法

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
