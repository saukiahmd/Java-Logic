package Practice_004;

import java.util.Scanner;

public class exam006 {
	/*
	 	Soal No. 6														
	- Buatlah method return values untuk conversi tipe data string ke string array														
		a. Nama method "StringToArray()"													
		b. Output dengan tipe data string[] dan parameter data bertipe string													

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// soal no.6
		// ada data dengan nama peserta "Priscilia Lovita"
		// buat method return values String[] dengan parameter String
		// index ke 0 : "Priscilia"
		// index ke 1 : "Lovita"
	
		
		// membuat input
		System.out.print("Masukan Nama\t\t:");
		String nama = input.nextLine();
		
		
		System.out.println();
	
	}
	
	static char StringToArray(String nama) {
		char[] arrNama = nama.toCharArray();
		
		 // Copy character by character into array
        for (int i = 0; i < nama.length(); i++) {
            System.out.println(arrNama[i]);
        }
  
        return arrNama;
		
	}

}
