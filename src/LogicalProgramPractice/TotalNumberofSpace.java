package LogicalProgramPractice;

public class TotalNumberofSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "F US SI    S IO N";
		int count = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				count++;
				
			}
		}
		System.out.println("Number of Space in "+ count);
	}

}
