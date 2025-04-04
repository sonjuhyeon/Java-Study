package scanner;

import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();  // 여기서 숫자 입력

    System.out.print("이름을 입력하세요: ");
    String name = scanner.nextLine();  // 이름 입력?
    System.out.println("입력된 이름: " + name);

  }
}
