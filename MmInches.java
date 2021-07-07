public class MmInches {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    System.out.println("This program will convert the entered value of millimeters to inches");
    System.out.println("Please enter the length value in mm:");
    double mmValueInput = keyboard.nextDouble();
    double conversionValue = mmValueInput / 25.4;
    System.out.print(String.format("\033[2J"));
    System.out.println(mmValueInput + " millimeters" + " is equivalent to " + conversionValue + " inches.");
    //This app will convert millimeters to inches
  }
}
