import java.util.Scanner;

public class Homework02_3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("��������ʽ");
    	double num1 = sc.nextDouble();
    	String op = sc.next();
    	double num2 = sc.nextDouble();
    	double result = 0;
    	//switch(���ͱ��ʽ){
    	//case 1: ���}
    	switch(op) {
    	case "+":
    		result = num1 + num2;
    		break;
    	case "-":
    		result = num1 - num2;
    		break;
    	case "/":
    		result = num1 / num2;
    		break;
    	case "*":
    		result = num1 * num2;
    		break;
    	case "%":
    		result = num1 % num2;
    		break;
    	}
    	System.out.println("result=" + result);
	
}
}
