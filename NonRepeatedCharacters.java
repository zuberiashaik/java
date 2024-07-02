package pack1;
import java.util.HashMap;
public class NonRepeatedCharacters {

	    public static int firstNonRepeatedCharIndex(String s) {
	        //  Count occurrences of each character using a HashMap
	        HashMap<Character, Integer> charCount = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }
	        
	        // Find the first non-repeated character and return its index
	        for (int i = 0; i < s.length(); i++) {
	            if (charCount.get(s.charAt(i)) == 1) {
	                return i;
	            }
	        }
	        
	        // If no non-repeated character found, return -1
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	        String input = "aabb";
	        int result = firstNonRepeatedCharIndex(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + result);  // Output: -1
	    }
	}


//output:
//Input:aabb
//output:-1
	
