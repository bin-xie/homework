package Homework.day05;

import java.util.Scanner;
public class Test01 {
    /**
     * 如果10秒可以内进入决赛，有男子组与女子组
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的决赛速度:");
        int time=input.nextInt();
        if (time <= 10) {
            System.out.println("你已进入决赛!");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的性别：");
            String gender = input.next();
            if (gender.equals("男")) {
                System.out.println("进入男子组");
            }else{
                System.out.println("进入女子组");
            }
        }
        else{
            System.out.println("下次再努力一点点,退出比赛");
        }
    }
}
