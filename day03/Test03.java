package Homework.day03;

import java.util.Scanner;

public class Test03 {
    /**
     * 输入天数 求有多少周 多少天
     */
    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("请输入天数：");
        int day=sc.nextByte();
        System.out.println("请输入每星期天数：");
        int week=sc.nextByte();
        System.out.println("总共有："+(day/week)+"周");
        int Remaining=(day-(day/week)*week);
        System.out.println("剩余天数:"+Remaining);*/


        int day=46;//总共多天
        int week=day/7;//求出多少周
        int leftDay=day%7;//剩余多少天
        System.out.println(day+"天等于"+week+"周剩余"+leftDay+"天");
    }
}
