import java.util.Scanner;


public class Solution{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to calculate the factorial of 'n' using do-while loop goes here
        int n=scanner.nextInt();
       int fact =1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        scanner.close();

    }

}