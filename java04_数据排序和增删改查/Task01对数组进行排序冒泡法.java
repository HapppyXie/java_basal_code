/*
 * ������������� ð�ݷ� ѡ��
 * 
 * ð�ݷ� 1.����ð�ݴ�����ð�ݴ���������ʵ�ʸ�����1
 *      2.���ƱȽϴ�����ÿ��ð�ݱȽϴ�����1
 *      3.���ڵ����������бȽϣ�����������������ݽ��������������
 * 
 * */
public class Task01�������������ð�ݷ� {
	public static void main(String[] args) {
		int[] array = {9,8,14,0,2,5,89,4,2,7};
		//�ȴ�ӡ��ʼ����
		for(int s = 0 ; s < array.length ; s++) {
			System.out.print(array[s]+",");
		}
		System.out.println();
		System.out.println("------------");
		//��������ѭ���������������С��1    array.length=10
		int temp = 0;
		for(int i = 0 ; i < array.length-1 ; i++) {
			//����ÿ�����ݽ��бȽϵ�ѭ���Ĵ���  ��һ���� �Ƚϴ�����-��1-i��
			for(int j = 0 ; j < array.length-1-i ; j++) {
			   //���ڵ��������ȽϽ��������������ǽ��� �˴�����
				if(array[j] > array[j+1]) {
					//����λ�� ���������� ע�����˳��
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		      }
		   }
		//       ��ӡ����������
		for(int k = 0 ; k < array.length ; k++) {
			System.out.print(array[k]+",");
		}
		
		
		
		//   
		for(int i = 0 ; i < array.length-1 ; i++) {
			//����ÿ�����ݽ��бȽϵ�ѭ���Ĵ���  ��һ���� �Ƚϴ�����-��1-i��
			for(int j = 0 ; j < array.length-1-i ; j++) {
			   //���ڵ��������ȽϽ��������������ǽ��� �˴�����
				if(array[j] < array[j+1]) {
					//����λ�� ���������� ע�����˳��
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
		
				}
			}
		}
		System.out.println();
		System.out.println("------------");
		for(int s = 0 ; s < array.length ; s++) {
			System.out.print(array[s]+",");
		}
	}}

