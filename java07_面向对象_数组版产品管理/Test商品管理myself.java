import java.util.Scanner;


public class Test��Ʒ����myself {
	
	public static Product [] p1 = new Product[20]; 
	public static Scanner sc = new Scanner(System.in);
	public static int maxIndex = -1;

	
	public static void main(String[] args) {
		while(true) {
      System.out.println("��Ʒ������ѡ�����");
      System.out.println("---------");
      System.out.println("1.������Ʒ    2.ɾ����Ʒ");
      System.out.println("3.�޸���Ʒ    4.��ѯ��Ʒ");
      System.out.println("5.��ӡ��Ʒ��Ϣ 6.�˳�ϵͳ");
            int select = sc.nextInt();
            switch(select) {
            case 1:
            	save();
            	break;
            case 2:
            	delete();
            	break;
            case 3:
            	update();
            	break;
            case 4:
            	query();
            	break;
            case 5:
            	printAll();
            	break;
            case 6:
            	System.exit(0);
            	System.out.println("�˳�ϵͳ�ɹ�");
            }
		}
	}


	
	private static void save() {
		//���ӷ��� ��Ҫ���� id name category price stock describtion state 
		//���� id �� state ϵͳ�Զ�ƥ��  id��������maxIndex+1����
		  System.out.println("������Ʒ����ҳ��");
		  maxIndex++;
          int id = maxIndex+1;
          System.out.println("����");
          String name = sc.next();
          System.out.println("���");
          String category = sc.next();
          System.out.println("�۸�");
          double price = sc.nextDouble();
          System.out.println("���");
          int stock = sc.nextInt();
          System.out.println("����");
          String describtion = sc.next();
          int state = 1;
          //��϶���,�ȴ���һ��Product���͵Ķ���p����������Ʒ��Ϣ 
          Product p = new Product(id,name,category,price,stock,describtion,state);
		  //�ٽ�����p��Ϊ�����е�һ�����p1����
          p1[maxIndex] = p;
          System.out.println("������Ʒ�ɹ�");
	}


	private static void delete() {
		System.out.println("����ɾ��ҳ��");
		System.out.println("������Ҫɾ������Ʒ���");
		int id = sc.nextInt();
		int index =id-1;
		int flag = 0;
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(index == i) {
				flag = 1;
				System.out.println(p1[index]);
				System.out.println("ȷ��ɾ���� 1�� 0��");
				int answer = sc.nextInt();
				if(answer == 1) {
					p1[index].setState(0);
					System.out.println("ɾ���ɹ�");
				}else{
					System.out.println("ȡ��ɾ��");
				}
			}
			}
		if(flag == 0) {
			System.out.println("û���ҵ��ñ�ŵ���Ʒ");}
	}


	private static void update() {
		// �޸���Ʒ �����½������ݣ���id��state����
		//��ͨ������ҵ�����Ʒ
		System.out.println("��������");
		int id = sc.nextInt();
		int index = id-1;
		//�÷��Ҳ��ҵõ�
		int flag = 0;
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(index == i) {
				if(p1[index].getState() == 1) {
					System.out.println(p1[index]);
					flag = 1;
				}else {
					System.out.println("����Ʒ�ѱ�ɾ��");}
			}
		}
		if(flag == 1) {
	    System.out.println("����������");
		System.out.println("����");
        String name = sc.next();
        System.out.println("���");
        String category = sc.next();
        System.out.println("�۸�");
        double price = sc.nextDouble();
        System.out.println("���");
        int stock = sc.nextInt();
        System.out.println("����");
        String describtion = sc.next();
		
		//������϶��󣬿�ѡ�����������ϣ������Ϳ��Բ���һЩ����
		Product p = new Product(id,name,category,price,stock,describtion,1);
		p1[index] = p;
		System.out.println("�޸ĳɹ�");
		}else {System.out.println("û���ҵ��ñ�ŵ���Ʒ");}
	}


	private static void query() {
		// ������Ʒ 
		System.out.println("�������ҳ��");
		System.out.println("------------");
		System.out.println("��������Ʒ���id");
		int id = sc.nextInt();
		int index = id-1;
		int flag = 0;
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(index == i) {
		       if(p1[index].getState() == 1) {
		    	   System.out.println(p1[index]);
		    	   flag = 1;
		       }else {
		    	   System.out.println("����Ʒ�ѱ�ɾ��");
		       }
			}
		}
		if(flag == 0) {
			System.out.println("û�в��ҵ��ñ�ŵ���Ʒ");
		}
		
	}


	private static void printAll() {
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(p1[i].getState() == 1) {
				System.out.println(p1[i]);
			}
		}
		
	}


		

}
