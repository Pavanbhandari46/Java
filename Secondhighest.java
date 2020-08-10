import java.util.*;
public class Secondhighest {
	public static void main(String[] args) 
	{
		int arr[]=new int[100];
		int num;
		System.out.println("Enter the number of elements to the array:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		int seclarge=0;
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println("Array elements in sorted order:");
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=num;i>=0;i--)
		{
			if(arr[i]>arr[i-1])
			{
				seclarge=arr[i-1];
				break;
			}
			else
				continue;
		}
		System.out.println("Second largest is:"+seclarge);
	}

}
