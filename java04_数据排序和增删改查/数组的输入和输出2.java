import java.util.Scanner;

/*
 * 输入十名学生的成绩并打印出来
 * 
 * 
 * */
public class 数组的输入和输出2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //创建数组
		int [] score = new int[10];
	//	score[0] = 90;
		//score[1] = 80;
	//	score[2] = 60;
	//	score[3] = 70;
	//	score[4] = 20;
	//	score[5] = 50;  输入数据过程
	//	score[6] = 30;
	//	score[7] = 98;
	//	score[8] = 91;
	//	score[9] = 85; 利用循环结构控制数组的索引
		System.out.println("请输入十位同学的成绩：");
     for(int i = 0 ; i < score.length ; i++) {//score.length = 10
		 System.out.println("请输入第" + (i+1) + "名学生的成绩");//i+表示i加上1，i本身不变，而i++表示i在原来基础上加1，i的值改变
    	 score[i] = sc.nextInt();  //简洁输入
     }
     for (int i = 0; i < score.length; i++) {
		 System.out.print(score[i] + " ");  //简洁输出
	}
 
	}

}
