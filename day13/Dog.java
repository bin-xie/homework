package Homework.day13;

public class Dog {
    private String name;
    private int age;
    private String sex;
    private int health;//健康值
    private int love;//与主人亲密度
    private String strain;//品种

//----------------------------------------------------------------

   /* public void  setAge(int age){
        if (age>0 && age<29) {     //长寿的狗是一只澳大利亚牧牛犬，他足足活到了29岁
            this.age=age;
        }else {
            this.age=1;
            System.out.println("你输入的年龄有误，默认1岁");
        }
    }

    public int getAge(){
        return this.age;
    }

//--------------------------------------------------------------

    public void setHealth(int health){   //健康值1~100之间
        if (health>=0 && health<=100){
            this.health=health;
        }else {
            this.health=0;
            System.out.println("你输入的健康值有误，默认为0");
        }
    }

    public int getHealth(){
        return this.health;
    }*/

 //--------------------------------------------------------------

    public void setSex(String sex){
        if ("公".equals(sex) ){
            this.sex=sex;
        }else {
            System.out.println("默认性别为公");
        }
    }

    public String getSex(){
        return this.sex;
    }
}
