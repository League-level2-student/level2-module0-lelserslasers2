package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fiveStuff = {"thing1", "thing1", "thing1", "thing1", "thing1"};
		//2. print the third element in the array
		System.out.println(fiveStuff[2]);
		//3. set the third element to a different value
		fiveStuff[2] = "thingOdd";
		//4. print the third element again
		System.out.println(fiveStuff[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < fiveStuff.length; i++) {
			System.out.println(fiveStuff[i]);
		}
		
		//6. make an array of 50 integers
		int[] fiftyStuff = new int[50];
		
		
		//7. use a for loop to make every value of the integer array a random number
		int lowestVal = 100;
		int highVal = 0;
		Random randy = new Random();
		for (int i = 0; i < fiftyStuff.length; i++) {
			int num = randy.nextInt(100);
			fiftyStuff[i] = num;
			if (num > highVal) {
				highVal = num;
			}
			if (num < lowestVal) {
				lowestVal = num;
			}
		}
		
		
		//8. without printing the entire array, print only the smallest number in the array
		//Edited 7
		System.out.println("Lowest Value = " + lowestVal);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < fiftyStuff.length; i++) {
			System.out.println(fiftyStuff[i]);
		}
		//10. print the largest number in the array.
		System.out.println("Highest Value = " + highVal);
		
		String[] stuufs = {"a", "b", "c", "d", "e"};
		for (int i = 0; i < stuufs.length; i++) {
			System.out.println(stuufs[i]);
		}
		stuufs = add(stuufs, "f");
		for (int i = 0; i < stuufs.length; i++) {
			System.out.println(stuufs[i]);
		}
		
		System.out.println("");
		int[] counte = {1, 2, 3, 5, 4, 6, 18, 9, 6};
		
		for (int i = 0; i < counte.length; i++) {
			System.out.println(counte[i]);
		}
		System.out.println("");
		counte = topToBot(counte);
		
		for (int i = 0; i < counte.length; i++) {
			System.out.println(counte[i]);
		}
		
		System.out.println("");
		System.out.println("50O/10 in order");
		fiftyStuff = topToBot(fiftyStuff);
		for (int i = 0; i < fiftyStuff.length; i++) {
			System.out.println(fiftyStuff[i]);
		}
		
	}
	
	static String[] add(String[] oldList, String addThing) {
		String[] newList = new String[oldList.length + 1];
		for (int i = 0; i < oldList.length; i++) {
			newList[i] = oldList[i];
		}
		newList[oldList.length] = addThing;
		return newList;
	}
	
	static int[] topToBot(int[] oldList) {
		int[] newList = new int[oldList.length];
		
		for (int ia = 0; ia < newList.length; ia++) {
			
		
		
			int highVal = 0;
			for (int i = 0; i < oldList.length; i++) {
				int num = oldList[i];
				if (num > highVal) {
					highVal = num;
				}
			
			}
			
			boolean breakFor = true;
			for (int i = 0; i < oldList.length; i++) {
				if (highVal == oldList[i] && breakFor) {
					oldList[i] = -1;
					breakFor = false;
				}
			}
			newList[ia] = highVal;
		
		}
		return newList;
	}
}
