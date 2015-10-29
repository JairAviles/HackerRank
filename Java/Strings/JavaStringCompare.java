import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/***************************************************************************
*                  º Java String Compare º                                 *
*                                                                          *
* Author:    Jair Israel Avilés Eusebio                                    *
* Date:      10/29/2015                                                    *
* Language:  Java                                                          *
* Twitter:   @yajairo87                                                    *
* URL: https://www.hackerrank.com/challenges/java-string-compare           *
*                                                                          *
* **************************************************************************/

public class JavaStringCompare {
//public class Solution {
    public static void main(String[] args) {
		List<String> lString = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String first="";
        String last = "";
        String t = "";
        int n = 0;
	    while(sc.hasNextLine()) {
	    	 try{
		        	if(t.equals("exit")){
		        		sc.close();
		        		break;
		        	} else if (t.equalsIgnoreCase("")) {
		        		t = sc.nextLine();
			        	n = sc.nextInt();
			        	if(n >0 && t.length() > 0) {
			        		lString = splitStringEvery(t, n);
			        		first = getSmaller(lString);
			        		last = getBigger(lString);
			        		System.out.println(first);
			        		System.out.println(last);
			        	}
		        	} else {
		        		t = sc.nextLine();
		        		n = 0;
		        	}
	    	 } catch (InputMismatchException e){
	    		 e.printStackTrace();
	    	 }
	    }
	}

	public static List<String> splitStringEvery(String s, int interval) {
		List<String> result = new ArrayList<String>();

		int i = 0;
		while(i + interval <= s.length()){
			result.add(s.substring(i, i + interval));
			//System.out.println(result.get(i));
			i ++;
		}
		return result;
	}

	public static String getSmaller(List<String> lString){
		String result = lString.get(0);

		for(int i = 0;i < lString.size(); i++) {
			if(lString.get(i).compareTo(result) < 0){
				result = lString.get(i);
			}
		}

		return result;
	}

	public static String getBigger(List<String> lString){
		String result = "";

		for(int i = 0;i < lString.size(); i++) {
			if(lString.get(i).compareTo(result) > 0){
				result = lString.get(i);
			}
		}

		return result;
	}
}