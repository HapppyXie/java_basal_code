package API快速入门1;

public class Homework02 {
	public static void main(String[] args) {
		StringBuilder pwd = new StringBuilder("123456789");
		
		System.out.println(afterEncoding(pwd));
		
	}

	private static StringBuilder afterEncoding(StringBuilder pwd) {
		// TODO Auto-generated method stub
		StringBuilder before = pwd;
		before.insert(3, "pwd");
		before.append("123");
		before.reverse();
		return before;
		
	}

}
