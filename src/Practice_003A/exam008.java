package Practice_003A;

import java.util.Scanner;

public class exam008 {
	/*
	  Soal 08			N => 7			
		3	9	27	81	243	729	2187
		kelipatan *3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int i;
		
		// terima inputan
		System.out.print("Jumlah deret yang diinginkan: ");
		int jumlah_deret = input.nextInt();

		// deklarasi terlebih dahulu setiap tipe data
		i = 0;
		int angkaAwal = 3;
		
		// deklarasi jumlah_deret sebagai array
		int[] angka = new int[jumlah_deret];

		while (i < jumlah_deret) {
			angka[i] = angkaAwal; // menampung nilai array
			angkaAwal *= 3;
			i++;
		}

		for (int hasil : angka) { // membuat variabel baru untuk menampung nilai sebelumnya
			System.out.print(hasil + " ");
		}

		input.close();
	}

}
