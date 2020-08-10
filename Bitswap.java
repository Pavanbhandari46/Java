package work;
import java.lang.*;
import java.util.*;
import java.io.*;
public class Bitswap {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine().trim());
	while(t-->0) {
		int n=Integer.parseInt(br.readLine().trim());
		String str=Integer.toBinaryString(n);
		if(str.length()%2==1)
			str=0+str;
		String str1="";
		for(int i=0;i<str.length();i=i+2) {
			str1+=str.charAt(i+1);
			str1+=str.charAt(i);
			
		}
		System.out.println(Integer.parseInt(str1,2));	
	}
	
}
}
