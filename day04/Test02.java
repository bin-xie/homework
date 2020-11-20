package Homework.day04;
public class Test02 {
    /**
     * 结算时打印购物小票   计算此次购物获得的会员积分
     */
    public static void main(String[] args) {
        int shirtPrice = 245;//T恤的单价
        int shoePrice = 570;//网球鞋的单价
        int racketPrice = 320;//网球拍的价格
        int shirtnum = 2;//T恤衫数量
        int shoenum = 1;//网球鞋数量
        int racketnum = 1;//网球拍数量
        double discount = 0.8;//折扣
        //折扣后共消费
        double consumption = (shirtPrice * shirtnum + shoePrice * shoenum + racketPrice * racketnum) * discount;

        int AReality = 1500;//实际交费
        double Change = AReality - consumption;   //找钱
        int integral = (int) consumption * 3 / 100;//本次购物所获得的积分

        //打印购物小票
        System.out.println("********************消费单据**********************\n");
        System.out.println("购买物品\t\t单价\t\t\t个数\t\t\t金额");
        System.out.println(" T恤\t\t￥245\t\t 2\t\t\t￥490");
        System.out.println("网球鞋\t\t￥570\t\t 1\t\t\t￥570");
        System.out.println("网球拍\t\t￥320\t\t 1\t\t\t￥320\n");
        System.out.println("折扣：\t\t\t\t\t8折");
        System.out.println("消费总金额\t\t\t\t￥" + consumption);
        System.out.println("实际交费\t\t\t\t\t￥" + 1500.0);
        System.out.println("找钱\t\t\t\t\t\t￥" + Change);
        System.out.println("本次购物所获得的积分是：\t\t" + integral);


//======答案======================================================================


        /*int shirtPrice = 245;   //Ｔ恤价格
        int shoePrice = 570;    //网球鞋价格
        int padPrice = 320;     //网球拍价格
        int shirtNo = 2;        //Ｔ恤件数
        int shoeNo = 1;         //运动鞋数目
        int padNo = 1;          //网球拍数目
        double discount = 0.8;  //折扣

        *//*计算消费总金额*//*
        double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
        //System.out.println("消费总金额：" + finalPay);
        *//*计算找钱*//*
        double returnMoney = 1500 - finalPay;

        *//*打印购物小票*//*
        System.out.println("＊＊＊＊＊＊＊*消费单*＊＊＊＊＊＊＊");
        System.out.println("购买物品\t" + "单价\t" + "个数\t" + "金额\t");
        System.out.println("Ｔ恤\t\t" + "￥" + shirtPrice + "\t" + shirtNo + "\t" + "￥" + (shirtPrice * shirtNo) + "\t");
        System.out.println("网球鞋\t" + "￥" + shoePrice + "\t" + shoeNo + "\t" + "￥" + (shoePrice * shoeNo) + "\t");
        System.out.println("网球拍\t" + "￥" + padPrice + "\t" + padNo + "\t" + "￥" + (padPrice * padNo) + "\t\n");
        System.out.println("折扣：\t\t8折");
        System.out.println("消费总金额\t" + "￥" + finalPay);
        System.out.println("实际交费\t\t￥1500");
        System.out.println("找钱\t\t\t" + "￥" + returnMoney);

        *//*计算本次购物所获积分*//*
        int score = (int) finalPay / 100 * 3; //强制类型转换
        System.out.println("本次购物所获的积分是： " + score);*/
    }
}
