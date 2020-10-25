package Homework.day09;

import java.util.Scanner;

public class Test01 {
    /**有一个数列：8，4，2，1，23，344，12
     *   循环输出数列的值
     *   求数列中所有数值的和
     *   猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sum=0;  //和
        int numbers[]=new int[]{8,4,2,1,23,344,12};
        boolean num=false;

        for (int i=0;i<numbers.length;i++) {
                System.out.print(+numbers[i]+"\t");
                sum=sum+numbers[i];
        }
        System.out.println();
        System.out.println("所有数值的和为："+sum);
        System.out.println("请输入一个数据：");
        int digital = input.nextInt();
        for (int i=0;i<numbers.length;i++) {
            //System.out.print(+numbers[i]+"\t");   //测试用的
            if (digital == numbers[i]){
                num = true;
            }
        }
            if(num) {
                System.out.println("数列中包含此数");
            }else {
                System.out.println("数列中不包含此数");
            }
    }
}
