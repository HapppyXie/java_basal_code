package java����;

import java.util.*;//��������util�ӿ�

//ͨ���   
class Cage<E> extends LinkedList<E>{
	//����Cage���ͼ���
}
class Animal{
	public void feedMe() {
		//����������
	}
}
class Lion extends Animal{
	public void feedMe() {//������������Lion
		System.out.println("Feding lions");
	}
}
class Butterfly extends Animal{
	public void feedMe() {//������������Butterfly
		System.out.println("Feeding butterflies");
	}
}
//����ͨ���
public class TextBook02 {
	public static void main(String[] args) {
		TextBook02 t = new TextBook02();//����һ�����Զ���
		Cage<Lion> lionCage = new Cage<Lion>();//��һ�����������һ�����ͼ��ϣ��γ�һ��ʨ�Ӽ���Cage�Ķ���
		Cage<Butterfly> butterflyCage = new Cage<Butterfly>();//ͬ��
		lionCage.add(new Lion());//������������ʨ�������
		butterflyCage.add(new Butterfly());
		t.feedMe(lionCage);
		t.feedMe(butterflyCage);
//ͨ�����Զ���������Ա����feedMe(),���뼯�϶��󣬶�ÿ�����϶�����б������Դ˵��������feedMe() 
	}
	//<?>������ͨ��� ����δ֪���࣬��<? extends Object>�ȼ�
	void feedMe(Cage<? extends Animal> someCage) {
		for(Animal a:someCage)
			a.feedMe();
	}
	

}
