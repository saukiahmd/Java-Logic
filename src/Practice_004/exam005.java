package Practice_004;

import java.util.Scanner;

public class exam005 {
	/*
	 	Soal No. 5														
		- Buatlah method tidak return values untuk mencetak biodata mahasiswa														
			a. adanya parameter nama, nim, jurusan, ipk dan datanya dari inputan user													
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.print("Masukan Nama\t\t:");
		String nama = input.nextLine();
		
		System.out.print("Masukan NIM\t\t:");
		String nim = input.nextLine();
		
		System.out.print("Masukan Jurusan\t\t:");
		String jurusan = input.nextLine();
		
		
		System.out.print("Masukan IPK\t\t:");
		String ipk = input.nextLine();
		
		
		cetakDataMahasiswa(nama, nim, jurusan, ipk);
		System.out.println("");
	}
	
	static void cetakDataMahasiswa(String nama, String nim, String jurusan, String ipk) {
		System.out.println("Nama\t: " + nama);
		System.out.println("NIM\t: " + nim);
		System.out.println("Jurusan\t: " + jurusan);
		System.out.println("IPK\t: " + ipk);
	}
	

}
