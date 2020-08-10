import java.util.*;
import java.math.*;
public class DEC_TO_BIN {

	public static void main(String[] args) {
		int num,rem=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number:");
		num=sc.nextInt();
		int no=num;
		int sum=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		int raise=0;
		//System.out.println(count);
		while(no!=0)
		{
			rem=no%10;
			sum=(int)(sum+(rem*Math.pow(2,raise)));
			raise++;
			no=no/10;
		}
		System.out.println("Decimal no is:"+sum);
	}

}
