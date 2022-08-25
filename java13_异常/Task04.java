
public class Task04 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result;
		try {
			result = num1 / num2;
		} catch (Exception e) {
			System.out.println(11);
			return;
		}finally {
			return;
			//main方法,void无返回值,无法返回
		}
	}
}
