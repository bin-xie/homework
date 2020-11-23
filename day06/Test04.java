package Homework.day06;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 登录菜单（第一级）
        System.out.println("\t\t欢迎使用我行我素购物管理系统\n");
        System.out.println("\t\t\t1.登陆系统\n");
        System.out.println("\t\t\t2.退出\n");
        System.out.println("******************************************\n");
        System.out.println("请选择，输入数字：");
        int digital=sc.nextInt();
        if (digital==1) {
            //主菜单（第二级）
            System.out.println("\t\t\t欢迎进入主菜单\n");
            System.out.println("\t\t\t1.客户信息管理");
            System.out.println("\t\t\t2.购物结算");
            System.out.println("\t\t\t3.真情回馈");
            System.out.println("\t\t\t4.注销");
            System.out.println("******************************************\n");
            System.out.println("请选择，输入数字：");
            int digital1=sc.nextInt();
            //第三级
            switch (digital1){
                case 1:
                    System.out.println("\t欢迎使用我行我素购物管理系统> 客户信息管理\n");
                    System.out.println("\t\t\t1.客户信息管理");
                    System.out.println("\t\t\t2.购物结算");
                    System.out.println("\t\t\t3.真情回馈");
                    System.out.println("\t\t\t4.注销");
                    System.out.println("******************************************\n");
                    break;
                case 2:
                    System.out.println("\t欢迎使用我行我素购物管理系统> 购物结算\n");
                    break;
                case 3:
                    System.out.println("\t欢迎使用我行我素购物管理系统> 真情回馈\n");
                    System.out.println("\t\t\t1.幸运大放送");
                    System.out.println("\t\t\t2.幸运抽奖");
                    System.out.println("\t\t\t3.生日问候");
                    System.out.println("******************************************\n");
                    break;
                case 4:
                    System.out.println("\t欢迎使用我行我素购物管理系统> 注销\n");
                    break;
            }
        }else {
            System.out.println("谢谢您的使用！");
        }
    }
}
