package Practice_001;

import java.util.Scanner;

public class exam009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soal No. 9																			
																			
			============ Raport ============																			
			Mata Pelajaran					Nilai														
			B. Indonesia	:	90,50							inputan nilai b. indonesia								
			B. Inggris		:	60,30							inputan nilai b. inggris								
			MTK				:	75,80							inputan nilai mtk								
			Fisika			:	70,00							inputan nilai fisika								
			Sejarah			:	80,50							inputan nilai sejarah								
			Penjaskes		:	90,00							inputan nilai penjaskes								
			———————————————																		
			Total			:	…							hitunglah total nilai keseluruhan mata pelajaran								
			Rata-rata		:	…							hitunglah rata-rata nilai								

		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nilai bahasa indonesia\t:"); 
		float nilai1 = input.nextFloat(); //inputan untuk nilai 

		System.out.print("masukkan nilai bahasa inggris\t:"); 
		float nilai2 = input.nextFloat(); //inputan untuk nilai 

		System.out.print("masukkan nilai matematika\t:"); 
		float nilai3 = input.nextFloat(); //inputan untuk nilai 

		System.out.print("masukkan nilai fisika\t\t:"); 
		float nilai4 = input.nextFloat(); //inputan untuk nilai 
		
		System.out.print("masukkan nilai sejarah\t\t:"); 
		float nilai5 = input.nextFloat(); //inputan untuk nilai 
		
		System.out.print("masukkan nilai penjaskes\t:"); 
		float nilai6 = input.nextFloat(); //inputan untuk nilai 
		
		float hasil = nilai1 + nilai2 + nilai3 + nilai4 + nilai5 + nilai6;
		
		
		System.out.println("============ Raport ============");
		System.out.print("Mata Pelajaran");
		System.out.println("\t\tNilai");
		System.out.println("B. Indonesia\t:" + nilai1);
		System.out.println("B. Inggris\t:" + nilai2);
		System.out.println("MTK\t\t:" + nilai3);
		System.out.println("Fisika\t\t:" + nilai4);
		System.out.println("Sejarah\t\t:" + nilai5);
		System.out.println("Penjaskes\t:" + nilai6);
		System.out.println("---------------------------------");
		System.out.println("Total\t\t:" + ((int)hasil));
		System.out.println("Rata-rata\t:" + ((int)hasil / 6));
		
		
		input.close();
	}

}
