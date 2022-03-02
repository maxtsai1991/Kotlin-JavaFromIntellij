package com.max;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    /*
        知識點:
        1.Report父介面 可以new出子類別FinanceReport,因子類別FinanceReport有實作Report父介面。(父類別的參照資料型態可以放置子類別的物件)
        2.List<Report> reports = new ArrayList<>() : List 裡面只放Report型態的資料
        3.List型態如要添加資料用.add
        4.List要印出裡面所有內容物用for迴圈去跑

     */
    public static void main(String[] args) {
        Report finance = new FinanceReport();       //財務報表,
        Report health = new HealthReport();         //健檢報表
        List<Report> reports = new ArrayList<>();
        reports.add(finance);
        reports.add(health);
        for(Report report : reports){ // 所有報表裡面,都有load方法及print方法,就可以安心用迴圈來做大量不同種類的事情
            report.load();
            report.print();
        }
    }
}
