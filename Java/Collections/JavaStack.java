import java.util.Scanner;
import java.util.Stack;

/***************************************************************************
* 						º Java Stack  º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-stack			           *
* 															       		   *
* **************************************************************************/

public class JavaStack {
	//public class Solution {

	public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String sc = in.next();
            System.out.println(isParenthesisMatch(sc));
        }
        in.close();
    }

	public static boolean isParenthesisMatch(String str) {
	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);

	        if(c == '(')
	            stack.push(c);
	        else if(c == '{')
	            stack.push(c);
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                stack.pop();
	            else
	                return false;
	        else if(c == '}')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '{')
	                stack.pop();
	            else
	                return false;
	    }
	    return stack.empty();
	}
}
