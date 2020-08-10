import java.util.*;
public class ZEroesOnes {

	public static void main(String[] args) 
	{
		int arr[]=new int[100];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter the array elements:");
		for( i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
		System.out.println("Array elements in sorted order:");
		for(i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
