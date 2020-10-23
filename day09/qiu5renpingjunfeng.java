package homework.day09;

public class qiu5renpingjunfeng {
    public static void main(String[] args) {
        int age=0;
        int sum=0;
        double num[]=new double[]{50,90,20,40,10};
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        //System.out.println(sum);
        age=sum/num.length;

        //avg=(num[0]+num[1]+num[2]+num[3]+num[4])/5;
        System.out.println(age);
    }
}
