package ö������;

enum Week{
	//��Ϊö�����ͳ�����ʵ�ʾ���ö�����͵�һ��ʵ��
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
	
	 Week() {
		
	}
}

public class EnumValuesTest {
	public static void main(String[] args) {
		for(Week w:Week.values()) {
			System.out.print(w.name()+" ");
		}
		System.out.println();
		
		for(Week w:Week.values()) {
			System.out.print(w.ordinal()+" ");
		}
		System.out.println();
		
		for(Week w:Week.values()) {
			System.out.print(w.toString()+" ");
		}
		System.out.println();
	}
}
