package com.max.student;

public class GraduateStudent extends Student{ // GraduateStudent : 研究生
    int thesis; // 論文
    static int pass = 70; // 子類別GraduateStudent 及格標準改成70
    /*
        super筆記:
        1.  super後面加小數點 : 呼叫父類別的方法
        2.  super() : 呼叫的是父層類別的建構子
     */
    // 如父類別Student沒有寫空的建構子,子類別這邊就要寫這段,
    public GraduateStudent(String name, int english, int math, int thesis){
        super(name, english, math); // 直接沿用父類別的欄位
        this.thesis = thesis; // 新增子類別新的欄位 thesis 論文欄位

    }

    @Override
    public void print() {
        System.out.println( "\t姓名:" + name + "\t英文:" + english + "\t數學:" + math + "\t論文:" + thesis + "\t平均分數:"+
                getAverage());
        if(getAverage() >= pass){ // pass : 及格分數的靜態欄位
            System.out.print("\t平均分數及格(Pass)");
        }else {
            System.out.println("\t平均分數不及格(Failed)");
        }
        int average = getAverage();
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            case 5:
                grading = 'F';
                break;
        }
        System.out.println("\t" + grading);
    }
}
