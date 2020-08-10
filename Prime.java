import java.util.*;
public class Prime {
	public static void main(String[] args) 
	{
		int i,j,n,flag;
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
				System.out.println(n);
		}
		

	}

}
