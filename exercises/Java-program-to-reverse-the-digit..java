import java.util.Scanner; 

public class Solution { 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    // Write your code here 
    int num=scanner.nextInt();
    int reverse=0;
    int digit;
    while(num>0){
        digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
        
    }
    System.out.println(reverse);

    scanner.close(); 
   } 

} 