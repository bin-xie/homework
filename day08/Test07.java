package Homework.day08;

import java.util.Scanner;

public class Test07 {
    /**
     * 循环录入3位会员的信息  会员号合法，显示录入信息；否则显示录入失败
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
        int i = 1;
        int num = 0;                          // Num  会员号
        String birthday ="0" ;                            // birthday  生日
        int integral = 0;                             //integral   积分
        for (; i <= 3;i++) {
            System.out.print("请输入第"+i+"会员号（<4位整数>）：");
            num = input.nextInt();
            System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
            birthday = input.next();
            System.out.print("请输入会员积分：");
            integral = input.nextInt();
            if (num<1000 || num>9999){
                System.out.print("你输入的会员信息有误，录入失败，请重新输入\n");
                continue;
            }
            System.out.println("您录入的会员信息是：\n" + num + "\t" + birthday + "\t" + integral + "\n");
        }
        System.out.println("程序结束");
    }
}
