package Array;

public class MuldiExample {

	public static void main(String[] args) {
		String[][] raj = {{"Ganga", "Rohan", "Raju"},{"Rupali", "Roshan", "Ranjana"}};
		System.out.println("----Print All info using Muldimensional String Array-----");
		for(int i=0; i<=raj.length-1; i++){
			for(int j=0; j<=2; j++)
			{
				System.out.print(raj[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
