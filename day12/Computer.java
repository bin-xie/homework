package Homework.day12;

/**
 * 电脑类-重载
 */
public class Computer {
    String band;   //品牌
    double Price;  //价格
    String colour; //颜色
    double weight; //重量
    double time;   //时间

    public void network(){
        System.out.println("今天在京东上看到了一台电脑！");
    }

    public void network(String band,double price){    //上网
        System.out.print("是一台"+band+"笔记本电脑,"+"需要"+price+"块钱。");
    }

    public void network(String colour,double weight,double time) {  //电脑办公
        System.out.print("颜色是"+colour+",重"+weight+"kg,续航时间可达"+time+"小时。");
    }

    public void network(String band){
        System.out.print("虽然看中了这台"+band+"电脑，可惜就是有点囊中羞涩啊！");
    }
}