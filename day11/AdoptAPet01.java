package Homework.day11;

import java.util.Scanner;

public class AdoptAPet01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入要领养宠物的名字：");
        String name=input.next();
        System.out.print("请选择要领养的宠物类型：（1.狗狗\t 2.企鹅）");
        int type=input.nextInt();

        switch (type){
            case 1:
                //System.out.println("领养狗狗");
                System.out.print("请选择狗狗的品种：（1.聪明的拉布拉多犬\t2.酷酷的雪娜瑞）");
                int species=input.nextInt();
                System.out.println("宠物的自白：");

                AdoptAPet type1=new AdoptAPet();        //创建对象
                type1.name=name;                        //赋值姓名
                type1.print();                          //打印输出

                switch (species){
                    case 1:
                        System.out.print(",我是一只聪明的拉布拉多犬");
                        break;
                    case 2:
                        System.out.print(",我是一只酷酷的雪娜瑞");
                        break;
                    default:
                        System.out.println("您的输入有误");
                }
                break;
            case 2:
                System.out.print("请选择企鹅的性别：（1.Q仔\t2.Q妹）");
                int Gender=input.nextInt();
                System.out.println("宠物的自白：");

                AdoptAPet type2=new AdoptAPet();        //创建对象
                type2.name=name;                        //赋值姓名
                type2.print();                          //打印输出

                switch (Gender){
                    case 1:
                        System.out.println(",性别是：Q仔");
                        break;
                    case 2:
                        System.out.println(",性别是：Q妹");
                        break;
                    default:
                        System.out.println("您的输入有误");
                }
                break;
            default:
                System.out.println("您的输入有误");
        }
    }
}
