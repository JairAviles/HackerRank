import java.util.Scanner;

/***************************************************************************
* 					º Java 2D Array  º						 	   		   *
* 														     	   		   *
* Author:    Jair Israel Avilés Eusebio						 	   	       *
* Date:      10/29/2015									    	   		   *
* Language:  Java										     	   		   *
* Twitter:   @yajairo87										 	   		   *
* URL: https://www.hackerrank.com/challenges/java-2d-array		           *
* 															       		   *
* **************************************************************************/

public class Java2dArray {

	public static void main(String[] args) {
        int max=(int) (Math.pow(10,10) * -1);

       int sum=0;
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[6][6];
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
              sum= (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
	            if(sum>max){
	                max=sum;
	            }
            }
        }
        sc.close();
        System.out.println(max);
    }

}