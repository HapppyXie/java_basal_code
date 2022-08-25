package √∂æŸ¿‡–Õ;

enum Coin{
	Penny(1),Nickel(5),Dime(10),Quarter(25);
	
	private final int value;
	Coin(int value){
		this.value = value;
	}
	
	public int value() {
		return value;
	}
}

enum CoinColor{
	Cooper,Nickel,Silver;
}

public class CoinTest {
	public static void main(String[] args) {
		for(Coin c:Coin.values()) {
			System.out.print(c+" "+c.value()+",");
		switch(c) {
		case Penny:
			System.out.println(CoinColor.Cooper);
			break;
		case Nickel:
			System.out.println(CoinColor.Nickel);
			break;
		case Dime:
		case Quarter:
			System.out.println(CoinColor.Silver);
			break;
		}
		}
	}
}
