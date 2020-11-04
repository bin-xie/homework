package Homework.day12;

public class Student {
    String name;
    int age;           //年龄
    String sex;        //性别
    double score;      //分数
    double weight;     //重量
    String address;    //住址

    public void Student(){
        System.out.println("我自我介绍一下：");
    }

    public void Student(String name){
        System.out.print("我叫"+name+"!");
    }

    public void Student(int age,String sex){
        System.out.print("今年"+age+"岁。性别"+sex);
    }

    public void Student(double weight,String address,double score){
        System.out.print(",重"+weight+"斤，来自"+address+"，去年的考试数学成绩为："+score+"分，有点没发挥好！");
    }

}
