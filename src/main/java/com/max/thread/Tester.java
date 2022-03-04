package com.max.thread;

public class Tester {
    /*
    執行緒:
         1.Thread類別,覆寫Thread類別的run方法,把工作設計在裡面,把Thread new出來之後就可以呼叫他的start,叫他去做工作
         2.Runnable介面的實作方法,把Runnable設計出來,交到Thread的建構子當中,然後再呼叫這個Thread.start,就可以在程式裡面,使用多個執行緒來執行工作
     */
    public static void main(String[] args) {
        // 主執行序 : for迴圈印出0到9的快捷鍵 : 10.for + tab
        for (int i = 0; i < 10; i++) {
            System.out.println("主執行緒main:" + i);
        }

        // 第一個子執行緒 , 要讓子執行序執行呼叫.start()方法, 大括號{}裡面即會執行裡面 , 裡面要覆寫run方法 (匿名類別)
        Thread thread = new Thread(){
            // ctrl + o 快捷鍵 覆寫run 方法
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("第一個子執行緒Thread : " + i);
                }
            }
        };
        thread.start();

        //第二個子執行緒 MyThread
        MyThread myThread = new MyThread();
        myThread.start();

        //第三個子執行緒 Runnable (匿名類別)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("第三個子執行緒Runnable:" + i);
                }
            }
        };
        //Runnable 交到Thread的建構子當中,然後再呼叫這個Thread.start,就可以在程式裡面,使用多個執行緒來執行工作
        Thread r = new Thread(runnable);
        r.start();

        System.out.println("main end");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第二個子執行緒"+getName() + ":" + i);
        }
    }
}