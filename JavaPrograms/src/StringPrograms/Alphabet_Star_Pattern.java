package StringPrograms;

public class Alphabet_Star_Pattern {

	public static void main(String[] args) {

	    // size
	    int size = 5;
	    int alpha = 65;

	    // printing pattern
	    for (int i = 0; i < size; i++) {
	      for (int j = 0; j <= i; j++) {
	        System.out.print((char)(alpha+j));
	      }
	      System.out.println();
	    }

	}

}
