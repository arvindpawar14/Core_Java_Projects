package Practice;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 8;
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			star=star-1;
		}
		for(int i=1; i<=8; i++) {
			for(int k=i; k<=star; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			star=star+1;
		}
	}

}
