/*
 * 
 * 
 * */
public class Son extends Father {
	private String weapon;// Ҳ����׷�����Ժͷ���

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	//���������¶������Ժͷ���

	@Override //ע��  �����¶��巽��
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"ִ�����෽��f1--------------");
		//super.f1();//super.f1();����ø���f1������
	}

	@Override
	public void f2(int id) {
		// TODO Auto-generated method stub
		System.out.println(getName()+"ִ�����෽��f2--------------"+id);
		//super.f2(id);
	}
	
	//����׷�ӷ���
	public void f3() {
		System.out.println(getName()+"ִ�����෽��f3---------------");
	}
	
	
	
	
}
