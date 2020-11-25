package Homework.day07;

import java.util.Scanner;

public class Test03 {
    /**
     * 查询商品价格
     *    循环输入商品编号，显示对应的商品价格,输入“n“结束循环
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int racket;    //球拍;
        int sneakers;  //球鞋
        int shirt;     //衬衫
        String answer ="Y";
        System.out.println("MyShopping管理系统  > 购物结算\n");
        //商品清单
        System.out.println("****************************");
        System.out.println("请选择购买的商品编号：\n1.T恤\t2.网球鞋\t3.网球拍");
        System.out.println("****************************\n");

        while ("Y".equals(answer)) {          //answer=Y就继续执行
            System.out.print("请输入商品编号：");
            int numBering=input.nextInt();

            switch (numBering){
                case 1:
                    System.out.println("T恤\t￥245.0");
                    break;
                case 2:
                    System.out.println("网球鞋\t￥570.0");
                    break;
                case 3:
                    System.out.println("网球拍\t￥320");
                    break;
            }
            System.out.println("\n是否继续（Y/N）");       //询问是否继续，Y继续，N退出
            answer=input.next();
        }
        System.out.println("程序结束");
    }
}
