package reference.ex;

public class ProductOrderMain2 {
  public static void main(String[] args) {
    ProductOrder productOrder1 = createOrder("두부", 2000, 2);
    ProductOrder productOrder2 = createOrder("김치", 5000, 1);
    ProductOrder productOrder3 = createOrder("콜라", 1500, 2);

    ProductOrder[] productOrders = new ProductOrder[]{productOrder1, productOrder2, productOrder3};
    printOrders(productOrders);
    int totalAmount = getTotalAmount(productOrders);
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
