package Homework2�̳кͶ�̬;

public class Test {
	public static void main(String[] args) {
		//���Ը���  
		//�޲ι������
		Phone p1 = new Phone();
		p1.setType("ƻ��8");
		p1.setColor("��ɫ");
		p1.setPrice(2000);
		System.out.println(p1);
		
		//�����вι���
		Phone p2 = new Phone("ƻ��8s","��ɫ",2400);
		System.out.println(p2);
		//���� ��绰 ������ ����������
		p2.call("13428394849");
		p2.sendMessage("13428394849", "�ǵóԷ�");
		p2.sendMessage("13428394849", 9);//����9�������
		
		//����1����
		//�޲β���
		Son1HuaWei h1 = new Son1HuaWei();
		h1.setType("��ҫ");
		h1.setColor("��ɫ");
		h1.setPrice(3000);
		System.out.println(h1);
		h1.call("����");
		
		//����2����
		Son2Vivo v1 = new Son2Vivo();
		v1.setType("x30");
		v1.setColor("��ɫ");
		v1.setPrice(2600);
		System.out.println(v1);
		v1.getPhoto("����");
		v1.play("������ҫ");
		
		Phone v2 = new Son2Vivo();//��ת��  �����Phone��
		v2.call("13428394849");
		v2.sendMessage("èè", "��ȥ��");
//		v2.getPhoto("���Լ�");//������û��
//		v2.play("cod");
		
		
		
	}

}
