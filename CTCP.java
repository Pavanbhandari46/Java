import java.net.*;
import java.io.*;

public class CTCP {

	public static void main(String args[])
			throws IOException{
		String msg;
	Socket sock=new Socket("localhost",1234);
	System.out.println("Enter Filename");
	BufferedReader Keyreader = new BufferedReader(new InputStreamReader(System.in));
	String fname=Keyreader.readLine();
	OutputStream ostream = sock.getOutputStream();
	PrintWriter pwrite=new PrintWriter(ostream,true);
	pwrite.println(fname);
	InputStream istrm = sock.getInputStream();
	BufferedReader br=new BufferedReader(new InputStreamReader(istrm));
	while((msg = br.readLine())!=null)
	{
		System.out.println(msg);
	}
}
}

