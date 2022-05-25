package Practice_003B;

import java.util.Scanner;

public class exam005 {
	/*
	 	Soal 5						
		input		:	habis makan kenyang			
		output		:	B*** K*** Y***		
		menampilkan huruf tengah dan di jadikan baris pertama	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		
		// terima inputan
		System.out.print("Input: ");
		String huruf = input.nextLine();
		
		
		// deklarasi arrNama sebagai array dimana memiliki isian (huruf)
		String[] arrNama = huruf.split(" ");
		

		
		// proses merubah string
				for(String nama : arrNama) {
					char[] arrCharNama = nama.toCharArray(); // merubah tipe string menjadi char
					
					// proses merubah character
					for(int i = 0; i < arrCharNama.length; i++) {
						if(i == 0) { // pengecekan terhadap index ke 0 
							// menampilkan apa adanya
							System.out.print(arrCharNama[i]);
						}else {
							System.out.print("*");
						}
					}
					System.out.print(" ");
				}
				
			input.close();
		
	}

}
