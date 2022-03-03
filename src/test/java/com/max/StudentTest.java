package com.max;

import com.max.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void highestScoreTest(){
        Student student = new Student("Max",60,80);
        Assertions.assertEquals(80,student.highest()); // 測試最高分
    }

    @Test
    public void averageTest(){
        Student student = new Student("Max",60,80);
        Assertions.assertEquals(( 60 + 80 ) / 2 ,student.getAverage()); // 測試平均成績
    }
}
