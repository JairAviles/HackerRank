import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;

/********************************************************************************
* 			º Java Exception Handling Try Catch  º			 	   		   		*
* 														     	   		   		*
* Author:    Jair Israel Avilés Eusebio						 	   	       		*
* Date:      10/30/2015									    	   		   		*
* Language:  Java										     	   		   		*
* Twitter:   @yajairo87										 	   		  		*
* URL: https://www.hackerrank.com/challenges/java-exception-handling-try-catch  *
* 															       		   		*
* ******************************************************************************/

public class JavaExceptionHandlingTryCatch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x / y);
			sc.close();
		} catch(InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch(ArithmeticException e) {
			System.out.println(e.getClass().getName() + ": / by zero");
		}
	}
}