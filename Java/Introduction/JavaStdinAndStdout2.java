import java.util.InputMismatchException;
import java.util.Scanner;

/***************************************************************************
* 	     º Java Stdin and Stdout 2 º			 	   *
* 								           *
* Author:    Jair Israel Avilés Eusebio				           *
* Date:      10/27/2015							   *
* Language:  Java							   *
* Twitter:   @yajairo87							   *
* URL: https://www.hackerrank.com/challenges/java-stdin-stdout		   *
* 							    		   *
* **************************************************************************/

public class JavaStdinAndStdout2 {
//public class Solution {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();


        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
	}
}