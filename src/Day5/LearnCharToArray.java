package Day5;

import java.util.Iterator;

public class LearnCharToArray {
	
	/*
	 input	:ahmad sauqi
	 output	:a===d s===i
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "A";
		if (Character.isUpperCase('A')) {
			
		}
		char a1 = 'A';
		if (a1 >= 'A' && a1 <= 'Z') {
			
		}
		
		String namaLengkap = "Ahmad Sauqi";
		
		
		// rubah nama jadi String[]
		// "ahmad sauqi"
		// di pisah antara ahmad dan sauqi menggunakan split "spasi"
		// menjadi
		// "ahmad"
		// "sauqi"
		String[] arrNama = namaLengkap.split(" ");
		
		// proses merubah string
		for(String nama : arrNama) {
			char[] arrCharNama = nama.toCharArray(); // string dirubah menjadi char
			
			// proses merubah character
			for(int i = 0; i < arrCharNama.length; i++) {
				if(i == 0 || i == arrCharNama.length-1) {
					// menampilkan apa adanya
					System.out.print(arrCharNama[i]);
				}else {
					System.out.print("=");
				}
			}
			System.out.println(" ");
		}
		
			
		/*
		 arrNama : ahmad 0
		 			" "
		 			sauqi 1
		 */
		
		/*
		 jadi array Char[] seperti dibawah ini
		 value		index		panjang		output
		 a			0			1			a
		 h			1			2			=
		 m			2			3			=
		 a			3			4			=
		 d			4			5			d
		 
		 value		index		panjang		output
		 s			6			1			s
		 a			7			2			=
		 u			8			3			=
		 q			9			4			=
		 i			10			5			i
		 
		 */
		
	}

}
