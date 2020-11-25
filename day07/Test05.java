package Homework.day07;

import java.util.Scanner;

public class Test05 {
    /**
     * 升级菜单切换:如果用户输入错误，可以重复输入直到输入正确，执行相应的操作后退出循环
     */
    public static void main(String[] args) {
        System.out.println("欢迎使用MyShopping管理系统\n");
        System.out.println("*********************************");
        System.out.println("\t\t1.客户信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.真情回馈");
        System.out.println("\t\t4.注销");
        System.out.println("*********************************\n");

        System.out.print("请选择输入数字：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();     //number输入数字
        boolean n;         //n来定义一个变量确认正确与否
        do {
            n=true;
            if (number == 1) {
                System.out.println("执行客户信息管理");
            } else if (number == 2) {
                System.out.println("执行购物结算");
            } else if (number == 3) {
                System.out.println("执行真情回馈");
            } else if (number == 4) {
                System.out.println("执行注销");
            } else {
                System.out.print("输入错误，请重新输入数字:");
                number = input.nextInt();
                n=false;
            }
        }while (!n);

        System.out.println("\n程序结束");
    }
}