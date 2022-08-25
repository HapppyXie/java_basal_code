package socket文件上传;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/*
 * TCP通信的服务器：接受客户端的请求，读取客户端发送的数据，给客户端写回数据
 * 表示服务器的类：java.net.ServerSocket:此类实现服务器套接字
 * 构造方法
 * public ServerSocket​(int port)
 * 
 * 		1.创建ServerSocket对象和系统要指定的端口号
		2.使用ServerSocket对象中的方法accept()获取客户端Socket对象
		
		3.使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
		4.使用网络字节输入流InputStream对象中的read,读取客户端发送的数据
		
		5.使用Socket对象中网络字节流getOutputStream获取网络字节输出流OutputStream()
		6.使用网络字节输出流OutputStream对象中的write,给客户端回响数据
		   
		7.释放资源socket.close()
				server.close()
 * 
 * */
public class TCPServer {
	public static void main(String[] args) throws IOException {
//		//1.创建ServerSocket对象和系统要指定的端口号
//		ServerSocket server = new ServerSocket(8888);
//		//2.使用ServerSocket对象中的方法accept()获取客户端Socket对象
//		Socket socket =  server.accept();
//		//3.使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
//		InputStream is = socket.getInputStream();
//		//4.使用网络字节输入流InputStream对象中的read,读取客户端发送的数据
//		byte [] bytes = new byte[1024];
//		int len = is.read(bytes);
//		System.out.println(new String(bytes,0,len));
//		
//		//5.使用Socket对象中网络字节流getOutputStream获取网络字节输出流OutputStream()
//		OutputStream os = socket.getOutputStream();
//		//6.使用网络字节输出流OutputStream对象中的write,给客户端回响数据
//		os.write("收到，谢谢".getBytes());
//		//7.释放资源close(Socket,ServerSocket)
//		socket.close();
//		server.close();
//		//一闪而过
		
		
		//数据源:客户上传的对象
		//目的地：服务器硬盘：C:\Users\mike\Desktop\1.jpg
		//1.创建ServerSocket对象和系统要指定的端口号
		ServerSocket server = new ServerSocket(8888);
		//2.使用ServerSocket对象中的方法accept()获取客户端Socket对象
		Socket socket = server.accept();
		//3.使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
		InputStream is = socket.getInputStream();
		//4.判断文件夹存不存在
		File file = new File("C:\\Users\\mike\\Desktop\\myPhoto");
		if(!file.exists()) {
			file.mkdir();
		}
		//5.创建一个本地输出流FileOutputStream对象，
		//file+"1.jpg" 缺少\\
		FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
		//6.使用网络字节输入流InputStream的read,读取客户端上传的文件
		
		System.out.println("11111111111111111111111111");
		
		
		int len = 0;
		byte[] bytes = new byte[1024];
		while((len=is.read(bytes))!=-1) {
			//7.使用本地输出流把文件写道硬盘上
			fos.write(bytes,0,len);
		}
		
		System.out.println("2222222222222222222222222 while死循环打印不到");
		
		//8.使用Socket对象的getOutputStream，获得网络输出流，并给客户端发送"上传成功"
		OutputStream os = socket.getOutputStream();
		os.write("上传成功".getBytes());
		//9.释放资源
		os.close();
		fos.close();
		socket.close();	
		server.close();
		
		//执行后客户端和服务器端都没有停止下来
		//客户端 fis.read(bytes)读取文件，结束标记是读取到-1
		//while循环，一直在读
		
		//服务器端： is.read(bytes),永远读不到-1  read()方法进入到死循环
		//8,9不执行  -> 不会给客户端回写，"上传成功"
		
		//解决：上传完文件，给服务器一个结束标记
		
	}
}
