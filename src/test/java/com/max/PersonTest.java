package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    /*
     寫測試案例,是因為未來我的Person類別,開發他或修改他的時候,不管怎麼改他,都得通過這個測試案例,我前面所寫的都是正常的,確保我的程式執行品質是一致的
     */
    @Test
    public void bmiTest(){
        Person person = new Person(66.5f,1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f) , person.bmi()); // Assertions 類別層級的方法,不需要New出來,就可以直接用 ; .assertEquals( 期待他會出現什麼值 , 他出現的是什麼值 ) 判斷兩者相不相同,
    }
}
