package mySocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class MutliClientServer implements Runnable{
	
	static int SeriaNum = 0;//ÿ��Client�����к�
	Socket socket;
	
	public MutliClientServer(Socket socket) {
		this.socket = socket;
	}
	
	public static void main(String[] args) {
		int maxClientNum = 5;
		try {
			//����ServerSocket
			ServerSocket server = new ServerSocket(2000);
			for(int i =0; i <maxClientNum; i++) {
				Socket socket = server.accept();//�൱�����5������
				Thread t= new Thread(new MutliClientServer(socket));
				t.start();
				}
			server.close();//�رշ�����
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	


	public void run() {
		int myNum = ++SeriaNum;
		try {
			//ͨ��socket���������ϵ����롢�����
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			//������׼���������Ӽ��̽�������
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));			
			
			//�ȶ�ȡClient���͵����ݣ�Ȼ��ӱ�׼�����ȡ���ݷ���CLient
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
