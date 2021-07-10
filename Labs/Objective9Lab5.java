import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
      double num1, num2;
      boolean keepGoing = true;
      int choice;

    System.out.println("Please input a number: ");
      num1 = kb.nextDouble();

    System.out.println("Please input another number: ");
      num2 = kb.nextDouble();

        while (keepGoing) {
          printMenu();
          System.out.println("Which would you like to do? ");
          choice = kb.nextInt();

          switch (choice) {
            case 1:
            double sum = findSum(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
            continue;
            case 2:
            double average = findAvg(num1, num2);
            System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
            continue;
            case 3:
            double tax = calcTax(num1, num2);
            System.out.println("The amount of tax to be collected on purchase of " + num1 + " and " + num2 + " is " + tax);
            continue;
            case 4:
            System.out.println("You've chosen to quit.");
            break;
            default:
            System.out.println("Invalid entry. Please try again");
          }
          kb.close();
}
}
    public static void printMenu() {
      System.out.println();
      System.out.println("========= MENU =========");
      System.out.println("|                      |");
      System.out.println("|    1. Add Numbers    |");
      System.out.println("|    2. Find Average   |");
      System.out.println("|    3. Calculate Tax  |");
      System.out.println("|    4. Exit           |");
      System.out.println("|                      |");
      System.out.println("========================");
      System.out.println();
    }
    public static double findSum(double x, double y) {
      double sum = x + y;
      return sum;
    }
    public static double findAvg(double x, double y) {
      double average = (x + y) / 2;
      return average;
    }
    public static double calcTax(double x, double y) {
      double tax = (x + y) * 0.0831;
      return tax;
    }
  }
