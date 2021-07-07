import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

          String fname = "";
          String lname = "";
          String favoriteAnimal = "";
          String favoriteFood = "";
          String favoriteSong = "";

      System.out.println("Please enter your first name: ");
      fname = keyboard.nextLine();
      System.out.println("Please enter your last name: ");
      lname = keyboard.nextLine();
      System.out.println("Please enter your favorite animal: ");
      favoriteAnimal = keyboard.nextLine();
      System.out.println("Please enter your favorite food: ");
      favoriteFood = keyboard.nextLine();
      System.out.println("Please enter your favorite song: ");
      favoriteSong = keyboard.nextLine();

      System.out.println("Your first name is: " + fname);
      System.out.println("Your last name is: " + lname);
      System.out.println("Your favorite animal is: " + favoriteAnimal);
      System.out.println("Your favorite food is: " + favoriteFood);
      System.out.println("Your favorite song is: " + favoriteSong);
  }
}
