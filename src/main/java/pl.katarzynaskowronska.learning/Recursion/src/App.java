
public class App {

	public static void main(String[] args) {
		//System.out.println("Hello");
		//int value = 4;
		//E.g. 4! = 4*3*2*1 (factorial 4)
		
		
		//calculate(4);
		
		//System.out.println(value);
		
		factorial(3);
		System.out.println(factorial(3));
	}
	
//	private static void calculate(int value) {
//		//System.out.println("Hello");
//		//value = value -1;
//		System.out.println(value);
//		
//		if (value ==1 ) {
//			return;
//		}
//		calculate(value);
//	}
	
	private static int factorial(int value) {
		//System.out.println(value);
		if(value == 1) {
			return 1;
		}
		return factorial(value - 1)* value;
	}
	//Tower of Hanoi

}
