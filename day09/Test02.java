package Homework.day09;

import java.util.Scanner;

public class Test02 {
    /**
     * 在控制台显示输出5键特价商品的名称
     * 本次活动特价商品有：Nike背包  Adidas运动衫  李宁运动鞋  kappa外套  361腰包
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("本次活动特价商品有：");
        String commodity[]= {"Nike背包","Adidas运动衫","李宁运动鞋","kappa外套","361腰包"};
        for (int i=0;i<commodity.length;i++){
            System.out.println(commodity[i]);
        }
    }
}
