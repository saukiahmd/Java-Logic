package Practice_001;

import java.util.Scanner;

public class exam004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 																		
		Soal No.4																	
																		
		Di sebuah tempat penyewaan peralatan pesta terdapat 6 gros piring.																	
		Sebanyak 4 lusin dipinjam oleh Bu Tuti dan sebanyak 2 gros dipinjam oleh Bu Ayu.																	
		Piring yang tersisa di tempat tersebut sebanyak . . . buah																	
																		
		Note :																	
			- output seperti soal			- 1 lusin = 12 item, 1 gross = 144 item							
			- angka berupa inputan																
																		
		 * */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan total piring (satuan gross) :"); 
		int nilai1 = input.nextInt(); //inputan untuk nilai 1
			
		System.out.print("masukkan satuan lusin :");
		int nilai2 = input.nextInt(); //inputan untuk nilai 2
		
		System.out.print("masukkan satuan gross :");
		int nilai3 = input.nextInt(); //inputan untuk nilai 2
		
		int satuanGross = 144;
		int satuanLusin = 12;
		
		int hasil1 = nilai1 * satuanGross; // total hasil keseluruhan piring dalam satuan gross
		int hasil2 = nilai2 * satuanLusin; // total hasil yang dipinjam oleh bu tuti dalam satuan lusin
		int hasil3 = nilai3 * satuanGross; // total hasil yang dipinjam oleh bu ayu dalam satuan gross
		
		
		System.out.println("Di sebuah tempat penyewaan peralatan pesta terdapat " + nilai1 + " gros piring.																	\r\n"
				+ "Sebanyak " + nilai2 + " lusin dipinjam oleh Bu Tuti dan sebanyak " + nilai3 + " gros dipinjam oleh Bu Ayu.																	\r\n"
				+ "Piring yang tersisa di tempat tersebut sebanyak " + ((int)hasil1 - hasil2 - hasil3) + " buah	");
		
		input.close();
		
	}

}
