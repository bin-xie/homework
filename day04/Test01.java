package Homework.day04;

public class Test01 {
    /**
     * 去年Apple笔记本所占市场份额是20，今年增长的市场份额是9.8，求今年所占份额？
     */
    public static void main(String[] args) {
        int before=20;//apple笔记本市场份额
        double rise=9.8;//增长的份额
        double now =(int)before + rise;
        System.out.println(now);
    }
}
