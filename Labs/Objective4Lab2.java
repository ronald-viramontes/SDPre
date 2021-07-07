import java.util.Scanner;
public class Objective4Lab2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0, dub2 = 0, dub3 = 0;

    System.out.println("Please enter a whole number value.");
    num1 = keyboard.nextInt();
    System.out.println("Please enter another whole number value.");
    num2 = keyboard.nextInt();
    System.out.println("Please enter another whole number value.");
    num3 = keyboard.nextInt();
    System.out.println("Please enter a decimal value.");
    dub1 = keyboard.nextDouble();
    System.out.println("Please enter another decimal value.");
    dub2 = keyboard.nextDouble();
    System.out.println("Please enter another decimal value.");
    dub3 = keyboard.nextDouble();

    int intSum = num1 + num2 + num3;
    double doubleSum = dub1 + dub2 + dub3;

    System.out.println("The three whole number values entered are: " + num1 + ", " + num2 + ", " + num3 +
    " The sum of the values is: " + intSum);
    System.out.println("The three decimal values entered are: " + dub1 + ", " + dub2 + ", " + dub3 +
    "The sum of the values is: " + doubleSum);

  }
}
