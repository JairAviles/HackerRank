import java.util.*;
import java.io.*;

/***************************************************************************
* 					º Java Map  º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      11/28/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/phone-book			           *
* 															       		   *
* **************************************************************************/


public class JavaMap {
	//public class Solution {
   public static void main(String []args){
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String, Integer> phoneBook = new HashMap<String, Integer>();

	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         phoneBook.put(name, phone);
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(phoneBook.containsKey(s)) {
	        	 System.out.println(s + "=" + phoneBook.get(s));
	         } else {
	        	 System.out.println("Not found");
	         }
	      }
	      in.close();
	}
}
