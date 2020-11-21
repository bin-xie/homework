package Homework.day05;

import java.util.Scanner;

public class Test04 {
    /**
     * 学校举行运动会，百米赛跑跑入10秒内的学生有资格进决赛，根据性别分别进入男子组和女子组
     *       判断是否能够进入决赛    在确定进入决赛的情况下，判断是进入男子组，还是进入女子组
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int speed=10;  //赛跑速度 秒
        String sex="男";
        System.out.println("请输入您的速度：");
        speed=input.nextInt();
        if (speed<10){
            System.out.println("恭喜您已进入决赛！\n");
            System.out.println("请输入您的性别：");
            sex=input.next();
            if ("男".equals(sex)){
                System.out.println("进入男子组");
            }else {
                System.out.println("进入女子组");
            }
        }else {
            System.out.println("淘汰，请继续努力");
        }
    }
}
