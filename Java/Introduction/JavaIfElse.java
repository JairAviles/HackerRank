    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

/***************************************************************************
*                       º Java If-Else   º                                 *
*                                                                          *
* Author:    Jair Israel Avilés Eusebio                                    *
* Date:      11/28/2015                                                    *
* Language:  Java                                                          *
* Twitter:   @yajairo87                                                    *
* URL: https://www.hackerrank.com/challenges/java-if-else                  *
*                                                                          *
* **************************************************************************/

public class JavaIfElse {
//public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            String ans="";
            if(n%2==1)ans = "Weird";
            else
            {
               if(n > 1 && n < 6) {
                   ans = "Not Weird";
               } else if (n > 5 && n < 21) {
                   ans = "Weird";
               } else if (n > 20) {
                   ans = "Not Weird";
               }
            }
            System.out.println(ans);
        }
    }