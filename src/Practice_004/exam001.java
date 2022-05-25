package Practice_004;

import java.util.Scanner;

public class exam001 {
	/*
	 	Soal No. 1											
	- Buatlah method return values untuk menghitung keliling persegi											

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.print("Masukan Sisi\t\t:");
		int sisi = input.nextInt();
		
		// menampilkan hasil dari keliling persegi
		System.out.println(" ");
		System.out.println("Soal No. 1");
		System.out.println("Buatlah method return values untuk menghitung keliling persegi");
		System.out.println("Hasil Keliling Persegi\t:" + kelilingPersegi(sisi));
		
		input.close();
	}
	
	static int kelilingPersegi(int sisi) {
		int kelilingPersegi = 4 * sisi;
		return kelilingPersegi;
	}
	
}
