package com.max.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    // 把資料寫出到一個檔案當中
        /*
            Writer 輸出類別實例 :
                        輸入                      輸出
            byte    InputStream             OutputStream
            char    Reader                  Writer
        */
    public static void main(String[] args) {
        try {
            File jkDir = new File("C:\\jk");                      // 在C槽下建立jk資料夾
            jkDir.mkdir();                                                 // 如C槽下還要建立多層資料夾,則使用.mkdirs()
            FileWriter fw = new FileWriter("c:\\jk\\output.txt"); // 寫出一個檔案C槽資料夾的jk資料夾下面
            fw.write("abc"); //把abc字串寫出去
            fw.flush(); //把資料給沖到目的地去(讓這個資料到達目的地的方法),用這個是因為寫出匯到一個緩衝區直到滿了才會寫出(生活情境:上廁所完,一定要沖馬桶)
            fw.close(); // 建議習慣 使用完要關閉
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
