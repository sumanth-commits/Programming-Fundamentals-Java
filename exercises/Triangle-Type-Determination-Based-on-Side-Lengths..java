import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to determine the type of triangle based on 'side1', 'side2', 'side3' goes here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a+b<=c || b+c<=a || c+a<=b){
            System.out.println("Not a valid triangle");
        }
        else if(a==b && b==c){
            System.out.println("Equilateral");
        }else if(a==b || b==c || c==a){
            System.out.println("Isosceles");
        }else{
             System.out.println("Scalene");
        }

        scanner.close();

    }

}