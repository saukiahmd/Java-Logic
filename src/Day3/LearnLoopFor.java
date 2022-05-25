package Day3;

import java.util.Iterator;

public class LearnLoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// contoh ke 1
		// cetak angka dari 1 sampai 5
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// contoh ke 2
		// cetak angka dari 5 sampai 1
		for (int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// contoh ke 3
		// cetak angka dari 5 sampai -5
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		
		// contoh ke 4
		// cetak boolean
//		for (boolean isActive = true; true;) {
//			System.out.println(isActive);
//			
//		}
		
		//contoh ke 5
		// cetak angka dari 1 sampai 10
		for (int i = 1; i <= 10;) {
			System.out.println(i++);
		}
	}

}
