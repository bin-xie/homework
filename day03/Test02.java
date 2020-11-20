package Homework.day03;
import java.util.Scanner;
public class Test02 {
    /**
     * 输入天数 求有多少周 多少天
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("请输入天数：");
        int day=sc.nextByte();
        int week=day/7;                 //求出多少周
        System.out.println("总共有："+week+"周");
        int Remaining=day%7;            //剩余多少天
        System.out.println("剩余天数:"+Remaining);
    }
}
