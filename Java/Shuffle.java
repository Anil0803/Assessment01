package programs;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter array size");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter array  elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Shuffling the array");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		shuffling(arr);
		System.out.println("After shuffling the array");
		System.out.println(Arrays.toString(arr));

	}
	public static void shuffling(int arr[]) {
		Random rand = new Random();
		for(int i=0;i<arr.length;i++) {
			int num=rand.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
		}
	}
}
