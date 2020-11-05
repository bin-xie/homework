package Homework.day13;
public class Students {
    /**
     * 学生类
     */
    String name;
    int age;           //年龄
    String sex;        //性别
    double score;      //分数
    double weight;     //重量
    String address;    //住址

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return this.sex;
    }

    public void setScore(double score){
        this.score=score;
    }
    public double getScore(){
        return this.score;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return this.weight;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
}
