package Homework.day03;

public class Test04 {
    /**
     * 结算时打印购物小票   计算此次购物获得的会员积分
     */
    public static void main(String[] args) {
        /*System.out.println("************************消费单据**************************\n");
        System.out.println("购买物品\t\t\t\t单价\t\t\t个数\t\t\t金额\n");
        System.out.println(" T恤\t\t\t\t￥245\t\t\t 2\t\t\t\t￥490\n");
        System.out.println("网球鞋\t\t\t\t￥570\t\t\t 1\t\t\t\t￥570\n");
        System.out.println("网球拍\t\t\t\t￥320\t\t\t 1\t\t\t\t￥320\n\n\n");
        System.out.println("折扣：\t\t\t\t\t 8折\n");
        System.out.println("消费总金额\t\t\t\t￥1104.0\n");
        System.out.println("实际交费\t\t\t\t\t￥1500.0\n");
        System.out.println("找钱\t\t\t\t\t￥360.0\n");
        System.out.println("本次购物所获得的积分是：  33分\n");*/



        int shirtPrice = 245; //Ｔ恤价格
        int shoePrice = 570;  //网球鞋价格
        int padPrice = 320;   //网球拍价格
        int shirtNo = 2;        //Ｔ恤件数
        int shoeNo = 1;        //运动鞋数目
        int padNo = 1;        //网球拍数目
        double discount = 0.8;

        /*计算消费总金额*/
        double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
        //System.out.println("消费总金额：" + finalPay);
        /*计算找钱*/
        double returnMoney = 1500 - finalPay;

        /*打印购物小票*/
        System.out.println("＊＊＊＊＊＊＊*消费单*＊＊＊＊＊＊＊");
        System.out.println("购买物品\t" + "单价\t" + "个数\t" + "金额\t");
        System.out.println("Ｔ恤\t\t" + "￥" + shirtPrice + "\t" + shirtNo + "\t" + "￥" + (shirtPrice * shirtNo) + "\t");
        System.out.println("网球鞋\t" + "￥" + shoePrice + "\t" + shoeNo + "\t" + "￥" + (shoePrice * shoeNo) + "\t");
        System.out.println("网球拍\t" + "￥" + padPrice + "\t" + padNo + "\t" + "￥" + (padPrice * padNo) + "\t\n");
        System.out.println("折扣：\t\t8折");
        System.out.println("消费总金额\t" + "￥" + finalPay);
        System.out.println("实际交费\t\t￥1500");
        System.out.println("找钱\t\t\t" + "￥" + returnMoney);

        /*计算本次购物所获积分*/
        int score = (int) finalPay / 100 * 3; //强制类型转换
        System.out.println("本次购物所获的积分是： " + score);
    }
}
