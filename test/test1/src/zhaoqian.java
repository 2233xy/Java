public class zhaoqian {
    public static void main( String [] args){
            int shirtPrice=268;
            int shirtNo=3;
            int shoePrice=318;
            int shoeNo=2;
            double discount=0.8;
            double finalPay=(shirtPrice*shirtNo+shoePrice*shoeNo)*discount;
            double returnMoney=1200-finalPay;
            int score=(int)finalPay/100*3;
            System.out.println("\n**************************消费单据*****************************\n");
            System.out.println("购买物品\t"+"单价\t"+"数量\t"+"金额\t");
            System.out.println("衬衣\t"+"\t￥"+shirtPrice+"\t"+shirtNo+"\t"+"￥"+(shirtPrice*shirtNo)+"\t\n");
            System.out.println("运动鞋\t"+"\t￥"+shoePrice+"\t"+shoeNo+"\t"+"￥"+(shoePrice*shoeNo)+"\t\n");
            System.out.println("折扣：\t\t8折");
            System.out.println("金额总计\t"+"￥"+finalPay);
            System.out.println("实际付费\t￥1200");
            System.out.println("找钱\t"+"\t￥"+returnMoney);
            System.out.println("\n本次购物所获得的积分是："+score);
    }
}
