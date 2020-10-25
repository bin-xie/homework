package Homework.day06;

public class Test01 {

    //

    public static void main(String[] args) {
    int num=1;   //第一级
        switch (num){
        case 1:
            System.out.println("登陆系统");
            int num1=3;    //第二级
            switch (num1){
                case 1:
                    System.out.println("客户信息管理");
                    int num2=2;            //第三级
                    if (num2 == 1) {
                        System.out.println("显示所有客户信息");
                    }else if (num2==2){
                        System.out.println("添加客户信息");
                    }else if (num2==3){
                        System.out.println("修改客户信息");
                    }else {
                        System.out.println("查询客户信息");
                    }
                    break;
                case 2:    //第二级
                    System.out.println("购物结算");
                    break;
                case 3:
                    System.out.println("真情回顾");
                    int num3=1;           //第三级
                    if (num3==3){
                        System.out.println("幸运大放送");
                    }else if (num3==2){
                        System.out.println("幸运抽奖");
                    }else{
                        System.out.println("生日问候");
                    }
                    break;
                case 4:          //第二级
                    System.out.println("注销");
                    break;
            }
            break;
        default:       //第一级
            System.out.println("退出");
        }
    }
}

