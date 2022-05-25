package Day3;

public class LearnLoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// contoh while ke 1
		while (true) {
			System.out.println("loop while terus!");
			break; // tanpa break akan menjadi infinite loop
		}
		
		// contoh while ke 2
		// cetak angka 1 sampai 5
		int i = 1;
		while(i <= 5 ) {
			System.out.print(i++ + " ");
		}
	}

}
