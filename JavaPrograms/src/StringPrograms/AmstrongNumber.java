package StringPrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		armstrongNum(153);
	}
	
	public static void armstrongNum(int num) {
	
		int rem,arm=0,temp=num;
		while(temp>0)
		{
			rem=temp%10;
			temp=temp/10;
			arm=arm+rem*rem*rem;
		}
		if(arm==num)
			System.out.println("armstrong");
		else
			System.out.println("not amr");
	
	}
}
