import java.util.*;
public class Transpose 
{
	public static void main(String[] args) 
	{
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns:");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[n][m];
		System.out.println("Enter the elements:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix form:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("transponse form:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(a[j][i]+" ");
			System.out.println();
		}
		
	}
	}

