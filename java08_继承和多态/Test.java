/*
 * 
 * 
 * */
public class Test {
	public static void main(String[] args) {
		Father f = new Father();
		f.setName("�");
		f.f1();
		f.f2(1);
		
		Father f1 = new Son();//��������
		
		Father f9 = new Father();
		Father f3 = new Son();
		
		System.out.println(f3 instanceof Son);//ת��ǰ�ɲ���,����true����ǿ������ת��
		Son s0 = (Son)f3;
		
		Father fg = new Son();
		Son so = (Son)fg;
		
		//���� ������ = (����)������	;	ǿ������ת��
		
		
		
		Son s = new Son();
		s.setName("��߸");//��Ϊ�̳�
		s.f1();
		s.f2(2);
		s.f3();
		s.setWeapon("�����");//׷������
		System.out.println("��߸����Ϊ"+s.getWeapon());
		
		Son2 s2 = new Son2();
		s2.setName("����");
		s2.getName();//s2.getName();ֻ�������ֵΪ������û�����
		System.out.println(s2.getName());
	}

}
