package Homework;
/*
 * ͳ��һ���ִ��������г��ֵĴ���
 * 
 * */
public class Homework01 {
	public static String subStr = "you";
	public static String allStr = "Hi,how are you?I'm fine,thank you,and you?";
	public static void main(String[] args) {
			System.out.println("�����ִ�ϵͳ���У�");
			System.out.println(allStr.length());
			int count1 = 0;
		for(int i = 0; i < allStr.length()-subStr.length(); i++) {
			String temp = allStr.substring(0+i,subStr.length()+i);
				if(temp.equalsIgnoreCase(subStr)) {
					count1 += 1;
				}
			}
		System.out.println(count1);
		
		System.out.println("------------------");
		
		int index = 0;
		int count2 = 0;
		while(true) {
			index = allStr.indexOf(subStr);//�÷�������״γ��ֵ��ִ�������
			if(index != -1) {
			count2++;
			System.out.println(index);
								//�״γ���λ��+�ִ���С
			allStr = allStr.substring(index+subStr.length());
			}else {
				break;
			}
		}
		System.out.println(count2);
		
		}
	}
	
