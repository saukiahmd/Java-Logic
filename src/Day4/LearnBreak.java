package Day4;

public class LearnBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		
		for (int i = 1; i < a; i++) {
			if(a == 5) {
				break;
			}
			System.out.println(i);
		}
		
		
		System.out.println("check continue ");
		for (int i = 1; i < a; i++) {
			if(a == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("bla");
	}

}
