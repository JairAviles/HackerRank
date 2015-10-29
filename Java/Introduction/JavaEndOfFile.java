import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/***************************************************************************
*                       º Java End-of-file º                               *
*                                                                          *
* Author:    Jair Israel Avilés Eusebio                                    *
* Date:      10/29/2015                                                    *
* Language:  Java                                                          *
* Twitter:   @yajairo87                                                    *
* URL: https://www.hackerrank.com/challenges/java-end-of-file              *
*                                                                          *
* **************************************************************************/

public class JavaEndOfFile {
//public class Solution {

    static int lines = 1;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		while(true){
			line = scanner.nextLine();
			System.out.println(lines + " " + line);
			lines++;
			if(line.equalsIgnoreCase("exit") || !scanner.hasNext()){
				break;
			}
		}
		scanner.close();
	}
}