package FilteringTest1;

import java.util.Arrays;
import java.util.Scanner;

public class soal04 {
	/*
		Input
										Output
		Susilo Bambang Yudhoyono
										S***o B***g Y***o
		Rani Tiara
										R***i T***a
				
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Kalimat1\t: ");
		String [] kalimat1 = input.nextLine().split(" ");
		
		System.out.print("Masukan Kalimat2\t: ");
		String [] kalimat2 = input.nextLine().split(" ");
		
		System.out.println("Output\t: ");
		//memanggil kalimat pertama
		System.out.print(Arrays.toString(kalimat1) + "\t");
		for (int i = 0; i < kalimat1.length; i++) {
			System.out.print(kalimat1[i].charAt(0) + "***" +
							   kalimat1[i].charAt(kalimat1[i].length()-1) + " ");
		}
		
		System.out.println("");
		
		System.out.print(Arrays.toString(kalimat2) + "\t\t\t");
//		memanggil kalimat kedua
		for (int i = 0; i < kalimat2.length; i++) {
			System.out.print(kalimat2[i].charAt(0) + "***" +
							   kalimat2[i].charAt(kalimat2[i].length()-1) + " ");
		}
		
		input.close();
	}

}
