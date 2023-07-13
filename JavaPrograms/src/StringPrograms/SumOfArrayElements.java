package StringPrograms;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int ary[]={65,1,46,4564,5,1,44};
		arraySum(ary);
	}
	
	public static void arraySum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("sum of array is : "+sum);
	}
}
