package Homework.day06;
import java.util.Scanner;
public class Test03 {
    /**
     * 会员购物时，根据积分的不同享受不同的折扣
     *计算会员购物时获得的折扣
     *     会员积分　　　　　　　  折扣　　　　　　　　　　　　　　 //请输入会员积分：3420
     *     X < 2000　　　　　　   9折　　　　　　　　　　　　　　 //该会员享受的折扣是：0.8
     * 2000 <= x <4000　　　　　　8折
     * 4000 <= X <8000　　　　　　7折
     *     X  >=　8000          6折
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入会员积分");
        int integral=sc.nextInt();
        if (integral<2000){
            System.out.println("该会员享受的折扣是：0.9折");
        }else if (integral>= 2000 && integral<4000){
            System.out.println("该会员享受的折扣是：0.8折");
        }else if (integral>= 4000 && integral<8000){
            System.out.println("该会员享受的折扣是：0.7折");
        }else if (integral>= 8000 ){
            System.out.println("该会员享受的折扣是：0.6折");
        }
    }
}
