/*
 * ѡ��
 * 1.������������Ҫ�к���Ҫ�Ƚϵ���-�õ������ڶ�����
 * 2.���ƱȽϵ����������ĺ���������-i+1��length-1
 * 3.������i�ͺ���������j���бȽ�
 * 
 * */
public class Task02�������������ѡ�� {
	public static void main(String[] args) {
	    //��������������Ҫ���бȽϵ���
		int[] array = {9,8,14,0,2,5,87,34,25};//array.length=9
		//��ӡ��ʼ����
		for(int a = 0 ; a < array.length ; a++) {
			System.out.print(array[a]+",");
		}
		int temp = 0;
		//�������������  ��������Ҫ���бȽϵ���0����array.lengt-1
		//   �˴� i <= array.length-2 
		for(int i = 0 ; i < array.length-1 ; i++) {
			for(int j = i+1 ; j < array.length ; j++) {
				 //�õ������ͺ������е������бȽ� 
				//array[i]�� array[j]=array[i+1] ���бȽ� 
				//��������ͽ���       //�ı����С�ںż��ɸı�������
				if(array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
				
				 
			}
		}
		//����
		System.out.println();
		System.out.println("------------");
		//��ӡ����������
		for(int s = 0 ; s < array.length ; s++) {
			System.out.print(array[s]+",");
		}
		
	}

}
