package com.max.thread;

public class Tester {
    /*
    執行緒:
         1.Thread類別,覆寫Thread類別的run方法,把工作設計在裡面,把Thread new出來之後就可以呼叫他的start,叫他去做工作
         2.Runnable介面的實作方法,把Runnable設計出來,交到Thread的建構子當中,然後再呼叫這個Thread.start,就可以在程式裡面,使用多個執行緒來執行工作

    備註一:用sleep 是因為現在的電腦跑太快,會看不出主執行緒及子執行緒印出的差異,而sleep這個方法,可以讓執行緒睡個0.05秒 ,就能看出印出時每個執行緒的順序,如沒有寫sleep印出會是按照由上到下的順序
    sleep()方法有InterruptedException需處理,需要try..catch處理
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

                    try { // 會用sleep 看備註一說明
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

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

                    try { // 會用sleep 看備註一說明
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        //runnable 交到Thread的建構子當中,然後再呼叫這個Thread.start,就可以在程式裡面,使用多個執行緒來執行工作
        Thread r = new Thread(runnable);
        r.start();

        // Runnable簡化寫法 用 Lambda 表示
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable簡化寫法用Lambda 表示:" + i);

                try { // 會用sleep 看備註一說明
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        System.out.println("main end");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第二個子執行緒"+getName() + ":" + i);

            try { // 會用sleep 看備註一說明
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}