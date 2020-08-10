import java.util.*;
public class Pattern {
	public static void main(String[] args) 
	{
		int row=5;
		int col=5;
		int ind;
		int sum=0;
		int arr[][]=new int[row][col];
		System.out.println("Pattern is:");
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if((i+j)/2==3)
				{
					arr[1][3]=1;
					sum=sum+1;
					break;
				}
				else
				{
					if((i+j)%2==0 && i>row)
					{
						arr[i][j]=sum+1;
						sum=sum+1;
					}
					else
						continue;
				}
			}
		}
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(arr[i][j]);
			}
		}
	}
}
