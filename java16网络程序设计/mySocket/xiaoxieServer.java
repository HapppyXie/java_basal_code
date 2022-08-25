package mySocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class xiaoxieServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2500);
			Socket socket = server.accept();
			
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			BufferedReader sin = 
			new BufferedReader(new InputStreamReader(System.in));
			
			String s;
			String temp;
		while(!(s=in.readLine()).equals("bye")) {
				System.out.println("收到来自客户端的："+s);
				temp = sin.readLine();
				out.println(temp);
				out.flush();
				
				if(temp.equals("bye")) {
					break;
				}
			}
			System.out.println("通信结束");
			sin.close();
			in.close();
			out.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
