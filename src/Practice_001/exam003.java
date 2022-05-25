package Practice_001;

import java.util.Scanner;

public class exam003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 																												
		Soal No.3																											
																												
		Perbandingan uang Tini dan Tono adalah 5:3 apabila selisih uang mereka adalah Rp. 12.000,00 maka uang Tono adalah . . .																											
																												
		Note :																											
			- output seperti soal									- rupiah menggunakan 2 angka dibelakang koma																	
			- angka berupa inputan									- rumus adalah selisih uang / selisih perbandingan dikali perbandingan yg dicari																																													
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nilai 1 :"); 
		int nilai1 = input.nextInt(); //inputan untuk nilai 1
			
		System.out.print("masukkan nilai 2 :");
		int nilai2 = input.nextInt(); //inputan untuk nilai 2
		
		System.out.print("masukkan nilai 3 :");
		double nilai3 = input.nextInt(); //inputan untuk nilai 3
		
		int hasil = Math.abs(nilai1 - nilai2); //mencari selisih antara tini dan tono
		
		
		
		System.out.println("Perbandingan uang Tini dan Tono adalah " + 
							nilai1 + ":" + nilai2 + " apabila selisih uang mereka adalah Rp. " 
							+ (int)nilai3 + ",00 maka uang Tono adalah . . .");
		System.out.println("Rp." + (int)nilai3 / hasil * nilai2 + ",00");
		input.close();
		
	}

}
