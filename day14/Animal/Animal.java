package Homework.day14.Animal;

public class Animal{


    String name;
    int health=100;   //健康值
    //int age;
    int love=0;//与主人亲密度
    public void run(){
        System.out.print("宠物的自白：\n我的名字叫"+name+",健康值是"+health+",和主人的亲密度是" +
                +love+"\n");
    }
}

class Dog extends Animal{
    //String strain;//品种

}

class Penguin extends Animal{
    String sex;

}