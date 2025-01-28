package section3_ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();


        ProductOrder2[] order = new ProductOrder2[n];
        for (int i = 0; i< order.length; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력 하세요.");

            System.out.println("상품명: ");
            String productName = sc.nextLine();

            System.out.println("가격: ");
            int price = sc.nextInt();

            System.out.println("수량: ");
            int quantity = sc.nextInt();

            sc.nextLine(); // 입력 버퍼 비우기

            order[i] = createOrder(productName, price, quantity);

        }

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
