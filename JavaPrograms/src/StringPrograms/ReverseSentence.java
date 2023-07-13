package StringPrograms;

public class ReverseSentence {
	
	    public static void main(String args[]) {
	      String s[] = "My name is chethas Ram".split(" "); 
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
	    }
	}

