package Practice_004;

import java.util.Scanner;

public class exam003 {
/*
 	Soal No. 3												
	- Buatlah method return values untuk menghitung keliling segitiga												
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.print("Masukan Sisi 1\t\t:");
		int a = input.nextInt();
		
		System.out.print("Masukan Sisi 2\t\t:");
		int b = input.nextInt();
		
		System.out.print("Masukan Sisi 3\t\t:");
		int c = input.nextInt();
		
		// menampilkan hasil dari keliling persegi
		System.out.println(" ");
		System.out.println("Soal No. 3");
		System.out.println("Buatlah method return values untuk menghitung keliling segitiga");
		System.out.println("Hasil Keliling Segitiga\t:" + kelilingSegitiga(a, b, c));
				
		input.close();
		
	}
	
	static int kelilingSegitiga(int a, int b, int c) {
		int kelilingSegitiga = a + b + c;
		return kelilingSegitiga;
	}

}
