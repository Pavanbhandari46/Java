import java.util.*;
public class NumPattern {

	public static void main(String[] args) {
		int a=0,b=1,c=0,d=1,next,ind=0;
		int arr[]=new int[100];
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			{
				next=a+b;
				a=b;
				b=next;
				arr[ind]=next;
				ind=ind+1;
			}
			else
			{
				next=c+d;
				c=d;
				d=next;
				arr[ind]=next;
				ind=ind+2;
			}
		}
		System.out.println("Pattern is:");
		for(int i=0;i<ind;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
