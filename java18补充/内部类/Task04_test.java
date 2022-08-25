package ÄÚ²¿Àà;

public class Task04_test {
	public static void main(String[] args) {
		Task04 outer = new Task04();
		Task04.inner ti = outer.new inner();
		ti.doStuff();
	}

}
