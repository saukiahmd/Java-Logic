package Practice_007;

import java.util.Arrays;
import java.util.Scanner;

import Common.Sorting;

public class exam004 {
	/*
	 * Soal No. 4 — String Caesar Cipher
	 * 
	 * Contoh Input 11
	 * 
	 * Contoh Input Rotasi 2
	 * 
	 * Contoh Input middle-Outz
	 * 
	 * Contoh Output okffng-Qwvb
	 * 
	 * Penjelasan Alphabet : abcdefghijklmnopqrstuvwxyz Alphabet rotasi (+2) :
	 * cdefghijklmnopqrstuvwxyzab
	 * 
	 * m -> o i -> k d -> f d -> f
	 * 
	 * l -> n e -> g - -> - O -> Q u -> w t -> v z -> b
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("input\t: ");
		String[] data = input.nextLine().split("");
		System.out.print("input rotasi\t: ");
		int n = input.nextInt();

		Sorting hasil = new Sorting();
		hasil.Caesar_Cipher(data, n);
		System.out.println(Arrays.toString(data));
		
	}

}
