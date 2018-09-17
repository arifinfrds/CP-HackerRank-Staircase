import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    if (!isInputValid(n)) {
      return;
    }

    int numberOfBlankSpaceColumn = n - 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < numberOfBlankSpaceColumn; j++) {
        System.out.print(" ");
      }
      numberOfBlankSpaceColumn--;

      for (int j = 0; j < i + 1; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }

  private static boolean isInputValid(int value) {
    return (value > 0) && (value <= 100);
  }

}
