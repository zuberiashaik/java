package pack1;

import java.util.HashSet;

public class FirstRepeatingElement {

	    public static int findFirstRepeating(int[] arr) {
	        HashSet<Integer> seen = new HashSet<>();
	        int firstRepeating = -1; 
	        for (int i = arr.length - 1; i >= 0; i--) {
	            if (seen.contains(arr[i])) {
	                firstRepeating = arr[i];
	            } else {
	                seen.add(arr[i]);
	            }
	        }

	        return firstRepeating;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10,5,3,4,3,5,6};
	        int result = findFirstRepeating(arr);

	        if (result != -1) {
	            System.out.println("The first repeating element is: " + result);
	        } else {
	            System.out.println("No repeating elements found");
	        }
	    }
	}



