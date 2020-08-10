import java.util.*;
public class Nivennumber {
	public static void main(String[] args) 
	{
		int num,sum=0,n,len=0,rem;
		System.out.println("Enter the number to check for niven number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int oldno=num;
		while(num!=0)
		{
				rem=num%10;
				sum=sum+rem;
				num=num/10;
		}
		if(oldno%sum==0)
			System.out.println("Niven number");
		else
			System.out.println("Not a niven number");
	}

}
