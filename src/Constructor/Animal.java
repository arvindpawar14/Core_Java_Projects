package Constructor;

public class Animal {
	
		String color;
		int age;
		void intobj(String a, int b) {
			color = a;
			age = b;
		}
		void Display(){
			System.out.println(color+" "+age);
		}
		public static void main(String[] args) {
			Animal n = new Animal();
			n.intobj("Black", 45);
			n.Display();
			
	}

}
