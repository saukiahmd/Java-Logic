package Practice_001;

import java.util.Scanner;

public class exam007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Soal No.7			- Di isi dengan data asli kalian																				
																							
			####### Biodata Mahasiswa #######																							
			Nama			:	Adenia Cintya Anjani							tipe data string, panjang karakter max. 20												
			NIM			:	20144123123							tipe data string, panjang karakter max. 9												
			Jurusan			:	Teknik Mesin							tipe data string, panjang karakter max. 25												
			Tahun			:	2014							tipe data int												
			Universitas			:	Universitas Suka Maju							tipe data string, panjang karakter min. 10 dan max. 30												
			IPK			:	4.0							tipe data decimal, panjang decimal place adalah 1 dan wajib ada												

		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nama\t\t:"); 
		String nama = input.nextLine(); //inputan untuk nama
		
		System.out.print("masukkan nim\t\t:"); 
		String nim = input.nextLine(); //inputan untuk nim
		
		System.out.print("masukkan jurusan\t:"); 
		String jurusan = input.nextLine(); //inputan untuk jurusan
		
		System.out.print("masukkan tahun\t\t:"); 
		int tahun = Integer.parseInt(input.nextLine()); //inputan untuk tahun
	
		System.out.print("masukkan universitas\t:"); 
		String universitas = input.nextLine(); //inputan untuk universitas
		
		System.out.print("masukkan ipk\t\t:"); 
		double ipk = input.nextDouble(); //inputan untuk ipk
		
		input.close();
		
		
		
		System.out.println("##### Biodata Mahasiswa #####");
		
		System.out.print("Nama        :");
		if (nama.length() <= 20) {
			System.out.println(nama);
		}else {
			System.out.println("panjang karakter maksimal 20");
		}
		
		System.out.print("NIM         :");
		if (nim.length() <= 9) {
			System.out.println(nim);
		}else {
			System.out.println("panjang karakter maksimal 9");
		}
		
		System.out.print("Jurusan     :");
		if (jurusan.length() <= 25) {
			System.out.println(jurusan);
		}else {
			System.out.println("panjang karakter maksimal 25");
		}
		
		System.out.print("Tahun       :");
			System.out.println(tahun);
			
		System.out.print("Universitas :");
		if (universitas.length() >= 10 && universitas.length() <= 30) {
			System.out.println(universitas);
		}else {
			System.out.println("panjang karakter minimal 10 dan maksimal 30");
		}
		
		System.out.print("IPK         :");
		if (ipk <= 1) {
			System.out.println(ipk);
		}else {
			System.out.println("panjang karakter maksimal 1");
		}
		
	}

}
