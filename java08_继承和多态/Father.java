/*
 * �̳У��̳п���ʹ��������и��׵����Ժͷ���,����׷�����Ժͷ���
 * 
 * 
 * */
public class Father {
	private String name;

	public String getName() {     
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void f1() {
		System.out.println(getName()+"ִ�и��෽��f1------------");
	}

	public void f2(int id) {
		System.out.println(getName()+"ִ�и��෽��f2------------"+id);
		
		
	}
}
