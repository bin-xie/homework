package Homework.day05;

import java.util.Scanner;

public class Test02 {
    /**
     * 实现幸运抽奖:会员号的百位数字等于产生的随机数字即为幸运会员
     * if-else选择结构  产生随机数 从控制台接收一个4位会员号 分解获得百位数 判断是否是幸运会员
     * 产生随机数（0~9）的方法: int ranint =(int)(Math.random()*10);
     * 取一位数会员
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("我行我素购物管理系统> 幸运抽奖\n");
        int random =(int)(Math.random()*10);
        char reward='8';
        System.out.print("请输入一位会员号:");
        random=input.nextInt();
        if (random==8){
            System.out.println(random+"号客户是幸运客户，获得精美MP3一个");
        }else {
            System.out.println(random+"号客户，感谢您的支持");
        }
//====================================================================

        /*
        *//* 产生随机数 *//*
        int random = (int) (Math.random() * 10);

        *//* 从控制台接收一个4位会员号 *//*
        System.out.println("我行我素购物管理系统 > 幸运抽奖\n");
        System.out.print("请输入4位会员号： ");
        Scanner input = new Scanner(System.in);
        int custNo = input.nextInt();

        *//* 分解获得百位 *//*
        int baiwei = custNo / 100 % 10;

        *//* 判断是否是幸运会员 *//*
        if (baiwei == random) {
            System.out.println(custNo + "是幸运客户，获精美Mp3一个。");
        } else {
            System.out.println(custNo + "  谢谢您的支持！");
        }
        */
    }
}
