package Star.pattern.logical.program;

public class Example5 {

	public static void main(String[] args) {
		//*****
		//******
		//*******
		//********
		//*********
		//**********
		//***********
		//************
		int star=5;
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*"+ "  ");
			}
			System.out.println();
			star++;
		}
		
		
		
	}

}
