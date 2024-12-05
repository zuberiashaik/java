package pack1;

import java.util.HashSet;

public class RemovingDuplicateElements {

	public static void main(String[] args) {
		int arr[] = {30,40,40,50,50,90};
		HashSet hs = new HashSet();
		for(int i=0; i<=arr.length-1; i++) {
			hs.add(arr[i]);
		}
		System.out.print(hs);
		}
	}


