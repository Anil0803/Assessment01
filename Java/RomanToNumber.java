package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roman number");
		String roman = sc.next();
		System.out.println("entered roman number is "+roman);
		System.out.println();
		System.out.println("after conversion");
		System.out.println();
		System.out.println("Number is "+romanToNumberConvertor(roman.toUpperCase(), map));
	}
	public static int romanToNumberConvertor(String roman, Map<Character,Integer> map) {
		int n = roman.length();
		int sum=0;
		for(int i=0;i<n;i++) {
			if(i!=n-1 && map.get(roman.charAt(i)) < map.get(roman.charAt(i+1)) ) {
				sum+= map.get(roman.charAt(i+1))-map.get(roman.charAt(i));
				i++;
			}
			else {
				sum+=map.get(roman.charAt(i));
			}
		}
		return sum;
	}

}
