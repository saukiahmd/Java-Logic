package Practice_001;

import java.util.Scanner;

public class exam006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 																					
		Soal No.6																				
																					
		Pak Imam mempunyai tiga kebun yang luasnya 3 ha, 1.900 m2 dan 1,75 are.																				
		Jika kebunnya dijual 2,5 ha maka luas kebun Pak Imam sekarang . . . m2																				
																					
		Note :																				
			- output seperti soal				- 1 ha = 10.000 m2 dan 1 are = 100 m2										
			- angka berupa inputan																			

		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan luas kebun 1 (satuan ha) :"); 
		double nilai1 = input.nextDouble(); //inputan untuk nilai 1
			
		System.out.print("masukkan luas kebun 2 (satuan m^2) :");
		double nilai2 = input.nextDouble(); //inputan untuk nilai 2
		
		System.out.print("masukkan luas kebun 3 (satuan are) :");
		double nilai3 = input.nextDouble(); //inputan untuk nilai 2

		System.out.print("masukkan yang ingin dijual (satuan ha) :");
		double nilai4 = input.nextDouble(); //inputan untuk nilai 2
		
		double ha = 10000;
		double are = 100;
		
		double hasil1 = nilai1 * ha;
		double hasil2 = nilai3 * are;
		double hasil3 = nilai4 * ha;
		
		double hasil = hasil1 + nilai2 + hasil2 - hasil3;
		
		System.out.println("Pak Imam mempunyai tiga kebun yang luasnya " + nilai1 + " ha, " + nilai2 + " m2 dan " + nilai3 + " are.																				\r\n"
				+ "Jika kebunnya dijual " + nilai4 + " ha maka luas kebun Pak Imam sekarang " + ((int)hasil) + " m2	");
		
		
		input.close();
	}

}
