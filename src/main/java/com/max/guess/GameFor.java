package com.max.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        //1加到10累加器
        int sum = 0;
        for (int i =1 ; i <=10 ; i++){
            sum = sum + i;
        }
            System.out.println(" 1加到10累加器 = " + sum);

        // 5印到1
        for(int a = 5 ; a >=1 ; a--){
            System.out.println(" 5印到1 : " + a);
        }

//        //計數器 可輸入五次數字之後跳出For迴圈
//        Scanner scanner = new Scanner(System.in);
//        for(int i =1 ; i<=5 ; i++){
//            System.out.println("Please enter a number :");
//            int number = scanner.nextInt();
//            System.out.println("第" + i +"幾次,輸入值為:" + number);
//            if(number == -1){
//                break;
//            }
//        }
//        System.out.println("計數器結束");

        //  1到10,猜數字遊戲,只能猜4次
        int secret = new Random().nextInt(10) + 1;
        System.out.println("秘密數字:" + secret);
        Scanner scanner = new Scanner(System.in);
        for(int i =1 ; i<=4 ; i++){
            System.out.println("Please enter a number (" + i + "/4):" + i);
            int number = scanner.nextInt();
            System.out.println("第" + i +"次,輸入值為:" + number);
            if(secret > number){
                System.out.println("higher(再高一點)");
            }else if(secret < number){
                System.out.println("lower(再低一點)");
            }else {
                System.out.println("你猜對了,秘密數字同妳猜數字為" + secret);
                break;
            }
        }
        System.out.println("猜數字結束");

    }
}
