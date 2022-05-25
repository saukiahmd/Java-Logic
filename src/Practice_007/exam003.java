package Practice_007;

import java.util.Arrays;
import java.util.Scanner;

import Common.Sorting;

public class exam003 {
	/*
	 * Soal No. 3 — String Simple Array Sum
	 * 
	 * Contoh Input 6
	 * 
	 * Contoh Input 1,2,3,4,10,11
	 * 
	 * Contoh Output 31
	 * 
	 * Penjelasan Kami mencetak jumlah elemen array: 1+2+3+4+10+11=31
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// menerima input dari user
		Scanner input = new Scanner(System.in);
		System.out.print("input\t: ");
		int data = input.nextInt();

		// memberikan jarak antar input
		input.nextLine();

		/*
		 * mengecek input, apakah sesuai dengan panjang arraynya dan menambahkan isi
		 * dari datanya
		 */
		System.out.print("input\t: ");
		String[] data2 = input.nextLine().split(",");
		if (data2.length != data) {
			System.err.println(" Data Error, nilai input tidak sesuai ");
		} else {
			int[] arr = new int[data2.length];
			for (int i = 0; i < data2.length; i++) {
				arr[i] = Integer.valueOf(data2[i]);
			}

			Sorting hasil = new Sorting();
			hasil.bubbleSort(arr, "asc");
			System.out.print("output\t: " + hasil.sum(arr));
		}

		input.close();
	}

}

