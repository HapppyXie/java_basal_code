package Homework;
/*
 * 统计一个字串在整串中出现的次数
 * 
 * */
public class Homework01 {
	public static String subStr = "you";
	public static String allStr = "Hi,how are you?I'm fine,thank you,and you?";
	public static void main(String[] args) {
			System.out.println("查找字串系统运行：");
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
			index = allStr.indexOf(subStr);//该方法获得首次出现的字串的索引
			if(index != -1) {
			count2++;
			System.out.println(index);
								//首次出现位置+字串大小
			allStr = allStr.substring(index+subStr.length());
			}else {
				break;
			}
		}
		System.out.println(count2);
		
		}
	}
	
