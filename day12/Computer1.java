package Homework.day12;

public class Computer1 {
    String band;   //品牌
    double Price;  //价格
    String colour; //颜色
    double weight; //重量
    double time;   //时间

    public Computer1(){
        System.out.println("无参");
    }

    public Computer1(String band, double Price, String colour,double weight, double time){
         this.band="华为";   //品牌
         this.Price=3000.0;  //价格
         this.colour="钛空银"; //颜色
         this.weight=140; //重量
         this.time=8;   //时间

    }
}
