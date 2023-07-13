package StringPrograms;

public class PrimeNumORNot {

	public static void main(String[] args) {
		Prime(3);
	}
	
	public static void Prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("is prime");
		else
			System.out.println("not prime");
	}
}
