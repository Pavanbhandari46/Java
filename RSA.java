import java.io.*;
import java.math.BigInteger;
import java.security.*;
public class RSA {
	int bitlen,r;
	BigInteger n,p,q,phi,d,e;
	public RSA(int bits)
	{
		bitlen=bits;
		SecureRandom r = new SecureRandom();
		p=new BigInteger(bitlen/2,100,r);
		System.out.println(p);
		q=new BigInteger(bitlen/2,100,r);
		System.out.println(q);
		n=p.multiply(q);
		phi=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
		e=new BigInteger(bitlen/2,100,r);
		while(e.compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0)
		{
			if(phi.gcd(e).equals(BigInteger.ONE))
			{
				break;
			}
		}
		System.out.println(e);
		d=e.modInverse(phi);
		System.out.println(e);
	}
		public synchronized BigInteger encrypt(BigInteger Message)
		{
			return Message.modPow(e,n);
		}
		public synchronized BigInteger decrypt(BigInteger Message)
		{
			return Message.modPow(d,n);
		}
		public static void main(String args[])throws IOException{
			RSA rsa=new RSA(1024);
			String text1,text2;
			BigInteger ptext,ctext;
			System.out.println("Enter the plain text");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			text1=br.readLine();
			ptext=new BigInteger(text1.getBytes());
			System.out.println("The cipher is");
			ctext=rsa.encrypt(ptext);
			System.out.println(ctext);
			ptext=rsa.decrypt(ctext);
			text2=new String(ptext.toByteArray());
			System.out.println("plain text is"+text2);
		
	}
}
