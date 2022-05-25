package Practice_004;

import java.util.Scanner;

public class exam004 {
	/*
	 	Soal No. 4											
		- Buatlah method return values untuk menghitung luas segitiga											
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.print("Masukan Alas\t\t:");
		int alas = input.nextInt();
		
		System.out.print("Masukan Tinggi\t\t:");
		int tinggi = input.nextInt();
		
		
		// menampilkan hasil dari keliling persegi
		System.out.println(" ");
		System.out.println("Soal No. 3");
		System.out.println("Buatlah method return values untuk menghitung Luas segitiga");
		System.out.println("Hasil Luas Segitiga\t:" + luasSegitiga(alas, tinggi));
				
		input.close();
		
	}
	
	static int luasSegitiga(int alas, int tinggi) {
		int luasSegitiga = alas * tinggi / 2;
		return luasSegitiga;
	}

}
