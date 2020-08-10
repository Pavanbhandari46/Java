import java.util.*;
public class Patternalpha {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.next();
		int len=s.length();
		char str[]=s.toCharArray();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str[j]);
			}
			System.out.println();
		}
	}

}
