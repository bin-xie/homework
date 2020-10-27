package Homework.day08;

public class Test01 {
    /**
     * 求1~100之间不能被3整除的数之和
     */
    public static void main(String[] args) {
        int sun=0;
        for (int i=0;i<100;i++){
            if (i%3!=0){
                sun=sun+i;
            }
        }
        System.out.println(sun);
    }
}
