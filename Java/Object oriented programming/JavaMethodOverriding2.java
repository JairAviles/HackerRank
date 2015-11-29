import java.util.*;
import java.io.*;

/*************************************************************************************
*       º Java Method Overriding 2 º                                                 *
*                                                                                    *
* Author:    Jair Israel Avilés Eusebio                                              *
* Date:      11/29/2015                                                              *
* Language:  Java                                                                    *
* Twitter:   @yajairo87                                                              *
* URL: https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword  *           *
*                                                                                    *
* ************************************************************************************/

class BiCycle
{
   String define_me()
   {
      return "a vehicle with pedals.";
   }
}

class MotorCycle extends BiCycle
{
   String define_me()
   {
      return "a cycle with an engine.";
   }
   
   MotorCycle()
   {
      
      
      System.out.println("Hello I am a motorcycle, I am "+ define_me());
      String temp=super.define_me();
      System.out.println("My ancestor is a cycle who is "+ temp );
   }
   
}
class Solution{
   public static void main(String []argh)
   {
      MotorCycle M=new MotorCycle();
   }
}