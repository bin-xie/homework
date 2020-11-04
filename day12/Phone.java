package Homework.day12;

public class Phone {
    String band;   //品牌
    double Price;  //价格
    String colour; //颜色
    double weight; //重量



    public void network() {
        System.out.println("这部手机快要坏了，该买新手机了。");
    }

    public void network(String band){
        System.out.print("今天刚买了一部新手机"+"是"+band+"的。");
    }

    public void network(double Price,String colour){
        System.out.print("花了"+Price+"块，颜色我很喜欢，是"+colour+"的。");
    }

    public void network(String band,double Price){
        System.out.print("个人感觉买的这部"+band+"手机性价比很高，必进才花了"+Price+"块钱，感觉值");
    }



     /*public void network() {}        //上网
    public void conversation() {}   //打电话
    public void information(){}     //短信
    public void photograph(){}      //拍照*/









}
