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
		byte[] bytes = "你好Client，UDP通信方式".getBytes();
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = 
		new DatagramPacket(bytes,bytes.length,address,10001);
		
		DatagramSocket socket = new DatagramSocket();//没写(int)参数用本地任意端口发出
		socket.send(packet);
		
		socket.close();
	}
}
