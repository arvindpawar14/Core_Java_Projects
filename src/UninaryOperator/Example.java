package UninaryOperator;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		short s = 21;
		float f = 15;
		double d = 50;
		
		
		byte b = (byte) (a+1); // explicit Casting Performed on integer data types
		double c = a;			// implicit Casting performed on integer data types
		int e = (int) d; 		// explicit Casting performed on double data types
		System.out.println(c);  
		System.out.println(b);
		System.out.println(e);
	}

}
