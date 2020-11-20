package Homework.day05;

public class Test01 {
    public static void main(String[] args) {
        /**
         * 买彩票:如果体彩中了500万，我买车、资助希望工程、去欧洲旅游
         *      如果没中，我买下一期体彩，继续烧高香
         */
        int lottery = 500;  // 彩票 万
        if (lottery >= 500) {
            System.out.println("买车、资助希望工程、去欧洲旅游");
        } else {
            System.out.println("继续买下一期体彩，继续烧高香");
        }
    }
}
