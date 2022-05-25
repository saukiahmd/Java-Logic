package simulasi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class practice002 {
	/*
	 * Tentukanlah angka yang paling besar keterangan : - minimal ada 2 angka
	 * pembanding dan salah satunya adalah angka random
	 * 
	 * contoh Program 
	 * input : 4 
	 * input : 3 
	 * random : 6 Random rnd = new Random();
	 * output : Angka paling besar int num = rnd.Next(10); // 0 s.d 9
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		cara1();
		cara2();
	}
	
	public static void cara1() {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukan angka 1\t: ");
		int angka1 = input.nextInt();

		System.out.print("Masukan angka 2\t: ");
		int angka2 = input.nextInt();

		Random rnd = new Random();
		int angka3 = rnd.nextInt(10);

		System.out.println("Random\t: " + angka3);
		
		if(angka1 > angka2 && angka1 > angka3) {
			System.out.println("Output\t: " + angka1);
		}else if(angka2 > angka3) {
			System.out.println("Output\t: " + angka2);
		}else {
			System.out.println("Output\t: " + angka3);
		}
		
		input.close();
		
				
	}
	
	public static void cara2() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan berapa kali loop\t: ");
		int jumlahLoop = input.nextInt(); 
		Integer [] arrayInput = new Integer [jumlahLoop];
		
		for (int i = 0; i < arrayInput.length-1; i++) {
			System.out.print("Masukan angka\t" + (i+1) + ": " );
			arrayInput[i] = input.nextInt();
			
		}
		Random rnd = new Random();
		arrayInput[jumlahLoop-1] = rnd.nextInt(10);
		System.out.println("Random\t: " + arrayInput[jumlahLoop-1]);
		
		
//		cara ke 1
		List<Integer> list = Arrays.asList(arrayInput);
		System.out.println("Output\t: " + Collections.max(list));
		
//		cara ke 2
//		Arrays.sort(arrayInput);
//		System.out.println("Output\t: " + arrayInput[jumlahLoop-1]);
		
		
		input.close();
	}
}
