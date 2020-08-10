import java.util.*;
public class TwinPrime {
	public static void main(String[] args) {
		int i,j,n,flag;
		int arr[]=new int[100];
		int ind=0;
		for(i=2;i<100;i++)
		{
			flag=0;
			n=i;
			for(j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					flag=1;
					break;
				}
				else
					continue;
			}
			if(flag==0)
			{
				arr[ind]=n;
				ind++;
			}		
		}
		for(i=0;i<ind;i++)
		{
			if((arr[i+1]-arr[i])==2)
			{
				System.out.println("("+arr[i]+","+arr[i+1]+")");
			}
			else
				continue;
		}
	}
}