package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		
		    String s = "love life";
		    Set<Character> unique = new HashSet<>();
		    Set<Character> duplicate = new HashSet<>();
		    for (char c : s.toCharArray()) {
		        // Have we seen this one before already.
		        if (!duplicate.contains(c)) {
		            if (!unique.add(c)) {
		                // It was already there.
		                unique.remove(c);
		                // Mark it as duplicate.
		                duplicate.add(c);
		            }

		        }
		    }
		    System.out.println("Unique:" + Arrays.toString(unique.toArray(new Character[0])));
		}

	}


