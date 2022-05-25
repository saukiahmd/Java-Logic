package Practice_001;

import java.util.Scanner;

public class exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*
			 * 	Soal No.1																
			 *														
			 *	Hitunglah hasil dari :																
			 *	= -12 x ( 18 + ( -27 ) )																
			 *	= . . . .																
																	
			 *	Note :																
			 *	- output seperti soal							- hasil adalah bilangan bulat						
			 *	- angka berupa inputan															
			 */
			
			Scanner input = new Scanner(System.in); 
				
			System.out.print("masukkan nilai 1 :");
			int nilai1 = input.nextInt();
				
			System.out.print("masukkan nilai 2 :");
			int nilai2 = input.nextInt();
			
			System.out.print("masukkan nilai 3 :");
			int nilai3 = input.nextInt();
			
			System.out.println("Hitunglah hasil dari :");
			System.out.println("=" + nilai1 + "x" + "(" + nilai2 + "+" + "(" + nilai3 + ")" + ")");
			System.out.println("=" + nilai1 * (nilai2 + nilai3));
				
			input.close();
	}

}
