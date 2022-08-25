package testMyself;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server implements Runnable{
	static int count = 0;
	Socket socket;
	public Server(Socket socket) {
		this.socket=socket;
	}
	
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(5001);
		int maxClient = 5;
		for(int i =0; i<maxClient; i++) {
			Socket socket = server.accept();
			Server.count++;
			Thread t = new Thread(new Server(socket));
			t.start();
		}
		server.close();
		System.out.println("xiaoxie server over!!!");
	}
	
	
	
	public void run() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			//Scanner sc = new Scanner(System.in);
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			String s;
			String reply = null;
			do {
				s = in.readLine();
				if(s.equals("bye")) {
					break;
				}
				System.out.println("the"+count+"client: "+s);
				reply = sin.readLine();
				out.println(reply);
				out.flush();
				
			}while(!reply.equals("bye"));
			System.out.println("over!!!");
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
