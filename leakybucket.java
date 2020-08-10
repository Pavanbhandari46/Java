import java.util.*;
public class leakybucket {

	public static void main(String args[])
	{
		int n,bsize,oprate,bcnt,nbc=0,i;
		int pkt[]=new int[15];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line number of arrivals");
		n=sc.nextInt();
		System.out.println("Enter the bucket size");
		bsize=sc.nextInt();
		System.out.println("Enter the output rate");
		oprate=sc.nextInt();
		System.out.println("Enter the packets");
		for(int j=0;j<n;j++)
		{
			pkt[j]=sc.nextInt();
		}
		System.out.println("\nSec\tno. of packets\t\tBcount\t\tStatus\t\tPkt sent\tnbc");
		for(i=0;i<n;i++)
		{
			System.out.print(i);
			System.out.print("\t\t"+pkt[i]);
			bcnt=nbc+pkt[i];
			if(bcnt<=bsize)
			{
				System.out.print("\t\t"+bcnt);
				System.out.print("\t\tA");
				System.out.print("\t\t"+Math.min(bcnt,oprate));
			
				nbc=sub(bcnt,oprate);
				System.out.print("\t\t"+nbc);
				System.out.print("\n");
			}
			else
			{
				bcnt=nbc;
				System.out.print("\t\t"+bcnt);
				System.out.print("\t\tR");
				System.out.print("\t\t"+Math.min(bcnt,oprate));
				nbc=sub(bcnt,oprate);
				System.out.print("\t\t"+nbc);
				System.out.print("\n");
			}
		}
		while(nbc!=0)
		{
			System.out.print(++i+"\t\t");
			//System.out.print("-\t\t");			
			bcnt=nbc;
			System.out.print("\t\t"+bcnt);
			System.out.print("\t\tA");
			System.out.print("\t\t"+Math.min(oprate, nbc));
			nbc=sub(nbc,oprate);
			System.out.print("\t\t"+nbc);
		}
		
	}
	private static int sub(int bcnt,int oprate)
	{
		if(bcnt>oprate)
			return(bcnt-oprate);
		else
			return 0;
	}
	
}
