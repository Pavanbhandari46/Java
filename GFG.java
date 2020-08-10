package work;
import java.lang.*;
import java.io.*;
import java.util.*;
public class GFG {
    static final int Max=26;
	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
	for(int j=0;j<t;j++) {
		String str=sc.next();
		int n=str.length();
		if(n>Max)
			System.out.println("-1");
		   int dist=0;
		   int count[]=new int[Max];
		   for(int i=0;i<Max;i++)
			   count[i]=0;
		    	for(int i=0;i<n;i++)
		    	{
		    		if(count[str.charAt(i)-'a']==0)
		    	       dist++;
		    		 	count[str.charAt(i)-'a']++;		
		    	}
     System.out.println(n-dist);
	}
  }
}
