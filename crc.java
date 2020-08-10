import java.util.*;

public class crc{
	public static int[] div(int data[], int gen[], int n, int g){
		int k, msb, r[];
		r = new int[100];
		for(int i=0;i<g;i++){
			r[i] = data[i];
		}
		for(int i=0;i<n;i++){
			k = 0;
			msb = r[i];
			for(int j=i;j<g+i;j++){
				if(msb==0)
					r[j]=r[j]^0;
				else
					r[j] = r[j]^gen[k];

				k++;
			}
			r[g+i] = data[g+i];
		}
		for(int i=n;i<n+g-1;i++){
			data[i] = r[i];
		}
		return data;
	}
	public static void main(String args[]){
		int n, g, data[], gen[],dataR[], codedata[], codedataR[];
		int flag=0;
		data = new int[100];
		gen = new int[100];
		dataR= new int[100];
		codedata = new int[100];
		codedataR = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of data bits");
		n = sc.nextInt();
		System.out.println("Enter Data bits: ");
		for(int i=0;i<n;i++){
			data[i] = sc.nextInt();
		}
		System.out.println("Enter no of gen bits");
		g = sc.nextInt();
		System.out.println("Enter gen bits: ");
		for(int i=0;i<g;i++){
			gen[i] = sc.nextInt();
		}
		for(int i=n;i<n+g-1;i++){
			data[i] = 0;
		}
		codedata = div(data, gen, n, g);
		System.out.println("Send data is: ");
		for(int i=0;i<n+g-1;i++)
			System.out.print(codedata[i]);
		
		System.out.println("Enter received data: ");
		for(int i=0;i<n+g-1;i++)
			dataR[i]=sc.nextInt();
		codedataR=div(dataR,gen,n,g);
		for(int i=n; i<n+g-1; i++){
			if(codedataR[i]!=0)
				flag=1;
		}
		if(flag==1) System.out.println("Error");
		else
			System.out.println("Successfull Transmission");
	}
} 
