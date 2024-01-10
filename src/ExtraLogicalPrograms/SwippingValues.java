package ExtraLogicalPrograms;

public class SwippingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=67;
		int b=90;
		
		System.out.println("Before Swipping Values are..." +a+"   "+b);
		
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After Swipping Values are..." +a+"   "+b);

	}

}
