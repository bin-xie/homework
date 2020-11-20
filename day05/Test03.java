package Homework.day05;

import java.util.Scanner;

public class Test03 {
    /**
     * 通过用户输入年龄
     * 70以上  在家养老
     * 50 - 70  跳广场舞
     * 30 -50 结婚生子
     * 18 - 30 爱干嘛就干嘛
     * 18以下  听妈妈的话，好好学习
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        if (age >= 70) {
            System.out.println("在家养老");
        } else if (age >= 50 && age < 70) {
            System.out.println("跳广场舞");
        } else if (age >= 30) {
            System.out.println("结婚生子");
        } else if (age >= 18) {
            System.out.println("爱干嘛就干嘛");
        } else if (age < 18) {
            System.out.println("听妈妈的话，好好学习");
        }
    }
}
