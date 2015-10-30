import java.util.Scanner;

/***************************************************************************
* 					º Java 1D Array  º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-1d-array-easy	           *
* 															       		   *
* **************************************************************************/

public class Java1dArray {
    //public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) { arr[i] = sc.nextInt(); }
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (sc.hasNextInt()) {
                arr[j + 1] = sc.nextInt();
                }
                sum += arr[j];
                if (sum < 0) { count++; }
            }
        }
        sc.close();
        System.out.println(count);
    }

}