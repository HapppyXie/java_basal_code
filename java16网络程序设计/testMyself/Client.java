package testMyself;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1",5001);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		//Scanner sc = new Scanner(System.in); 无法接受有空格的字符
		BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String reply = null;
		do {
			s=sin.readLine();
			out.println(s);
			out.flush();
			if(s.equals("bye")) {
				break;
			}
			reply = in.readLine();
			System.out.println("server: "+reply);
		}while(!reply.equals("bye"));
		System.out.println("Over!!!");
		
		out.close();
		in.close();
		socket.close();
	}
}
