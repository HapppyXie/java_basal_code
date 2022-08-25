package mySocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;

public class myClient {
	public static void main(String[] args) {
		try {
			Socket socket =new Socket("127.0.0.1",1900);
			
			//建立连接，通过Socket获取输入，输出流
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			//获得网络字节流，将字节流转换为字符流，再转换为缓冲流（相当与上高速）
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//创建标准输入流，从键盘接受数据-让out输出
			BufferedReader sin = 
		new BufferedReader(new InputStreamReader(System.in));
			String s;
			do {
				s = sin.readLine();
				out.println(s);
				out.flush();
				if(!s.equals("bye")) {
					System.out.println("@ Server response: "+in.readLine());
				}else {
					//无法从服务器端结束，只能从客户端发送bye才有效
					System.out.println("The connection to server is closing...");
				}
			}while(!s.equals("bye"));
					
			//关闭连接
			in.close();
			sin.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
