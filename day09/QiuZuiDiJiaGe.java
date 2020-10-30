package Homework.day09;

import java.util.Scanner;

public class QiuZuiDiJiaGe {
    public static void main(String[] args) {
        /**
         * 求出4家店的最低手机价格
         */
        Scanner input=new Scanner(System.in);
        System.out.println("请输入4家店的价格");
        int price[]=new int[]{3000,3150,2900,2950};
        int min;
        min=price[0];
        for (int i=0;i<price.length;i++){
            System.out.println("第" + (i + 1) + "家店的价格：");
            price[i] = input.nextInt();
            if (price[i]<min) {
                min=price[i];
            }
        }
        System.out.println("最低价格是"+min);
    }
}
