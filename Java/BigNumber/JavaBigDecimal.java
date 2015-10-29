import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.math.BigDecimal;


/***************************************************************************
* 						º Java Big Decimal º				 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-bigdecimal		       *
* 															       		   *
* **************************************************************************/

public class JavaBigDecimal {
	//public class Solution {
	public static void main(String []argh)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        for(int i=0;i<n;i++)
        {
            BigDecimal max=new BigDecimal(s[i]);
            int idx=i;
            for(int j=i+1;j<n;j++)
            {
                BigDecimal curr=new BigDecimal(s[j]);
                if(curr.compareTo(max)==1)
                {
                    max=curr;
                    idx=j;
                }
            }
            String temp=s[i];
            s[i]=s[idx];
            s[idx]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        sc.close();
    }
}