package Homework.day08;

public class Test05 {
    /**
     * 1~10之间的整数相加，得到累加值大于20的当前数
     * 使用循环进行累加，从1到10   判断累加值是否大于20
     *                         如果大于20，则跳出循环，并打印当前值
     */
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            if (sum<=20){
                sum=sum+i;
            }else if (sum>20){
                break;
            }
        }
        System.out.println(sum);
    }
}

