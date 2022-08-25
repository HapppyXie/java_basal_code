package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Task01URL���� {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.baidu.com/");
		//URL����
		System.out.println("protocol:"+url.getProtocol());//���Э��
		System.out.println("host:"+url.getHost());//�����������
		System.out.println("filename:"+url.getFile());//����ļ���
		System.out.println("port:"+url.getPort());//��ö˿�
		System.out.println("ref:"+url.getRef());//�������
		
//��URL�ж�ȡҳ��Դ�� ͨ��URL���openStream()������ȡhttps://www.baidu.com/��������,Ȼ��תΪ�ַ���
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
