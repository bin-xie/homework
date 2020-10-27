package Homework.day08;

import java.util.Scanner;

public class Test08 {
    /**
     * 用户登录验证，验证次数最多3次
     */
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name="j";
        int password=123456;
        for (int i=3;i>0;){
            System.out.print("请输入用户名：");
            name = input.next();
            System.out.print("请输入密码：");
            password = input.nextInt();
            if (name.equals("j") && password==123456 ){
                System.out.println("欢迎登录MyShopping系统！");
                return;
            }else {
                i--;
                System.out.println("输入错误！您还有"+  i +"次机会\n");
                continue;
            }
        }System.out.println("对不起您三次均输入错误");

    }
}
