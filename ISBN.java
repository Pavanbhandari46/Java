import java.util.*;
public class ISBN {

	public static void main(String[] args) {
		int arr[]=new int[100];
		int num,sum=0;
		System.out.println("Enter the number of elements to the array:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int n=10;
		System.out.println("Enter the array elements:");
		for(int i=0;i<num-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num-1;i++)
		{
			sum=sum+n*(int)(arr[i]);
			n=n-1;
		}
		System.out.println("Enter the last character:");
		arr[num]=sc.nextInt();
		if(arr[num-1]=='X')
		{
			sum=sum+10;
		}
		else
		{
			sum=sum+arr[num];
		}
		if(sum%11==0)
		{
			System.out.println("ISBN Number");
		}
		else
		{
			System.out.println("Not an ISBN Number");
		}
}
}
