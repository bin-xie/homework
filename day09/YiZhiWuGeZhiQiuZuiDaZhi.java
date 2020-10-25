package Homework.day09;

import java.util.Scanner;

public class YiZhiWuGeZhiQiuZuiDaZhi {

        //  4.7.8.1.60求出数组中的最大值
    public static void main(String[] args) {

        int val[]={4,7,8,1,60};
        int max;
        max=val[0];
        for (int i=1;i<val.length;i++){
            if (val[i]>max){
                max=val[i];
            }
        }
        System.out.println(max);
    }
}
