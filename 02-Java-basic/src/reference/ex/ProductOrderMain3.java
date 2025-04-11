package reference.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요: ");
    int n = scanner.nextInt();
    scanner.nextLine();

    ProductOrder[] orders = new ProductOrder[n];

    for (int i = 0; i < orders.length; i++) {
      System.out.println((i + 1) + "번째 주문정보를 입력하세요");

      System.out.print("상품명: ");
      String productName = scanner.nextLine();

      System.out.print("가격: ");
      int price = scanner.nextInt();
      scanner.nextLine();

      System.out.print("수량: ");
      int quantity = scanner.nextInt();
      scanner.nextLine();

      orders[i] = createOrder(productName, price, quantity);
    }
    printOrders(orders);
    int totalAmount = getTotalAmount(orders);
    System.out.println("총 결제 금액: " + totalAmount);
  }

  static ProductOrder createOrder(String productName, int price, int quantity) {
    ProductOrder productOrder = new ProductOrder();
    productOrder.productName = productName;
    productOrder.price = price;
    productOrder.quantity = quantity;

    return productOrder;
  }

  static void printOrders(ProductOrder[] orders) {
    for (ProductOrder order : orders) {
      System.out.println((String.format("상품명: %s, 가격: %d, 수량: %d", order.productName, order.price, order.quantity)));
    }
  }

  static int getTotalAmount(ProductOrder[] orders) {
    int totalAmount = 0;
    for (ProductOrder order : orders) {
      totalAmount += order.price * order.quantity;
    }
    return totalAmount;
  }
}
