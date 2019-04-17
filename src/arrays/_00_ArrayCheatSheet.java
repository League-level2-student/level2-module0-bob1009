package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
//		//1. make an array of 5 Strings
//		String[] array = {"one", "two", "three","four","five"};
//		//2. print the third element in the array
//		System.out.println(array[2]);
//		//3. set the third element to a different value
//		array[2]="threeeee";
//		//4. print the third element again
//		System.out.println(array[2]);
//		//5. use a for loop to print all the values in the array
//		//   BE SURE TO USE THE ARRAY'S length VARIABLE
//		for (int i = 0; i < array.length; i++) {
//			 System.out.println(array[i]);
//		}
//		
//		//6. make an array of 50 integers
		int[]num=new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran=new Random();
		for (int i = 0; i < num.length; i++) {
			num[i]=ran.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small=num[0];
		for (int i = 0; i < num.length; i++) {
		if(num[i]<small) {
			small=num[i];
		}
		
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		int big=num[49];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>big) {
				big=num[i];
			}
		}
		System.out.println(big);
		//10. print the largest number in the array.
		
	}
}
