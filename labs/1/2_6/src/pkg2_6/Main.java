package pkg2_6;

import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x;
    System.out.print("Please provide a integer that is postitve: ");
    x = in.nextInt();
    if (x <= 0)
    System.out.println("Oops!  I see a negative integer was entered,"
            + " please try again, as they are invalid");
    else {
    int sum = 0;
    while (x != 0) {
    sum += x % 10;
    x /= 10;
    }
     System.out.println("Sum of digits: " + sum);
    }
  }
}