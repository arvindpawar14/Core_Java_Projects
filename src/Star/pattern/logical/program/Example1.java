package Star.pattern.logical.program;

public class Example1 {

	public static void main(String[] args) {
	//****************
	//*************
	//**********
	//*******
	//****	
	//*
		int star=16;
		for(int i=1; i<=16; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*"+ "  ");
			}
			System.out.println();
			star=star-3;
		}		
	}
}
