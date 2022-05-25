package Practice_003B;

import java.util.Scanner;

public class exam001 {

	/*
	 Soal 1						
		input		:	Aku Sayang Kamu			
		output		:	A*u S****g K**u			
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
	
		
		// terima inputan
		System.out.print("Masukkan kata: ");
		String huruf = input.nextLine();
		
		
		// deklarasi arrNama sebagai array dimana memiliki isian (huruf)
		String[] arrNama = huruf.split(" ");
		

		
		// proses merubah string
				for(String nama : arrNama) {
					char[] arrCharNama = nama.toCharArray(); // merubah tipe string menjadi char
					
					// proses merubah character
					for(int i = 0; i < arrCharNama.length; i++) {
						if(i == 0 || i == arrCharNama.length-1) { // pengecekan terhadap index ke 0 dan akhir dari panjang length arrCharNama(huruf terakhir dikurangi 1) 
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
