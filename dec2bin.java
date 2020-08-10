package work;

import java.util.Scanner;

public class dec2bin {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int dec=sc.nextInt();
String bin="";
while(dec>0) {
	bin=dec%2+bin;
	dec=dec/2;
}
System.out.println("THE DECIMAL IS\n"+bin);

}

}
