package Homework;

import java.util.HashMap;

/*
 * 输入身份证查询信息
 * 
 * */
public class IDUtil {
	static HashMap<String,String> map = new HashMap<String,String>();
	/*
	 * 根据身份证前6位号码号码查询归属地
	 * */
	static {
		map.put("440882", "010101地区");
		map.put("440802", "010102地区");
		map.put("440803", "010103地区");
		map.put("440804", "010104地区");
		map.put("440811", "010105地区");
		map.put("440883", "010106地区");
		map.put("440881", "010107地区");
		map.put("440823", "010108地区");
		map.put("440825", "010109地区");
	}
	
	public static String getAddress(String code) {
		//通过键获取值
		return map.get(code);
	}
	
	
}
