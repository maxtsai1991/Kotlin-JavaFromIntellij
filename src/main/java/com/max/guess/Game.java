package com.max.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        //猜數字遊戲
        Random random = new Random();
        int secret = random.nextInt(10)+1; // 亂數產生秘密數字 範圍是1~10
        System.out.println("秘密數字為:" + secret + "\n請猜數字,範圍是1~10 ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret ){ // while 執行到括號false 才會跳出迴圈
            System.out.print("Please enter a number:");
             number = scanner.nextInt();
            if (number < secret){
                System.out.println("再高一點(higher)");
            }else if (number > secret){
                System.out.println("再低一點(lower)");
            }else {
                System.out.println("你猜對了,秘密數字跟你猜的數字同為" + number );
            }
        }

//        int i = 0;
//        do {
//            System.out.println("dowhile test :" +i);
//            i++;
//        }while (i<4);


    }
}
