package Homework.day011;

public class TestStudent01 {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.name="张三";      //姓名
        stu.sex='男';         //性别
        stu.age=18;          //年龄
        stu.score=80.0;      //得分
        stu.ranking="第十";   //排名

        stu.sleep(2);
        stu.study();
        stu.print();

 //==================================================

        CellPhone cle=new CellPhone();

        cle.brand="华为";       //品牌
        cle.size=5.5;          //尺寸
        cle.weight=198;         //重量克
        cle.colour='金';        //颜色
        cle.model="P40";       //型号

        cle.print();
        cle.reward("李四");
        cle.video(90,2);
        cle.MyCellPhone();


 //======================================================

        Computer com=new Computer();

        com.brand="华硕";       //品牌
        com.capacity=42;       //电池容量
        com.weight=1;         //重量千克
        com.colour='黑';        //颜色
        com.size=14;         //英寸

        com.print1();
        com.computer("王小二");
        com.video1(70,2);
        com.print2();



    }
}
