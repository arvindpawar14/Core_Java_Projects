package ExtraLogicalPrograms;

public class SwippingTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 60;
		int b= 90;
		
		System.out.println("Before Swipping: "+a+"    "+b);
		
		int t = a;
		a=b;
		b=t;
		
		System.out.println("After Swipping: "+a+"    "+b);

	}

}
