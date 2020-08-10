import java.util.*;
public class Reversearray {

	public static void main(String[] args) {
		int i,j;
		int arr[]=new int[100];
		int num,temp;
		System.out.println("Enter the number of elements to the array:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter the array elements:");
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		
	System.out.println("Array elements in sorted order:");
	for(i=0;i<num;i++)
	{
		System.out.println(arr[i]);
	}
	}

}
