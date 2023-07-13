package StringPrograms;

public class Reverse_String {
	public static void main(String[] args) {
		String original = "Naagu";
		String rev = " ";
		for(int i=0; i<original.length(); i++)
		{
			rev = original.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
