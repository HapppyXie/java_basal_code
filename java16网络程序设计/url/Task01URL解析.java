package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Task01URL解析 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.baidu.com/");
		//URL解析
		System.out.println("protocol:"+url.getProtocol());//获得协议
		System.out.println("host:"+url.getHost());//获得主机域名
		System.out.println("filename:"+url.getFile());//获得文件名
		System.out.println("port:"+url.getPort());//获得端口
		System.out.println("ref:"+url.getRef());//获得引用
		
//从URL中读取页面源码 通过URL类的openStream()方法获取https://www.baidu.com/的输入流,然后转为字符流
//public final InputStream openStream() throws IOException;
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(url.openStream()));
		String inputLine;
		while((inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		br.close();
		
		
		
		
		
		
		
		
	}

}
