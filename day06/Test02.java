package Homework.day06;
import java.util.Scanner;
public class Test02 {
    /**
     * 购物结算：
     * 普通顾客购物满100元  9折       请输入是否是会员：是（Y）/否（其他字符）        y
     * 会员购物           8折       请输入购物金额                             320
     * 会员购物满200       7.5折     实际支付                                 240.0
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入是否是会员：是（Y）/否（其他字符）");
        String member = input.next();
        System.out.println("请输入购物金额");
        double money = input.nextDouble();
        //判断是否是会员
        if (member.equals("Y")) {
            if (money >= 200) {     //是会员满200就0.75折
                System.out.println("实际支付:"+ money*75/100);
            } else {                //是会员就0.8折
                System.out.println("实际支付:"+money*80/100);
            }
        }else if (money >= 100){     //不是会员就0.9折
            System.out.println("实际支付:"+money*90/100);
        }
    }
}
