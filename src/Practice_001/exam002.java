package Practice_001;

import java.util.Scanner;

public class exam002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Soal No.2														
															
		 *	Hitunglah hasil dari :														
		 *	( 2 + 7 )2 - 82 = . . . .														
															
		 *	Note :														
		 *	- output seperti soal									- cetak pangkat diganti '^'				
		 *	- angka berupa inputan									- hasil bilangan bulat				 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nilai 1 :");
		int nilai1 = input.nextInt();
			
		System.out.print("masukkan nilai 2 :");
		int nilai2 = input.nextInt();
		
		System.out.print("masukkan nilai 3 :");
		int nilai3 = input.nextInt();
		
		System.out.println();
		
		double hasil = (int)(Math.pow((nilai1 + nilai2), 2)) - (Math.pow(nilai3, 2));
		
		System.out.println("hitunglah hasil");
		System.out.println("(" + nilai1 + "+" + nilai2 + ")" + "^" + "-" + nilai3 + "^" + "=");

		System.out.println((int)hasil);
		input.close();
		
	}

}
