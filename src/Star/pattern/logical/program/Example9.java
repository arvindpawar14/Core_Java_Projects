package Star.pattern.logical.program;

public class Example9 {

	public static void main(String[] args) {
		//*                  
		//**
		//***
		//****
		//*****
		//******
		int star=1;
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
		for(int k=1; k<=6; k++) {
			for(int l=6; l>=k; l--) {
				System.out.print("*");
			}
		System.out.println();
	
		}	
	}
}
