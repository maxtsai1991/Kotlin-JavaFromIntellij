package com.kotlin

import java.util.*

/*
Kotlin 預設存取修飾字為public ,沒有寫存取修飾字也是public
private : 只能在目前類別當中使用
proteted : 目前類別及子類別都可以使用
internal : 模組(module)可用
Kotlin 模組(module) :
1.IntelliJ的模組
2.Maven專案 : 建置專案的工具
3.Gradle的srcSet
 */
    fun main(args: Array<String>) {
//        userInput()
        Student.pass = 50 // 及格分數 60 改成 50

        // New 出Student 3個物件,並印出
        val stu = Student("Max",60,99)
        val stu1 = Student("Jane",44,68)
        val stu2 = Student("Eric",30,40)
        stu.print()
        stu1.print()
        stu2.print()

        //New 出Student的子類別GraduateStudent,並印出
        val gstu = GraduateStudent("Jack", 55, 65, 60)
        gstu.print()

        println("\n最高分數(High Score):${stu.highest()}") //字串裡面要塞變數 ,用"$"符號隔開即可,方法呼叫需加{}大括號

        val testnum = 123
        println("This is num:$testnum")

    }
// GraduateSttudent 子類別繼承Student父類別
class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : Student(name, english, math){
    companion object{
        var pass = 70 // 變更子類別的及格分數pass , 60分改成70分
    }

    // override fun print() {} : 覆寫父類別方法,需在父類別方法前加上open ,覆寫父類別方法快捷鍵 ctrl + o
    override fun print() {
        println("姓名:$name\t 英文:$english\t 數學:$math\t 論文:$thesis\t 平均分數:${getAverage()}\t 平均成績是否及格:${passOrFailed()}\t 平均分數等級:${grading()}")
    }

    override fun passOrFailed() = if(getAverage() >= pass) "及格(PASS)" else "不及格(FAILED)"

}

    // var name : String? ->允許null值得宣告方法
    // open 代表開放給人家繼承的, Student父類別,被GraduateSttudent子類別繼承
    open class Student (var name : String? , var english : Int , var math : Int) {

    // companion object{} : Kotlin的static靜態, Kotlin裡如需用靜態方法,欄位,就需寫在companion object裡面
    companion object{
        @JvmStatic //@JvmStatic : 寫這個可以在Java的類別裡面,直接使用pass靜態欄位
        var pass = 60 // Kotlin 的static靜態欄位
        fun test(){
            println("testing")
        }
    }

    open fun print(){
        // 寫法一:
        println("寫法一:"+" 姓名: " + name + "\t英文: " + english + "\t數學: " + math + "\t平均分數: " + getAverage() +"\t"+
        "\n平均成績是否及格(大於等於60分) : " + passOrFailed() + "\n平均分數等級:" + grading())

        println("-------------------------------------------------------------------------------------")

        // 寫法二(用"$"符號去串接變數或是方法):
        println("寫法二:"+" 姓名:$name \n 英文:$english \n 數學:$math \n 平均分數:${getAverage()} \n 平均成績是否及格(大於等於60分) : ${passOrFailed()} \n 平均分數等級: ${grading()}")
        println("-------------------------------------------------------------------------------------")
    }
    // pass : 及格分數,static靜態欄位
    // 加open : 讓別人可以覆寫, ctrl + O 覆寫快捷鍵才看的到
    open fun passOrFailed() = if(getAverage() >= pass) "及格(PASS)" else "不及格(FAILED)"

    internal fun grading() : Char{

        // 寫法一:
        return when(getAverage()) { // Kotlin 的when 等於 Java Which case
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }

    // 寫法二:
//        var grading = when(getAverage()){ // Kotlin 的when 等於 Java Which case
//            in 90..100 -> 'A'
//            in 80 .. 89 -> 'B'
//            in 70.. 79 ->'C'
//            in 60.. 69 ->'D'
//            else -> 'F'
//        }
//        return grading;

    }

    // 兩科目平均寫法一:
//    fun getAverage() : Int{
//        return ( english + math ) / 2
//    }

    // 兩科目平均寫法二:
    fun getAverage() = ( english + math ) / 2

    fun highest() : Int {
        //if...else 回傳兩科目最高分數

        //回傳最高科目 方法一 :
        var max = if(english > math) {
            print("English 為最高科目!")
            english
        } else {
            print("Math為最高科目!")
            math
        };

        //回傳最高科目 減略寫法 方法二 :
//        fun highest() = if(english > math) {
//            print("English 為最高科目: ")
//            english
//        } else {
//            print("Math為最高科目: ")
//            math
//        };

        //回傳最高科目 傳統寫法 方法三 :
        if(english > math){
            max = english
        }else{
            max = math
        }

        return max
    }

    fun nameCheck(){
        println("name字元:"+name?.length) // 因為name 已經宣告 允許null值 所以這邊也要加? 才不會報錯
    }


private fun userInput() { // 讓使用者自行輸入姓名英文數學成績
    val Scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    var name = Scanner.next()
    print("Please enter student's english: ")
    var english = Scanner.nextInt()
    print("Please enter student's math: ")
    var math = Scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}




}