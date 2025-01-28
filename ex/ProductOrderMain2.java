package section3_ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder2[] order = new ProductOrder2[3];
        order[0] = createOrder("뿌요뿌요", 1200, 10);
        order[1] = createOrder("제티", 500, 15);
        order[2] = createOrder("짜요짜요", 4500, 12);

        printOrders(order);
        int totalAmount = getTotalAmount(order);
        System.out.println("총 주문 금액 : " + totalAmount);
    }

    static ProductOrder2 createOrder(String productName, int price, int quantity){
        ProductOrder2 po2 = new ProductOrder2();
        po2.productName = productName;
        po2.price = price;
        po2.quantity = quantity;
        return po2;
    }

    static void printOrders(ProductOrder2[] orders){
        for (ProductOrder2 order : orders) {
            System.out.println(" 제품 명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity );
        }
    }

    static int getTotalAmount(ProductOrder2[] orders){
        int totalAmount = 0;
        for (ProductOrder2 order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
