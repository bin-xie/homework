package Homework.day08;

import java.util.Scanner;

public class Test003 {
    /**
     * 计算顾客比例：商场对顾客的年龄层次进行调查。计算各年龄层次的顾客比例,求出30岁以上和以下的比例！
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int j=0;
        for (int i=1;i<=10;i++){
            System.out.print("请输入第"+i+"顾客的年龄：");
            int age=input.nextInt();
            if (age<=30){
                j++;
            }
        }
        System.out.println("30岁以下的比例是："+j*100/10+"%");
        System.out.println("30岁以上的比例是："+(10-j)*100/10+"%");
    }

    /**
     * 99乘法表
     */
   /* public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++) {
                System.out.print(j + "*" + i + "=" + i * j+"\t");
            }
            System.out.println();
        }
    }*/

    /**
     * 1~10之间的整数相加，得到累加值大于20的当前数
     *  使用循环进行累加，从1~10,判断累加值是否大于20,如果大于20，则跳出循环，并打印当前值
     *
     */
    /*public static void main(String[] args) {
        int sum=0;    //和
        for (int i=1;i<=10;i++){
                sum+=i;
                if (sum>20){    //和大于20跳出循环
                break;
            }
        }
        System.out.println(sum);
    }*/

    /**
     * 循环录入Java课的学生成绩，统计分数大于等于80分的学生比例
     * 通过循环，获得分数大于等于80分的学生人数num
     * 判断：如果成绩<80，不执行num++，直接进入下一次循环
     */
    /*public static void main(String[] args) {
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
    }*/

    /**
     * 循环录入3位会员的信息  会员号合法，显示录入信息；否则显示录入失败
     */
    /*public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入会员号（4位整数）:");
            int number = input.nextInt();               // number会员号
            System.out.print("请输入会员生日（月/日<用两位整数表示>）:");
            String birthday = input.next();       // birthday生日
            System.out.print("请输入会员积分:");
            int integral = input.nextInt();             // integral积分

            if (number > 9999 || number < 1000) {
                System.out.println("你输入的会员号" + number + "是无效会员号");
                System.out.println("录入失败！\n");
                continue;
            }
            System.out.println("您录入的会员信息是:\n" + number + "\t" + birthday + "\t" + integral + "\n");
        }
        System.out.println("程序结束！");
    }*/

    /**
     * 用户登录验证，验证次数最多3次
     */
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1,j=3; i <= 3; i++) {
            String name="jim";
            int password=123456;
            System.out.print("请输入用户名:");
            name = input.next();
            System.out.print("请输入密码:");
            password = input.nextInt();
            if ("jim".equals(name) && password==123456) {
                System.out.println("欢迎登录MyShopping系统!");
                return;
            }else {
                j--;
                if (j==0){
                    System.out.println("对不起，您三次均输入错误");
                }else {
                    System.out.println("输入错误!您还有"+j+"次机会\n");
                }
            }
        }
    }*/


}
