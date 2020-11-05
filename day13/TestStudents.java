package Homework.day13;
public class TestStudents {
    public static void main(String[] args) {

        Students stu=new Students();
        stu.setName("张三");
        System.out.println(stu.getName());

        stu.setAge(18);
        System.out.println(stu.getAge());

        stu.setSex("男");
        System.out.println(stu.getSex());

        stu.setScore(91.0);
        System.out.println(stu.getScore());

        stu.setWeight(120.0);
        System.out.println(stu.getWeight());

        stu.setAddress("湖北");
        System.out.println(stu.getAddress());
    }
}
