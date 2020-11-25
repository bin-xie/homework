package Homework.day07;

import java.util.Scanner;

public class Test04 {
    /**
     * 升级购物结算: 1.循环输入商品编号和购买数量
     *             2.当输入n时结账
     *             3.结账时计算应付金额并找零
     */
    public static void main(String[] args) {
        String name = "";          //商品名称
        double price = 0.0;        //商品价格
        int numBering;             //商品编号
        int numBer = 0;            //购买数量
        double discount = 0.8;     //折扣比例
        double total = 0.0;        //商品总价
        double payment = 0.0;      //实付金额

        System.out.println("****************************");
        System.out.println("请选择购买的商品编号：\n1.T恤\t2.网球鞋\t3.网球拍");
        System.out.println("****************************");

        String answer = "Y";
        Scanner input = new Scanner(System.in);

        while ("Y".equals(answer)) {          //answer=Y就继续执行
            System.out.print("\n请输入商品编号：");
            numBering = input.nextInt();
            System.out.print("请输入购买数量：");
            numBer = input.nextInt();

            switch (numBering) {
                case 1:
                    name = "T恤";
                    price = 245.0;
                    break;
                case 2:
                    name = "网球鞋";
                    price = 570.0;
                    break;
                case 3:
                    name = "网球拍";
                    price = 320.0;
                    break;
            }
            System.out.println(name + "￥" + price + "\t数量" + numBer + "\t合计￥" + price * numBer);
            System.out.print("是否继续（Y/N）:");       //询问是否继续，Y继续，N退出
            answer = input.next();
            total += price * numBer;       //需要跟着循环
        }
        System.out.println("\n折扣：" + discount);
        System.out.println("应付金额:" + total * discount);

        System.out.print("实付金额:");
        payment = input.nextInt();
        while (payment - total * discount < 0) {
            System.out.println("您输入的金额小于应付金额，请重新输入：");
            payment = input.nextInt();
        }

        System.out.println("找钱:" + (payment - total * discount));
    }
}
