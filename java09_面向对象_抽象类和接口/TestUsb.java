
public class TestUsb {
	public static void main(String[] args) {
		Udisk u1 = new Udisk();
		u1.input();
		u1.output();
		u1.charge();
		System.out.println(u1.length);
		System.out.println(u1.width);
		//u1.length = 13;  //������ȥ�� public static ���� final ,���޷����¸�ֵ
						 //��Ĭ���� public static final����
	}

}
