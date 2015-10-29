import java.util.Scanner;

/***************************************************************************
* 						º Java Output Formatting º			 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/28/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-output-formatting	       *
* 															       		   *
* **************************************************************************/

public class JavaOutPutFormatting {
//public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            if(s1.length() > 10) {
                s1 = s1.substring(0, 10);
            }

            if(x < 0 || x > 999) {
                x = 0;
            }
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

        sc.close();
	}
}