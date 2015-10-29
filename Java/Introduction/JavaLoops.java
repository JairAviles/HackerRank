import java.util.Scanner;

/***************************************************************************
* 						º Java Loops º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/28/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87 									 	   		   *
* URL: https://www.hackerrank.com/challenges/java-loops/editorial		   *
* 															       		   *
* **************************************************************************/

public class JavaLoops {
//public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
        }
        sc.close();
	}
}
