package mySocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class myServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1900);
			Socket socket = server.accept();
			
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			BufferedReader sin = 
			new BufferedReader(new InputStreamReader(System.in));
			
			//先读取Client的数据，然后从标准输入读取数据发送给Client
			String s;
			while(!(s = in.readLine()).equals("bye")) {
				System.out.println("Recevied from Client: "+s);
				out.println(sin.readLine());
				out.flush();
				
			}
			System.out.println("The connection is closing...");
			//关闭连接
			sin.close();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
