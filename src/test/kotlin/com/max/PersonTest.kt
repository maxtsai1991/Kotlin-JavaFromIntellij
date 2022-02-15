package com.max.kotlin

import com.max.Human
import com.max.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {

    @Test
    fun humanBmiTest(){
        val human = Human("max",66.5f,1.7f)  //Kotlin New 出物件
        Assertions.assertEquals(66.5f / (1.7f * 1.7f) , human.bmi())
    }
    @Test
    fun personBmiTest(){
        val person = Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f * 1.7f) , person.bmi())
    }
}