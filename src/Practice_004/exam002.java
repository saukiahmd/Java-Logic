package Practice_004;

import java.util.Scanner;

public class exam002 {
	/*
	 	Soal No. 2											
		- Buatlah method return values untuk menghitung luas persegi											
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.print("Masukan Sisi\t\t:");
		int sisi = input.nextInt();
		
		// menampilkan hasil dari keliling persegi
		System.out.println(" ");
		System.out.println("Soal No. 2");
		System.out.println("Buatlah method return values untuk menghitung luas persegi");
		System.out.println("Hasil Luas Persegi\t:" + luasPersegi(sisi));
				
		input.close();
		
	}
	
	static int luasPersegi(int sisi) {
		int luasPersegi = sisi * sisi;
		return luasPersegi;
	}
	
}
