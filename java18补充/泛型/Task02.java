package java����;

import java.util.List;

class C1{
	
}
class C2 extends C1{
	
}

class Xu<T1 extends C1>{
	
	
}



public class Task02 {
	//����ͨ��� List�����Ǹ����ϣ������ж�����ͣ���֪���ᴫ��ʲôֵ�����ͺ�<?>����
	public static void printList(List<?> list) {
		
		
	}
	//���Ͷ���ķ��� �����޶��� (static) <����> ����ֵ ������(�β�){  			}
	public static <T1> void fx(T1 t1) {
		System.out.println(t1);
	} 
	
	
	public static void main(String[] args) {
		Xu<C2> f1 = new Xu<C2>(); //C2�̳�C1 XuҲ�̳�C1
		Xu<C1> f2 = new Xu<C1>(); 
		fx("acbx");
		fx(1);
		fx("k");
		fx(23.45);
		fx(true);
		fx(new C1());//δ��ʼ��������������
		fx(13);
	}

}
