package Homework.day13;

public class Computer {
    /**
     * 电脑类
     */
    private String band;   //品牌
    private double price;  //价格
    private String colour; //颜色
    private double weight; //重量
    private double time;   //时间

    public void setBand(String band){
        this.band=band;
    }
    public String getBand(){
        return this.band;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }

    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return this.colour;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return this.weight;
    }

    public void setTime(double time){
        this.time=time;
    }
    public double getTime(){
        return this.time;
    }
}
