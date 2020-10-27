package Homework.day08;

public class Test04 {
    public static void main(String[] args) {
        /**
         * 99乘法表
         */
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
