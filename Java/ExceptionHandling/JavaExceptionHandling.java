import java.util.Scanner;

/********************************************************************************
* 			º Java Exception Handling Try Catch  º			 	   		   		*
* 														     	   		   		*
* Author:    Jair Israel Avilés Eusebio						 	   	       		*
* Date:      10/30/2015									    	   		   		*
* Language:  Java										     	   		   		*
* Twitter:   @yajairo87										 	   		  		*
* URL: https://www.hackerrank.com/challenges/java-exception-handling		    *
* 															       		   		*
* ******************************************************************************/

public class JavaExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        in.close();
	}

}