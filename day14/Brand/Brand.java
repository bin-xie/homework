package Homework.day14.Brand;

public class Brand {
    String brand="华为";

    public Brand(){
        System.out.println(brand);
    }
    public Brand(String brand){
        this.brand=brand;
        System.out.println(brand);
    }
}

class Electronics extends Brand{   //数码产品
    String phone="P30";
    public Electronics(){
        super();
        System.out.println(phone);
    }
    public Electronics(String brand1){
        super(brand1);
        System.out.println(phone+brand1);
    }
}

class Computer extends Electronics{    //电脑
    String computer="MateBook";
    public Computer(){
        super();
        System.out.println(computer);
    }
    public Computer(String brand2){
        super(brand2);
        System.out.println(computer+brand2);
    }
}

class MainBoard extends Computer{    //主板
    String mainBoard="鲲鹏";
    public MainBoard(){
        super();
        System.out.println(mainBoard);
    }
    public MainBoard(String brand3){
        super(brand3);
        System.out.println(mainBoard+brand3);
    }
}