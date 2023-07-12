package StringPrograms;

public class perfect {
	public static void main(String[] args) 
	{
		int num=6,sum=0;
		for (int i=1;i<num ; i++ )
		{
			if(num%i==0)
			{
				sum=sum+i;
		}
	}
	if(sum==num)
		{
		System.out.println("The given number is perfect");
		}
		else
		{
			System.out.println("The given number is not a perfect number");
		}
	}
}
