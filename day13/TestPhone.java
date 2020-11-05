package Homework.day13;

public class TestPhone {
    public static void main(String[] args) {

        Phone ph=new Phone();
        ph.setBand("华为");
        System.out.println(ph.getBand());

        ph.setPrice(3000.0);
        System.out.println(ph.getPrice());

        ph.setColour("金色");
        System.out.println(ph.getColour());

        ph.setWeight(140.0);
        System.out.println(ph.getWeight());
    }
}
