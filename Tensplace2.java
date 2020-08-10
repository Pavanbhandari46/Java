import java.util.*;
public class Tensplace2 {

	public static void main(String[] args) {
		int count=0,temp,rem=0,rev=1;
		for(int i=1;i<300;i++)
		{
			int num=i;
			int oldno=i;
			while(num!=0)
			{
				num=num/10;
				count=count+1;
			}
			if(count==3)
			{
				temp=i;
				while(temp>=10)
				{
					rem=temp%10;
					temp=temp/10;
				}
				if(rem==2)
				{
					System.out.println(i);
				}
			}
			count=0;
		}
	}

}
