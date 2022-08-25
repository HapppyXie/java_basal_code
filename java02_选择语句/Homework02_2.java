import java.util.Scanner;

public class Homework02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("«Î ‰»Î¿˚»Û");
		 long profit = sc.nextInt();
		 double bonus = 0;
		if(profit >= 1000000){
			 bonus += (profit - 1000000) * 0.001 + 400000 * 0.015 + 200000 * 0.003 + 200000 * 0.005 + 100000 * 0.07 + 100000 * 0.1; 
		 }else if(profit >= 600000) {
			 bonus += (profit - 600000)* 0.015 + 200000 * 0.003 + 200000 * 0.005 + 100000 * 0.07 + 100000 * 0.1; 
		 }else if(profit >= 400000) {
			 bonus += (profit - 400000) * 0.003 + 200000 * 0.005 + 100000 * 0.07 + 100000 * 0.1; 			 
		 }else if(profit >= 200000) {
			 bonus += (profit - 20000)* 0.005 + 100000 * 0.07 + 100000 * 0.1; 
		 }else if(profit >= 100000) {
			 bonus +=(profit - 100000)* 0.07 + 100000 * 0.1; 
		 }else{
			 bonus = profit * 0.1;
			 }
		 System.out.println("¿˚»Û£∫"+bonus);
		 }
	}


