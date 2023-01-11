package Teoria;

public class teoria {

	public static void main(String[] args) {
		
		//condizione ? true : false
		int x = 10;
		int y = 20;
		
		int z = (x > y) ? -100 : 100;
		System.out.println(z);
		
		System.out.println(getValue(4,3,5));
		
		
		String favColor = "blue";
		switch(favColor) {
			case "red":
				System.out.println("hot color");
				break;
			case "blue":
				System.out.println("cold color");
				break;
			default:
				System.out.println("unknown color");
		}
		
		//se non c'è break esegue anche quello dopo quindi il boh in questo caso
		int num = 2;
		switch(favColor) {
			case "red":
				System.out.println("se sono rosso");
			case "blue":
				num = 3;
				System.out.println("se sono blu");
			case "sdfgfa":
				System.out.println("boh");
		}
		System.out.println(num);
		
		System.out.println("---------------------------------"); //spaziatrice per console
		
		
		
		
		
		
		
		
		
	}
	
	static int getValue(int a, int b, int c) {
		// se a è maggiore di b = se a maggiore di c = se b è minore di c allora il risultati è i primo o secondo
		return (a > b ) ? ((a > c) ? a: c): ((b> c) ? b: c);
	}

}
