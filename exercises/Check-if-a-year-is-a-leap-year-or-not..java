import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to check if 'year' is a leap year goes here
        int num = scanner.nextInt();

        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        scanner.close();

    }

}