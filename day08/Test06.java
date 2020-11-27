package Homework.day08;


import java.util.Scanner;

public class Test06 {
    /**
     * 循环录入Java课的学生成绩，统计分数大于等于80分的学生比例
     * 通过循环，获得分数大于等于80分的学生人数num
     * 判断：如果成绩<80，不执行num++，直接进入下一次循环
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int j=0;    //大于80分的学生人数
        System.out.print("输入班级总人数:");
        int total=input.nextInt();      //total总人数
        for (int i=1;i<=total;i++){
            System.out.print("请录入第"+i+"位学生的成绩:");
            double score=input.nextDouble();
            if (score>=80){
                j++;
            }else if (score<80){
                continue;
            }
        }
        System.out.println("80分以上的学生人数是:"+j);
        System.out.println("80分以上的学生所占的比例为:"+(double)j/5*100+"%");
    }



    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;      //num 班级总人数
        int num1=0;     // 得分80以上
        System.out.print("输入班级总人数:");
        num=sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.print("请输入第"+i+"位学生的成绩：");
            double score=sc.nextDouble();
            if (score<80){
                continue;
            }
            num1++;
        }
        System.out.println("80分以上的学生人数是:"+num1);
        double rate = num1 *1.0 / num * 100;                //计算比例
        System.out.println("80分以上的学生所占的比例为：" + rate + "%");
    }*/
}
