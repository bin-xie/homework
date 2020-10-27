package Homework.day08;

import java.util.Scanner;

public class Test03 {
    /**
     * 计算顾客比例  商场对顾客的年龄层次进行调查
     *             计算各年龄层次的顾客比例
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age=0;
        int num=0;    //10为顾客
        int i=1;
        for (;i<=10;i++) {
            System.out.print("请输入第" + i + "位客户的年龄:");
            age = input.nextInt();
            if (age >= 30) {
                num++;
            }
        }
        System.out.println("30岁以下的比列是："+num*100/10+"%");
        System.out.println("30岁以下的比列是："+(10-num)*100/10+"%");
    }
}
