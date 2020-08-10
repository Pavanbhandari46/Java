import java.util.*;
import java.math.*;
public class Armstrong {

	public static void main(String[] args) 
	{
		int num,sum=0,n,len=0,rem;
		System.out.println("Enter the number to check for armstrong number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int oldno=num;
		 n=num;
		while(n!=0)
		{
			n=n/10;
			len=len+1;
		}
		
		while(num!=0)
		{
				rem=num%10;
				sum=(int) (sum+Math.pow(rem,len));
				num=num/10;
		}
		if(oldno==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
	}

}
