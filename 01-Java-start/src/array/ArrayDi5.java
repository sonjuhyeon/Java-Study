package array;

public class ArrayDi5 {
  public static void main(String[] args) {
    int[][] arr = new int[10][10];

    int i = 1;
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        arr[row][column] = i++;
      }
    }

    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {
        System.out.print(arr[row][column] + " ");
      }
      System.out.println();//한 행이 끝나면 라인을 변경한다.
    }
  }
}
