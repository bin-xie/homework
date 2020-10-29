package Homework.day09;

import java.util.Scanner;

public class GouWuJieSuan {
    public static void main(String[] args) {
        /**
         * 以表格的形式输出5笔购物金额及总金额
         */
        System.out.println("请输入会员本月的消费记录");
        Scanner input=new Scanner(System.in);
        double sum=0;
        double num[]=new double[5];
        for (int i=0;i<num.length;i++){
            System.out.print("请输入第"+(i+1)+"笔购物金额:");
            num[i]=input.nextDouble();
            //sum=sum+num[i];
        }
        System.out.println("\n序号\t\t\t\t金额（元）");
        for (int i=0;i<num.length;i++){
            System.out.println( (i+1) +"\t\t\t\t"   +num[i]);
            sum=sum+num[i];
        }
        System.out.println("总金额：\t\t\t"+sum);
    }
}
