package mySocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MutliClientServer implements Runnable{
	
	static int SeriaNum = 0;//每个Client的序列号
	Socket socket;
	
	public MutliClientServer(Socket socket) {
		this.socket = socket;
	}
	
	public static void main(String[] args) {
		int maxClientNum = 5;
		try {
			//建立ServerSocket
			ServerSocket server = new ServerSocket(2000);
			for(int i =0; i <maxClientNum; i++) {
				Socket socket = server.accept();//相当与接受5次请求
				Thread t= new Thread(new MutliClientServer(socket));
				t.start();
				}
			server.close();//关闭服务器
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	


	public void run() {
		int myNum = ++SeriaNum;
		try {
			//通过socket接受连接上的输入、输出流
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			//创建标准输入流，从键盘接受数据
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));			
			
			//先读取Client发送的数据，然后从标准输入读取数据发给CLient
			String s;
			while(!(s=in.readLine()).equals("bye")) {
				System.out.println("Received from Client No."+myNum+":"+s);
				out.println(in2.readLine());
				out.flush();
				
			}
			System.out.println("The connection to Client no."+myNum+"is closing...");
			
			in2.close();
			out.close();
			in.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
