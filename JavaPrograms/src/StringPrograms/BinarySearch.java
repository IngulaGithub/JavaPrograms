package StringPrograms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {522,545,42,464,94,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter binary search");
		int binarySearch=sc.nextInt();
		
		binarySearchEle(a,binarySearch);
	}
	
	public static void binarySearchEle(int arr[],int key)
	{
		// sorting array
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int lIndex=0;
		int hIndex=arr.length-1;
		boolean found=false;
		
		while(lIndex<=hIndex)
		{
			int mid=(lIndex+hIndex)/2;
			
			if(arr[mid]==key)
			{
				System.out.println("search element found");
				found =true;
				break;
			}
			
			if(arr[mid]<key)
			{
				lIndex=mid+1;
			}
			
			if(arr[mid]>key)
			{
				hIndex=mid-1;
			}
			
		}
		
		if(found==false)
		{
			System.out.println("search element not found");
		}
	}
}









