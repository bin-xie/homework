package Homework.day13;

public class TestPC {
    public static void main(String[] args) {
        Phone1 ph=new Phone1();
        ph.band="华为";
        ph.Price=2800.0;
        ph.colour="金色";
        ph.weight=120.0;
        ph.network();
        System.out.println(ph.band+"\t"+ph.Price+"\t"+ph.colour+"\t"+ph.weight);

        Computer1 com=new Computer1();
        com.band="华硕";
        com.Price=5100.0;
        com.colour="黑";
        com.weight=520.0;
        com.time=8;
        com.network();
        System.out.println(com.band+"\t"+com.Price+"\t"+com.colour+"\t"+com.weight+"\t"+com.time);

    }
}

class Pc{   //手机电脑父类

    String band;   //品牌
    double Price;  //价格
    String colour; //颜色
    double weight; //重量

    public void network(){
        System.out.println("能上网....");
    }

}

class Phone1 extends Pc {

    public void network(){
        System.out.println("手机能上网刷抖音....");
    }
    public void Telephone(){
        System.out.println();
    };  //"打电话"
}

class Computer1 extends Pc{
    double time;   //时间

    public void network(){
        System.out.println("电脑能上网玩网络游戏....");
    }
    public void game(){};  //"玩网络游戏"
}