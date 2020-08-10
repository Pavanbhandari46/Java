import java.util.*;
public class BIN_TO_DEC {
	static int i=0,ind=0;
	public static void main(String[] args) {
		int a[]=new int[100];
		int num;
		int n;
		int b[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to convert to binary:");
		num=sc.nextInt();
		while(num!=0)
		{
			n=num%2;
			a[i]=n;
			i++;
			num=num/2;
			ind=ind+1;
			if(num==1)
			{
				a[i++]=1;
				break;
			}
		}
		
		System.out.println("Binary form:");
		for(int j=ind;j>=0;j--)
			System.out.print(a[j]);
			
	}		
}
