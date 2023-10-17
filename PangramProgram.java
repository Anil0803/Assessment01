package programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input string");
		String sentence = sc.nextLine();
		if(pangramOrNot(sentence))
			System.out.println("The entered input is pangram");
		else
			System.out.println("The entered input is not a pangram");
	}
	static boolean pangramOrNot(String sentence) {
		String temp = sentence.toLowerCase();
		int count =0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<temp.length();i++) {
			if(Character.isAlphabetic(temp.charAt(i)) && !set.contains(temp.charAt(i))) {
				set.add(temp.charAt(i));
				count++;
			}
		}

		return count==26?true:false;
	}
}
