import java.util.*;

/********************************************************************************
* 			º Java Interface  º				   				 	   		   		*
* 														     	   		   		*
* Author:    Jair Israel Avilés Eusebio						 	   	       		*
* Date:      10/30/2015									    	   		   		*
* Language:  Java										     	   		   		*
* Twitter:   @yajairo87										 	   		  		*
* URL: https://www.hackerrank.com/challenges/java-interface 			        *
* 															       		   		*
* ******************************************************************************/

interface AdvancedArithmetic{
  public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int n) {
        int total = 0;
        for(int i = n; i > 0; i--) {
            if(n % i == 0) {
                total += i;
            }
        }
        
        return total;
    }
}

class Solution{

    public static void main(String []argh)
    {
        MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(my_calculator.divisorSum(n)+"\n");
        sc.close();

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {

        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}