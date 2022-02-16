package com.max.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id; // 辨識車牌
    private LocalDateTime enter;// 進場時間
    private LocalDateTime leave;// 離場時間

    public Car(String id, LocalDateTime enter, LocalDateTime leave) {
        this.id = id;
        this.enter = enter;
        this.leave = leave;
    }

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }
    // 設定停車分鐘數
    public long getDuration(){
        Duration duration = Duration.between(enter,leave); // .between(開始的時間,離場的時間) 回傳計算後的Duration物件
        return duration.toMinutes(); //Duration物件 回傳long型態
    }

    public void leave(){ //離開停車場的時間紀錄
        leave = LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave){
        if(leave.isAfter(enter) ){ // 離場時間是不是在進場時間之後判斷檢查: 檢查確認沒有問題後才能讓妳設定進去
            this.leave = leave;
        }
    }


}
