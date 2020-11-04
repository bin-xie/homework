package Homework.day12;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph=new Phone();
        ph.network();
        ph.network("华为");   //String band
        ph.network(3000,"钛空银");   //double Price,String colour
        ph.network("华为",3000);   //String band,double Price
    }
}
