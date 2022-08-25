import java.util.Scanner;


//switch 实现成绩等级判断
// 
public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = sc.nextInt();
		//将分数段转换为确定的值
		//97 / 10   9  96 / 10  9
		switch(score / 10) {
		case 10://case 10:后没有语句 执行下一个case的语句
		case 9: //若一个语句后没有break 继续执行 知道有break输出
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		default: //default与其顺序无关 总是在没有对应的case后才执行
			System.out.println("E");
		}
		
	}

}
