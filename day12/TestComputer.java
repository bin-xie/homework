package Homework.day12;

/**
 * 电脑类测试-重载
 */
public class TestComputer {
    public static void main(String[] args) {
        /*String band="华硕";   //品牌
        double Price=5000;  //价格
        String colour="亮闪银"; //颜色
        double weight=1.4; //重量kg
        double time=8;   //时间*/

        Computer com=new Computer();
        com.network();
        com.network("华硕",5000);   //String band、double Price
        com.network("亮银色",1.4,8);   //String colour、double weight、double time
        com.network("华硕");
    }
}
