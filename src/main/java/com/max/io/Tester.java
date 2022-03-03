package com.max.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt"); // 1.在myproject下建立File,名稱叫:data.txt 2.如檔案直接在myproject下 ,即不用等路徑
        System.out.println(file.exists());          //印出檔案是否存在於myproject下
        System.out.println(file.getAbsolutePath()); //印出該檔案的絕對路徑

        try {
            InputStream is = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("message");
        }

    }
}
