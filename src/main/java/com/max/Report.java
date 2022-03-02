package com.max;

public interface Report { //FinanceReport類別實作interface Report
    /*
    interface介面:
         1.概念說明:訂定介面後,利用implements實作機制,讓我底下的鎖鑰產生的各式類別,都有一個共同完成工作標準,而各類別的內容可自行定義,類似統一規範的概念
         2.訂定方法 但不能有方法身體 > (o) public void load();   (x) public void load(){};
     */
    public void load();
    public void print();
}
