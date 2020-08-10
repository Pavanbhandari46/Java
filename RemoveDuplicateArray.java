import java.util.*;
public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int arr[]=new int[100];
		int brr[]=new int[100];
		int num,i,j=0;
		System.out.println("Enter the number of elements to the array:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<num-1;i++)
		{
				if(arr[i]!=arr[i+1])
				{
					brr[j++]=arr[i];
				}
		}
		brr[j++]=arr[num-1];
		for( i=0;i<j;i++)
		{
			arr[i]=brr[i];
		}
		
	System.out.println("Array elements after removing duplicates:");
	for(i=0;i<j;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	}
	}

