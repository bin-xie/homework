package Homework.day05;

import java.util.Scanner;

public class Test05 {
    /**
     * 会员信息录入:
     *       1.录入会员信息
     *       2.判断录入的会员号是否合法
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //录入会员信息
        System.out.println("我行我素购物管理系统> 客户信息管理> 添加客户信息\n");
        System.out.print("请输入会员号（4为整数）：");
        int member=input.nextInt();      //会员号
        System.out.print("请输入会员生日（月/日<用两位数表示>）：");
        String birthday=input.next();
        System.out.print("请输入积分:");
        double integral=input.nextDouble();

        if (member>999 && member<10000){
            System.out.println("已录入的会员信息是:\n"+member+"\t"+birthday+"\t"+integral);
        }else {
            System.out.println("您输入的会员信息不合法,录入失败");
        }

    }
}
