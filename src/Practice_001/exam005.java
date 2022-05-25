package Practice_001;

import java.util.Scanner;

public class exam005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 	Soal No.5																								
																									
		Luas permukaan kubus 486 cm2 (centimeter kubik), Volume kubus tersebut adalah . . .																								
																									
		Note :																								
			- output seperti soal						- tentukan nilai rusuk terlebih dahulu L = 6 x r2   ==>   r = akar (L / 6)														
			- angka berupa inputan						- rumus permukaan kubus adalah ( 6 x rusuk x rusuk )																																				
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan luas permukaan kubus^2 :"); 
		int nilai1 = input.nextInt(); //inputan untuk nilai 1
		
		double rumusLuasKubus = Math.sqrt(nilai1 / 6);
		double hasil = Math.pow(rumusLuasKubus, 3);
		
		System.out.println("Luas permukaan kubus " + nilai1 + " cm2 (centimeter kubik), Volume kubus tersebut adalah " + ((int)hasil) + "cm^3");
		input.close();
	}

}
