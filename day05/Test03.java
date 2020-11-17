package Homework.day05;

public class Test03 {
    /**
     * 买彩票
     * 如果体彩中了500万，我买车、资助希望工程、去欧洲旅游
     * 如果没中，我买下一期体彩，继续烧高香
     */
    public static void main(String[] args) {
        int Lottery=499;
        if (Lottery>=500){
            System.out.println("我买车、资助希望工程、去欧洲旅游");
        }
        if (Lottery<500) {
            System.out.println("如果没中，我买下一期体彩，继续烧高香");
        }
    }
}
