
public class Application {

	public static void main(String[] args) {

		short shortValue = 55;
		byte byteValue = 20;
		int intValue = 888;
		long longValue = 23333;

		float floatValue = 8893.3f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Byte.MAX_VALUE);

		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		//The following will not work as we expect it to
		//128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue);
		
		
	}

}
