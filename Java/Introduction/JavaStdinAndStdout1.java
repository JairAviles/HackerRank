import java.util.InputMismatchException;
import java.util.Scanner;

/***************************************************************************
* 						º Java Stdin and Stdout 1 º			 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/27/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1       *
* 															       		   *
* **************************************************************************/

public class JavaStdinAndStdout1 {
//public class Solution {

	    public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int a = 0;

	      while(sc.hasNextLine()) {
	           try {
	              a = sc.nextInt();

	              System.out.println(a);
	           } catch (InputMismatchException e) {
	               e.printStackTrace();
	           }
	      }
	    }
}