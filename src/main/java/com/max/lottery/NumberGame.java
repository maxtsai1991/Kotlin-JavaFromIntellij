package com.max.lottery;

import java.util.HashSet;
import java.util.Set;

// 樂透彩
public abstract class NumberGame {
    //Set特性:不會重複
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate(); // 產生亂數號碼球

    public boolean validate(){ // 檢查數字的數量對不對 , 如果numbers所有集合的size 等於 numberCount (數字數量)
        if(numbers.size() == numberCount)
            return true;
        else
            return false;
    }
}
