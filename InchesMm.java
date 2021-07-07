public class InchesMm {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
    System.out.println("This program will convert the entered value in inches to millimeters" + "!");
    System.out.println("Please enter the length value in inches: ");
    double inchesInput = keyboard.nextDouble();
    double conversionValue = inchesInput * 25.4;
    System.out.print(String.format("\033[2J"));
    System.out.println(inchesInput + " inches" + " is equivalent to " + conversionValue + " millimeters.");
    //this app will convert the entered value in inches to millimeters.
  }
}
