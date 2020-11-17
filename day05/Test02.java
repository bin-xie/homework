package Homework.day05;

import java.util.Scanner;

public class Test02 {
    /**
     * 通过用户输入年龄
     * 70以上  睡大马路
     * 50 - 70  到处浪
     * 30 -50 结婚生子
     * 18 - 30 爱干嘛就干嘛
     * 18以下  听妈妈的话，好好学习
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输你的入年龄:");
        int age=sc.nextInt();
        if (age>=70){
            System.out.println("睡大马路");
        }else if (age>=50 && age<70) {
            System.out.println("老实在家");
        }else if (age>=30){
            System.out.println("结婚生子");
        }else if (age>=18){
            System.out.println("爱干嘛就干嘛");
        }else if (age<18){
            System.out.println("听妈妈的话，好好学习!");
        }
    }
}
