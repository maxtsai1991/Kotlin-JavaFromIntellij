package com.max.io;

import java.io.*;

public class Tester {
    /*
    輸出入相關類別與緩衝區(Buffered)讀取 :
                    輸入                      輸出
        byte    InputStream             OutputStream
        char    Reader                  Writer

     */

    public static void main(String[] args) {

        //用bufferedreader,印出myproject下kotlinwikidoc.txt檔案
        bufferedreader();

        // 用filereader,印出myproject下kotlinwikidoc.txt檔案
        filereader();

        File file = new File("data.txt"); // 1.在myproject下建立File,名稱叫:data.txt 2.如檔案直接在myproject下 ,即不用等路徑
        System.out.println("\n印出檔案是否存在於myproject下 : " + file.exists());          //印出檔案是否存在於myproject下
        System.out.println("印出檔案的絕對路徑 : "+file.getAbsolutePath()); //印出該檔案的絕對路徑

        // 寫法一 : 印出myproject下data.txt檔案
        inputstream1(file);

        // 寫法二 : 印出myproject下data.txt檔案
        inputstream2(file);

        System.out.println("File open success");
    }

    private static void bufferedreader() {
        try {
            System.out.println("BufferedReader用法 : ");
            BufferedReader br = new BufferedReader(new FileReader("kotlinwikidoc.txt"));
            String line = br.readLine();// 讀取一行,會一直收集直到跳行才結束收集
            while (line != null){
                System.out.println(line);
                line = br.readLine(); //寫這行是因為還要把下一行讀取出來
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void filereader() {
        try {
            System.out.println("FileReader用法 : ");
            FileReader fr = new FileReader("kotlinwikidoc.txt");
            int n = fr.read();
            while (n !=-1){
                System.out.print((char) n);
                n = fr.read(); //寫這行是因為還要把下一行讀取出來
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream2(File file) {
        try {
            System.out.println("FileInputStream寫法二 : ");
            InputStream is = new FileInputStream(file);
            int n = is.read();     // 讀data.txt檔案, data.txt檔案裡面寫abc

//            System.out.println(n); // Java 裡面 是用Unicode的系統 : a是97 , 0是48 , A是65
//            System.out.println(is.read()); // b 是 98
//            System.out.println(is.read()); // c 是 99

            System.out.println((char) n); // Java 裡面 印出字原 印出a
            System.out.println((char) is.read()); //          印出b
            System.out.println((char) is.read()); //          印出c

            System.out.println(is.read()); // 如讀不到資料時會印出-1

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("message");
        }
    }

    private static void inputstream1(File file) {
        try {
            System.out.println("FileInputStream寫法一 : ");
            FileInputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1){
                System.out.println((char) n);
                n = is.read(); //寫這行是因為還要把下一行讀取出來
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
