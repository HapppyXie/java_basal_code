package Homework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Homework03 {
	public static IDUtil idl = new IDUtil();
	public static void main(String[] args) {		
	while(true) {
		//输入身份证号
		String id = getId();
		//查询身份证信息
		queryID(id);
	}	}

	private static String getId() {
		Set<Entry<String, String>> m1 = idl.map.entrySet();
		System.out.println("只存储了湛江地区");
		for(Entry<String, String> keyAndvalue : m1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		System.out.println("------------------------------");
		String id = "";
		String regex = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入身份证号码:");
			id = sc.next();
			if(id.matches(regex)) {
				return id;
			}else {
				System.out.println("输入数据格式错误，请重新输入！");
			}
		}
	}

	private static void queryID(String id) {
		//截取前6位
		String addrCode = id.substring(0, 6);
		String address = idl.getAddress(addrCode);
		//截取生日
		String dateCode = id.substring(6,14);
		String brithday = dateCode.substring(0, 4)+"年"+dateCode.substring(4,6)+"月"+dateCode.substring(6,8)+"日";
		//截取第17位
		int sexCode = Integer.parseInt(id.substring(16,17));
		String sex = "";
		if(sexCode % 2 == 0) {
			sex = "女";
		}else {
			sex ="男";
		}
		System.out.println("地区"+address);
		System.out.println("生日"+brithday);
		System.out.println("性别"+sex);
	}

}
