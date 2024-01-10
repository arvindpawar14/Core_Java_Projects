package Star.pattern.logical.program;

public class Exaample3 {

	public static void main(String[] args) {
		//********
		//******
		//****
		//**
		int row=8;
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=row; j++) {
				System.out.print("*");
			}
			System.out.println();
			row=row-2;
		}

	}

}
