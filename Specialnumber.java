import java.util.*;
public class Specialnumber {

	public static void main(String[] args) 
	{
		int num,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int sum=0;
		int no=num;
		while(no!=0)
		{
			rem=no%10;
			int rev=factorial(rem);
			sum=sum+rev;
			no=no/10;
		}
		if(num==sum) {
			System.out.println("Special Number");
		}
		else
			System.out.println("Not a special Number");
	}

	static int factorial(int n)
	{
		int fact=1;
		while(n!=1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

}
