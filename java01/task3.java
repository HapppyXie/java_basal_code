
public class task3 {
	public static void main(String[] args) {
	//	int a = 11;
	 //int b = 12;
		//System.out.println(!(a>b)); //!��
	//	System.out.println((a != b) && (a > b)); //&&�c
		//System.out.println(!(a > b) || (a != b));//||�� 
		int a = 10;int b = 20;int c = 30;int d = 40;
		if(a++<b || c++>d) {
			System.out.println(a+","+b+","+c+","+d);  
			//������ֵ����һ���l�����棬�ѝM�㣬�ڶ�������//
		}
		if(++a>b && ++c>d) {  
			System.out.println(a+","+b+","+c+","+d);
		}//if(++a)Ҳִ��
		System.out.println(a+","+b+","+c+","+d);
	
		
	}
}
