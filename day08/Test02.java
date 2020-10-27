package Homework.day08;

import java.util.Scanner;

public class Test02 {
    /**
     * 循环录入某学生5门课的成绩并计算平均分。如果某分数录入为负，停止录入并提示录入错误
     * 循环录入成绩，判断录入正确性。录入错误，使用break语句立刻跳出循环；否则，累加求和
     * 注意break只是跳出循环，如果后面都不想执行使用return
     */
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int sum=0;
            String name="姓名";
            System.out.println("请输入学生姓名：");
            name=sc.next();
            for (int i=1;i<=5;i++){
                System.out.println("请输入第"+i+"门课的成绩");
                double score=sc.nextDouble();
                if (score<0) {
                    System.out.println("抱歉，分数录入错误，请重新进行录入");
                    return;
                }
                sum+=score;
            }
            System.out.println(name+"同学的总成绩是："+sum);
            System.out.println(name+"同学的平均成绩是："+(sum/5));
        }
}
