package socket文件上传;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/**
 * 
 * 	1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口好
	2.使用Socket对象中的方法getOutStream()获取网络字节输出对象
	3.使用网络字节流OutStream对象中的方法write(),给服务器发送数据
	4.使用Socket对象中的方法getInputStream()获取网络字节输入对象
	5.使用网络字节流InputStream对象中的方法read(),读取服务器写回的数据
	6.释放资源close(Socket)
 * 
 */

public class TCPClient {
	public static void main(String[] args) throws IOException{
//		//	1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口好
//		Socket socket = new Socket("127.0.0.1",8888);
//		//2.使用Socket对象中的方法getOutStream()获取网络字节输出对象
//		OutputStream out = socket.getOutputStream();
//		//3.使用网络字节流OutStream对象中的方法write(),给服务器发送数据
//		out.write("你好服务器!!".getBytes());
//		
//		//4.使用Socket对象中的方法getInputStream()获取网络字节输入对象
//		InputStream in = socket.getInputStream();
//		//5.使用网络字节流InputStream对象中的方法read(),读取服务器写回的数据
//		byte [] bytes = new byte[1024];
//		int len = in.read(bytes);
//		System.out.println(new String(bytes,0,len));
//		//6.释放资源close(Socket)
//		socket.close();
		
/*
 * 
 * 	1.客户端使用本地字节输出流，读取要上传的文件
	2.客户端使用网络字节流，把读取的文件上传到服务器
	
	3.服务器使用网络字节输入流，读取客户端上传的文件
	4.服务器使用本地字节流，把读取的文件，保存到服务器的硬盘上
	
	5.服务器使用网络字节输出流，给客户回一个"上传成功"
	6.客户端使用网络字节输入流，读取服务器写回的数据
	
	7.释放资源
*/		
	//文件上传案例
	//数据源：C:\Users\mike\Pictures\联想锁屏壁纸\小猫.jpg
	//目的地：服务器	
		//1.客户端使用本地字节输出流读取文件
	FileInputStream fis = new FileInputStream("C:\\Users\\mike\\Pictures\\联想锁屏壁纸\\小猫.jpg");
		//2.创建Socket对象，绑定服务器IP地址和端口号
	Socket socket = new Socket("127.0.0.1",8888);
		//3.使用Socket对象方法获取网络输出流
	OutputStream os = socket.getOutputStream();
		//4.使用本地字节输入流FileInputStream对象中的read,读取文件到缓冲区
	
	System.out.println("333333333333333333333");
	
	int len = 0;
	byte[] bytes = new byte[1024];
	
	while((len = fis.read(bytes)) != -1) {
		//5.使用网络输出流OutputStream的write,把文件上传到服务器
		os.write(bytes,0,len);
	}
	//解决：上传完文件，给服务器一个结束标记
	//shutdownOutput​() 禁用此套接字的输出流。
	socket.shutdownOutput();
	
	System.out.println("44444444444444444444 while死循环打印不到");

	
	//6.使用Socket重大getInputStream,获取网络字节输入流InputStream对象
	InputStream is = socket.getInputStream();
	//7.读取网络字节输入流对象中的read读取服务器写回的数据
	while((len = is.read(bytes)) != -1) {
		System.out.println(new String(bytes,0,len));
	}
	
	//8.释放资源
	is.close();
	socket.close();
	os.close();
	fis.close();
			
	}
}
