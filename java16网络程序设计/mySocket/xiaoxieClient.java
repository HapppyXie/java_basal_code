package mySocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class xiaoxieClient {
	public static void main(String[] args) {
			try {
				Socket socket = new Socket("127.0.0.1",2500);
				
				PrintWriter out = 
				new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				BufferedReader in = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedReader sin = 
				new BufferedReader(new InputStreamReader(System.in));
				
				String s;
				String temp;
				do {
					s=sin.readLine();
					out.println(s);
					out.flush();
					if(!s.equals("bye")){
						temp = in.readLine();
						System.out.println("收到来自服务端："+temp);
						if(temp.equals("bye")) {
							System.out.println("服务器端发送bye,结束通信");
							break;
						}
					}else {	
						System.out.println("客户端发送bye，结束通信");						
					
					}										
				}while(!s.equals("bye"));
				sin.close();
				in.close();
				out.close();
				socket.close();
				
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	}
}
