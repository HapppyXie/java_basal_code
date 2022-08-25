package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//���������նˣ��������ݶ�ʧ
public class MyUdpClient {
	public static void main(String[] args) throws Exception {
		byte [] bytes = new byte[10];
		DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
		DatagramSocket socket = new DatagramSocket(10001);//�󶨿ͻ��˵�1000�˿�
		socket.receive(packet);
		
		//������ݱ�
		int length = packet.getLength();
		int port = packet.getPort();
		InetAddress address = packet.getAddress();
		String host = address.getHostAddress();
		
		System.out.println(new String(bytes,0,length)+"...."+port+"..."+host);
		
		socket.close();
 	}
}
