/* for循环结构   确定循环次数的情况
 *  for(表达式1;表达式2;表达式3){
 *   允许没有表达式1 表达式3 但要保留分号
 *       循环语句
 *  }先执行表达式1 再判断表达式2 真则执行循环语句 再执行表达式3 再判断表达式2.....
 *                         假则跳出
 * 
 * */
public class Task01循环for {
	public static void main(String[] args) {
		for(int count = 1; count <= 3; count++) {
			System.out.println("重要的事说三遍");
		}
		
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.println("要及时完成课后任务");
		}
	}

}
