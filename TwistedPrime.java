import java.util.*;
public class TwistedPrime {

	public static void main(String[] args) {
		for(int i=2;i<100;i++)
		{
			boolean b=twistedprime(i);
			if(b==true)
			{
				int r=reverse(i);
				boolean bb=twistedprime(r);
				if(bb==true)
				{
					System.out.println(i);
				}
			}
		}

	}
	public static boolean twistedprime(int n)
	{
		int flag=0;
		int a=n;
		for(int i=2;i<n/2;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
			return false;
	}
	public static int reverse(int n)
	{
		int rev=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
