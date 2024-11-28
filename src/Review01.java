
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;//商品価格
        double tax = 0.1;//消費税10%

        int result = tax (price,tax);
        //税込価格 = 1500(商品価格) + 150(消費税額)
        System.out.println( price +"円の商品の税込価格は" + (price +  result) +"円(消費税は" + result + "円)です。");

    }

    public static int tax (int price,double tax) {
        //消費税額=商品価格×10%を出したい
        int result = (int) (price * tax);
        return result ;

    }


}


