package socket文件上传优化;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
	public static void main(String[] args) throws IOException {	
		ServerSocket server = new ServerSocket(8889);
	while(true) {	
		Socket socket = server.accept();		
		/*
		 * 使用多线程提高程序效�?
		 * 有一个客户端上传文件，就�?启一个线程完成文件上�?
		 * */
		new Thread(new Runnable() {
			//使用匿名�? 完成文件的上�?,此处相当于实例化了一个接口，并没有创建Runnable实例�?
			@Override
			public void run() {
				
				try {
					InputStream is = socket.getInputStream();
					File file = new File("C:\\Users\\mike\\Desktop\\myPhoto");
					if(!file.exists()) {
						file.mkdir();
					}
					
		String filename = "itcast"+System.currentTimeMillis()+new Random(999999)+".jpg";
					
				 FileOutputStream fos = new FileOutputStream(file+"\\"+filename);
					
				 System.out.println("11111111111111111111111111");
					
					int len = 0;
					byte[] bytes = new byte[1024];
					while((len=is.read(bytes))!=-1) {
						fos.write(bytes,0,len);
					}
					System.out.println("2222222222222222222222222 while死循环打印不�?");
					
					OutputStream os = socket.getOutputStream();
					os.write("上传成功".getBytes());
					
					os.close();
					fos.close();
					socket.close();	
				} catch (Exception e) {
				e.printStackTrace();
				}	
			}	//run		
		}).start();	//Thread
	
		//服务器不用关闭，�?直处于监�?
		//server.close();
		
		//执行后客户端和服务器端都没有停止下来
		//客户�? fis.read(bytes)读取文件，结束标记是读取�?-1
		//while循环，一直在�?
		
		//服务器端�? is.read(bytes),永远读不�?-1  read()方法进入到死循环
		//8,9不执�?  -> 不会给客户端回写�?"上传成功"
		
		//解决：上传完文件，给服务器一个结束标�?		
	}
	}
}
