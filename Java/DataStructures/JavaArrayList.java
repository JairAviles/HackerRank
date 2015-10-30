import java.util.ArrayList;
import java.util.Scanner;

/***************************************************************************
* 					º Java HashSet  º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/30/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-hashset		           *
* 															       		   *
* **************************************************************************/


public class JavaArrayList {
	//public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();


        ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> inner = new ArrayList<Integer>();
            int d = sc.nextInt();

            for(int j=1;j<=d;j++)
            {
                int a = sc.nextInt();
                inner.add(a);
            }
            outer.add(i, inner);
        }
        int b = sc.nextInt();
        for(int i=1;i<=b;i++)
        {
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();

            ArrayList<Integer> e = outer.get(c-1);

             try{
               Integer f = e.get(d-1);
               System.out.println(f);
             }
             catch(Exception g)
             {
                System.out.println("ERROR!");
             }

        }
        sc.close();
	}

}