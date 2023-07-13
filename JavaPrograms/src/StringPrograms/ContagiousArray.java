package StringPrograms;

//contagious : two adjacent of array elements divisible by 2 
public class ContagiousArray {

	public static void main(String[] args) {
		int a[]= {31,1,46,4,1,54,5,1};
		
		Boolean contagious=isContagious(a);
		
		if(contagious)
		System.out.println("is contagious array");
		else 
			System.out.println("not contagiuos");
	}
	
	public static boolean isContagious(int ary[])
	{
		for(int i=0;i<ary.length-1;i++)
		{
			int product=ary[i]*ary[i+1];
			if(product%2==0)
				return true;
		}
		
		 
			return false ;
	}
	
	
	
}
