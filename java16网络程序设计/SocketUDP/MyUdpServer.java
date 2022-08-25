package SocketUDP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MyUdpServer {
	public static void main(String[] args) throws Exception {
		byte[] bytes = "���Client��UDPͨ�ŷ�ʽ".getBytes();
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = 
		new DatagramPacket(bytes,bytes.length,address,10001);
		
		DatagramSocket socket = new DatagramSocket();//ûд(int)�����ñ�������˿ڷ���
		socket.send(packet);
		
		socket.close();
	}
}
