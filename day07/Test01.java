package Homework.day07;

public class Test01 {
    /**
     * 计算100以内的偶数之和
     */
    public static void main(String[] args) {
        int i=1;  //初始化语句
        int sum=0;
        while (i<=100){     //条件判断
            if (i % 2 == 0){    //判断是否是偶数
                sum=sum+i;      //求和
            }
            i++;    //迭代部分
        }
        System.out.println(sum);


        do {
            if (i % 2 == 0){
                sum+=i;
            }
            i++;
        }while (i<=100);
        System.out.println(sum);

 //==============================================

        /*int i=2;  //初始化语句   //int i=1,求的就是奇数和
        int sum=0;
        while (i<=100){     //条件判断
            if (i % 2 == 0){    //判断是否是偶数
                sum=sum+i;      //求和
            }
            i+=2;    //迭代部分
        }
        System.out.println(sum);*/

    }
}
