package FilteringTest1;

import java.util.Arrays;
import java.util.Scanner;

public class soal06 {
	/*
	 	Tampilkan angka-angka kelipatan 3 yang merupakan bilangan genap
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan panjang deret\t: ");
		int deretArray = input.nextInt();
		
		//deklarasi variabel setiap deret
		int deretGenap=6;
		
		//deklarasi variabel angka sebagai array
		int[] angka = new int[deretArray];
		
		System.out.print("Deret Genap kelipatan 3\t: ");
		for (int i = 1; i < deretArray; i++) {
			 if(i%2 != 0) {				
				 angka[i] = deretGenap;					
				 System.out.print(angka[i] + " ");
			}
			deretGenap+=3;
		}
		
		
		input.close();
	}
	
}
