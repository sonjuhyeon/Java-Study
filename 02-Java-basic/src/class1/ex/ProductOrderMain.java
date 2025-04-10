package class1.ex;

public class ProductOrderMain {
  public static void main(String[] args) {
    ProductOrder tofu = new ProductOrder();
    ProductOrder kimchi = new ProductOrder();
    ProductOrder coke = new ProductOrder();

    tofu.productName = "두부";
    tofu.price = 2000;
    tofu.quantity = 2;

    kimchi.productName = "김치";
    kimchi.price = 5000;
    kimchi.quantity = 1;

    coke.productName = "콜라";
    coke.price = 1500;
    coke.quantity = 2;

    ProductOrder[] productOrders = new ProductOrder[]{tofu, kimchi, coke};
    int totalPrice = 0;
    for (ProductOrder productOrder : productOrders){
      totalPrice += productOrder.price;
      String result = String.format("상품명: %s, 가격: %d, 수량: %d", productOrder.productName, productOrder.price, productOrder.quantity);
      System.out.println(result);
    }
    System.out.println("총 결제 금액: " + totalPrice);
  }
}
