package LogicalProgramPractice;

public class TotalNumberofSpaceinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgString = "F U SI ON SOFTWARE I N S TI TU  TE";
		int count = 0;
		for(int i=0; i<=orgString.length()-1; i++) {
			char c = orgString.charAt(i);
			if(c == ' ') {
				count ++;
			}
		}
		System.out.println("Number of White Spaces: "+ count);
	}

}
