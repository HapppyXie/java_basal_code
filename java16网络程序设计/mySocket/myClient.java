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
			
			//�������ӣ�ͨ��Socket��ȡ���룬�����
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			//��������ֽ��������ֽ���ת��Ϊ�ַ�������ת��Ϊ���������൱���ϸ��٣�
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//������׼���������Ӽ��̽�������-��out���
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
					//�޷��ӷ������˽�����ֻ�ܴӿͻ��˷���bye����Ч
					System.out.println("The connection to server is closing...");
				}
			}while(!s.equals("bye"));
					
			//�ر�����
			in.close();
			sin.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
