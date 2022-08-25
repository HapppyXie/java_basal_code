package URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Task02»ùÓÚURLConnectionµÄ¶ÁÐ´ {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.baidu.com/");
		URLConnection urlcon = url.openConnection();
		
		BufferedReader br = 
	new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
		
		String inputLine;
		while((inputLine=br.readLine())!=null) {
			System.out.println(inputLine);
		}
		br.close();
		
//		URL url = new URL("https://www.baidu.com/");
//		URLConnection urlcon = url.openConnection();
//		urlcon.setDoOutput(true);
//		PrintWriter pw = new PrintWriter(urlcon.getOutputStream());
//		pw.println("String");
//		pw.close();
		
	}
}
