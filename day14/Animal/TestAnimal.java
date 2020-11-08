package Homework.day14.Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="欧欧";
       /* dog.health=100;   //健康值
        dog.love=0;//与主人亲密度
        //int age;
        //String strain;//品种*/
        dog.run();

        Penguin pen=new Penguin();
        pen.name="楠楠";
        /*pen.health=100;
        pen.love=0;*/

        pen.run();
    }
}
