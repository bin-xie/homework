package Homework.day07;

public class Test02 {
    /**
     * 2012年培养学员25万人，每年增长25%。请问按此增长速度，到哪一年培训学员人数将达到100万人？
     */
    public static void main(String[] args) {
        int year=2012;     //年
        double students=250000;     //2012年学员数量
        //2013年学员数量=250000*(1+0.25)
        int i=1;
        while (students<=1000000){
            year++;
            students *= 1.25;     //每年学院增长0.25

        }
        System.out.println("在"+year+"年时,培训学员人数将达到"+(int)(students)+"万人");
    }
}
