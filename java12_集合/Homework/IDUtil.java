package Homework;

import java.util.HashMap;

/*
 * �������֤��ѯ��Ϣ
 * 
 * */
public class IDUtil {
	static HashMap<String,String> map = new HashMap<String,String>();
	/*
	 * �������֤ǰ6λ��������ѯ������
	 * */
	static {
		map.put("440882", "010101����");
		map.put("440802", "010102����");
		map.put("440803", "010103����");
		map.put("440804", "010104����");
		map.put("440811", "010105����");
		map.put("440883", "010106����");
		map.put("440881", "010107����");
		map.put("440823", "010108����");
		map.put("440825", "010109����");
	}
	
	public static String getAddress(String code) {
		//ͨ������ȡֵ
		return map.get(code);
	}
	
	
}
