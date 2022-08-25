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
			
			//�ȶ�ȡClient�����ݣ�Ȼ��ӱ�׼�����ȡ���ݷ��͸�Client
			String s;
			while(!(s = in.readLine()).equals("bye")) {
				System.out.println("Recevied from Client: "+s);
				out.println(sin.readLine());
				out.flush();
				
			}
			System.out.println("The connection is closing...");
			//�ر�����
			sin.close();
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
