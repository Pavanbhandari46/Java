import java.net.*;
import java.io.*;
public class STCP {
	public static void main(String args[])
		throws Exception{
			String msg;
			
			ServerSocket sersock=new ServerSocket(1234);
			System.out.println("Server Started");
			Socket sock=sersock.accept();
			System.out.println("Server is ready to accept request");
			InputStream istrm = sock.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(istrm));
			String fname = br.readLine();
			BufferedReader conread = new BufferedReader(new FileReader(fname));
			OutputStream ostream = sock.getOutputStream();
			PrintWriter pwrite=new PrintWriter(ostream,true);
			System.out.println("The Content is");
			while((msg = conread.readLine())!=null)
			{
				pwrite.println(msg);
			}
			sock.close();
		}
	}

