import java.util.*;
public class squareroot {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		float sq=(float)Math.pow(num,0.5);
		System.out.println("Square root of "+num+"is:"+sq );
	}

}