package FilteringTest1;

import java.util.Scanner;

public class soal01 {
	/*
	 	Buatlah deret angka yang terbentuk dari 
	 	penjumlahan deret bilangan kelipatan 3 dikurang 1 
	 	dan deret bilangan kelipatan 4 diibagi(/) 
	 	2. Angka pada index ganjil dari kedua deret bilangan tersebut saling dijumlahkan. 
	 	Dan angka pada index genap dari kedua deret bilangan tersebut juga saling dijumlahkan. 
	 	Index dimulai dari angka 0.
		Input : Panjang array/panjang deret
		Contoh : Dibawah ini hanya sekedar contoh yang menggunakan deret genap dan ganjil
		
		Input panjang deret : 5
		Deret genap : 0 2 4 6 8
		Deret ganjil : 1 3 5 7 9
		0 + 1 ; 2 + 3 ; 4 + 5 ; 6 + 7 ; 8 + 9
		
		Output : 1, 5, 9, 13, 17
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan panjang deret\t: ");
		int deretArray = input.nextInt();
		
		//deklarasi variabel setiap deret
		int deret1=3;
		int deret2=4;
		
		//deklarasi variabel angka sebagai array
		int[] angka = new int[deretArray];
		int[] angka1 = new int[deretArray];
		
		for (int i = 0; i < deretArray; i++) {
			deret1 = (deret1 + 3) - 1;
			angka[i] = deret1; //menampung nilai array				
		}
		
		System.out.print("Deret 1 : ");
		
		for (int hasil1 : angka) { // membuat variabel baru untuk menampung nilai sebelumnya
			System.out.print(hasil1 + " ");
		}
		
		System.out.println();
		
		for (int j = 0; j < deretArray; j++) {
			deret2 = (deret2 + 4)/2;
			angka1[j] = deret2;
			
		}
		
		System.out.print("Deret 2 : ");
		for (int hasil2 : angka1) {
			System.out.print(hasil2 + " ");
		}
		
		
		input.close();
	}

}
