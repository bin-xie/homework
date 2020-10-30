package Homework.day10;

public class Test01 {
    /**
     * 用选择排序来排列  2.6.1.9.3
     */
    /*
	1.原理 :从序列中找出最大的那个元素，然后放 到末尾
	2.忽略 曾找到最大元素
    原数据：  2.  6.  1.  9.  3
    第一次：  2	6	1	3	9
    第二次:	2	3	1	6
    第三次：	2	1	3
    第四次：	1	2*/
    public static void main(String[] args) {
        int[] num=new int[]{2,6,1,9,3};
        int max=num[0];

        for (int i=0;i<num.length;i++){
            //System.out.println(i);
            if (num[i]>max){
                max=num[i];
            }
            //printArray(num);
        }
        System.out.println(max);


        printArray(num);

    }
    public static void printArray(int[] num){
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
    }

}
