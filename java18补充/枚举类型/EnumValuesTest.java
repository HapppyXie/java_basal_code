package 枚举类型;

enum Week{
	//此为枚举类型常量，实际就是枚举类型的一个实例
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
	
	 Week() {
		
	}
}

public class EnumValuesTest {
	public static void main(String[] args) {
		for(Week w:Week.values()) {
			System.out.print(w.name()+" ");
		}
		System.out.println();
		
		for(Week w:Week.values()) {
			System.out.print(w.ordinal()+" ");
		}
		System.out.println();
		
		for(Week w:Week.values()) {
			System.out.print(w.toString()+" ");
		}
		System.out.println();
	}
}
