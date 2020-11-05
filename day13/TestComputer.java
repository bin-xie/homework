package Homework.day13;

public class TestComputer {
    public static void main(String[] args) {

        Computer com=new Computer();
        com.setBand("华硕");
        System.out.println(com.getBand());

        com.setPrice(5000.0);
        System.out.println(com.getPrice());

        com.setColour("金色");
        System.out.println(com.getColour());

        com.setWeight(500.0);
        System.out.println(com.getWeight());

        com.setTime(8);
        System.out.println(com.getTime());
    }
}
