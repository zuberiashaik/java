package pack1;
import java.util.*;
public class FrequentWords {
	
	    public static List<String> topKFrequent(String[] words, int k) {
	        // Count frequencies of each word using a HashMap
	        Map<String, Integer> wordFreq = new HashMap<>();
	        for (String word : words) {
	            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
	        }
	        
	        // Sort words based on frequency (and by natural order for ties)
	        List<String> uniqueWords = new ArrayList<>(wordFreq.keySet());
	        Collections.sort(uniqueWords, (w1, w2) -> {
	            int freqCompare = wordFreq.get(w2).compareTo(wordFreq.get(w1)); // Descending order by frequency
	            if (freqCompare == 0) {
	                return w1.compareTo(w2); // Ascending order by natural order
	            } else {
	                return freqCompare;
	            }
	        });
	        
	        // Return top k frequent words
	        return uniqueWords.subList(0, k);
	    }

	    public static void main(String[] args) {
	        String[] words = {"i", "love", "coding", "i", "love", "MyCountry"};
	        int k = 2;
	        List<String> result = topKFrequent(words, k);
	        System.out.println("Input words: " + Arrays.toString(words));
	        System.out.println("Top " + k + " frequent words: " + result); // Output: [i, love]
	    }
	}

//output:
//Input words:[i,love,codng,i love,mycountry]
//top 2 frequent words;[i,love]

