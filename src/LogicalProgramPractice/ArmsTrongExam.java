package LogicalProgramPractice;

public class ArmsTrongExam {

	public static void main(String[] args) {
		int dm = 153;
		int an = 0;
		for(int i=dm; i>0; i=i/10) {
			int pt = i % 10;
			an = an+(pt*pt*pt);
		}
		if(an == dm) {
			System.out.println("is Armstrong " + dm);
		}
		else {
				System.out.println("is not Armstrong " + dm);
		}
	}

	}
