package com.max.kotlin


import com.kotlin.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest(){
    val student = Student("Max",60,80)
        Assertions.assertEquals(80,student.highest()) // 測試最高分的科目是否正確, .assertEquals(最高科目的成績,student最高分方法)
    }

    @Test
    fun averageTest(){
        val student = Student("Max",60,80)
        Assertions.assertEquals((60+80)/2,student.getAverage()) // 測試兩科平均是否正確
    }

    @Test
    fun gradingTest(){
        val student = Student("Max",60,80)
        Assertions.assertEquals('C',student.grading()) // 測試平均成績在哪個範圍
    }

}