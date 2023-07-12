package StringPrograms;

public class ReverseStringUsingRecursion 
{
 public static void main (String[] args)
 {
	 String input = "hello";
		      System.out.println(reverse(input));
		    }

		    private static String reverse(String input) {
		        if(input.equals("") || input == null) {
		        return "";
		    }
		    return input.substring(input.length()-1) + reverse(input.substring(0, input.length()-1));
		} 
}