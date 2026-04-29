import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // write your code here
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int mark4=sc.nextInt();
        int mark5=sc.nextInt();

        if (mark1<0 || mark1>100 ||mark2<0 || mark2>100 || mark3<0 || mark3>100 || mark4<0 || mark4>100 || mark5<0 || mark5>100){
            System.out.println("Invalid input");
            return;
        }
        int totalMarks =(mark1+mark2+mark3+mark4+mark5);
        System.out.println("Total Marks: "+totalMarks);

        if (totalMarks>=450){
            System.out.println("Grade: A");
        }else if(totalMarks>=400 && totalMarks<450){
            System.out.println("Grade: B");
        }else if (totalMarks>=350 && totalMarks<400){
            System.out.println("Grade: C");
        }else if (totalMarks>=300 &&totalMarks<350){
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");
        }
        sc.close();

    }  



}