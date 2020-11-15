package Homework.day011;

public class Student {    //学生类
    /**
     * 创建 学生类 手机类 电脑类
     * 1．各5个属性以上 包括 int  String double char 类型属性
     * 2．创建3个方法  无参方法  有参方法 两个参数方法
     * 3．创建测试类测试 学生类 手机类 电脑类
     */

    String name;       //姓名
    char sex;          //性别
    int age;           //年龄
    double score;      //得分
    String ranking;    //排名

    public void sleep(int hour){
        System.out.println("休息"+hour+"小时");
    }

    public void study(){
        System.out.println("学习两小时");
    }

    public void print() {
        System.out.println("我叫:" + name + ",性别:" + sex + ",现在:" + age
                + "岁,这回考试考了:" + score + "分，班级排:" + ranking + "名!");
    }
}

class CellPhone {       //手机类
    String brand;          //品牌
    double size;           //尺寸
    int weight;         //重量
    char colour;           //颜色
    String model;             //型号

    public void print() {
        System.out.println("手机还可以发短信");
    }
    public String reward(String name){        //reward奖励
        System.out.println("刚刚还看到"+name+"正在那刷抖音");
        return name;
    }


    public double video(double score , int houre){
        System.out.println("这次考试如果得了："+score+"分，就可以玩"+houre+"小时手机");
        return score;
    }
    public void MyCellPhone(){
        System.out.println("我刚买的"+brand+"手机，"+brand+model+size+"寸，重"+weight+"克,颜色是"+colour+"色");
    }

}

class Computer {           //电脑类
    String brand;          //品牌
    double capacity;        //电池容量
    double weight;         //重量
    char colour;           //颜色
    int size;             //型号

    public void print1() {
        System.out.println("电脑就是用来办公的");
    }

    public String computer(String name2){
        System.out.println("这台电脑是"+name2+"的!");
        return name2;
    }

    public double video1(double score , int houre){
        System.out.println("这次考试如果低于："+score+"分，每星期只能玩"+houre+"小时电脑");
        return score;
    }
    public void print2(){
        System.out.println("这台电脑的品牌是"+brand+"，它的电池容量是"+capacity+
                "小时，重量为："+weight+"千克，颜色是："+colour+"色，他的尺寸是："+size+"英寸");
    }
}
