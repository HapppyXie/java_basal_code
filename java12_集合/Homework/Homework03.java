package Homework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Homework03 {
	public static IDUtil idl = new IDUtil();
	public static void main(String[] args) {		
	while(true) {
		//�������֤��
		String id = getId();
		//��ѯ���֤��Ϣ
		queryID(id);
	}	}

	private static String getId() {
		Set<Entry<String, String>> m1 = idl.map.entrySet();
		System.out.println("ֻ�洢��տ������");
		for(Entry<String, String> keyAndvalue : m1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		System.out.println("------------------------------");
		String id = "";
		String regex = "^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$";
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("���������֤����:");
			id = sc.next();
			if(id.matches(regex)) {
				return id;
			}else {
				System.out.println("�������ݸ�ʽ�������������룡");
			}
		}
	}

	private static void queryID(String id) {
		//��ȡǰ6λ
		String addrCode = id.substring(0, 6);
		String address = idl.getAddress(addrCode);
		//��ȡ����
		String dateCode = id.substring(6,14);
		String brithday = dateCode.substring(0, 4)+"��"+dateCode.substring(4,6)+"��"+dateCode.substring(6,8)+"��";
		//��ȡ��17λ
		int sexCode = Integer.parseInt(id.substring(16,17));
		String sex = "";
		if(sexCode % 2 == 0) {
			sex = "Ů";
		}else {
			sex ="��";
		}
		System.out.println("����"+address);
		System.out.println("����"+brithday);
		System.out.println("�Ա�"+sex);
	}

}
