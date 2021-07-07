import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter your user number.");
      userNum = scanner.nextInt();

      if(userNum > 0) {
        System.out.println("The entered user number " + userNum + " is positive" + "!");
      }
      else if(userNum <= 0) {
        System.out.println("The entered user number " + userNum + " is not positive" + "!");
      }
      scanner.close();
  }
}
