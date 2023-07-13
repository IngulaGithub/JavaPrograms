package StringPrograms;

public class BiggestAndLeastElementOfArray {

	public static void main(String[] args) {
		int ary[]={61,31,45,4,24,57,44};
		max(ary);
		min(ary);
	}
	
	public static void max(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max+" biggest");
	}
	
	public static void min(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min+" least");
	}
	
}
