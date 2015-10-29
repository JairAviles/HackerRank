import java.util.Scanner;

public class Pangram2 {
	//public class Solution {

	private static final String IS_PANGRAM  = "pangram";
	private static final String NOT_PANGRAM = "not pangram";
	private static final String MULTIPLE_PANGRAM = "multiple pangram";
	private static final Integer TOTAL_LETTERS_ALPHABET = 26;
	private static final Integer TOTAL_LENGTH = 1000000000; //10^9

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		int total = 0;
			line = scanner.nextLine().toLowerCase();
			line = line.replaceAll("mr.", "mr");
			line = line.replaceAll("mrs.", "mrs");
			line = line.replaceAll("ms.", "ms");

		String []s = line.split("\\.");

		if(s.length == 1) {
			String []s2 = line.split(",");
			 if(s2.length == 1) {
				 if(!isPangram(line)) {
					System.out.println(NOT_PANGRAM);
				 } else if (isPangram(line)) {
					System.out.println(IS_PANGRAM);
				 }
			 } 	else {
				 for(int i = 0; i < s.length; i++) {
						if(isPangram(s[i])) {
							total++;
						}
					}
					System.out.println(MULTIPLE_PANGRAM + " " + total);
			 }
		} else if (s.length > 1) {
			for(int i = 0; i < s.length; i++) {
				if(isPangram(s[i])) {
					total++;
				}
			}
			System.out.println(MULTIPLE_PANGRAM + " " + total);
		}
		scanner.close();
	}

	public static boolean isPangram(String s) {
		boolean result = true;
		if(s.length() < TOTAL_LETTERS_ALPHABET || s.length() > TOTAL_LENGTH){
			return false;
		}
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			if(s.indexOf(ch) < 0
					&& s.indexOf((char)(ch +32)) <0){
				return false;
			}
		}
		return result;
	}
}

/* Try the following sentences in order to validate the program

Input
	Chipotle is best served two days after purchased.
Output
	not pangram

Input
	The quick brown fox jumps over the lazy dog.
Output
	pangram

Input
	Mr. Jock, TV quiz PhD, bags few lynx.
Output
	multiple pangram 1

Input
	Mr. Jock, TV quiz PhD, bags few lynx.Mr. Jock, TV quiz PhD, bags few lynx.Mr. Jock, TV quiz PhD, bags few lynx.
Output
	multiple pangram 3

*/