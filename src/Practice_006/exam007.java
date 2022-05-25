package Practice_006;

import java.util.Arrays;
import java.util.Scanner;

import Common.Sorting;

public class exam007 {
	/*
	 * Soal No. 7 — Mean, Median & Modus
	 * 
	 * Input : 5,3,6,7,2,6
	 * 
	 * Output 2,3,5,6,6,7 
	 * 		  16,24
	 * 
	 * - Tidak boleh memakai Array.Sort maupun Linq (Lamda) - Sum max & sum min 4
	 * numbers min: 2+3+5+6=16 max: 5+6+6+7=24
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// terima inputan
		System.out.print("Masukkan angka: ");
		String angka = input.nextLine();

		String[] hasil = angka.split(" ");
		int[] arr = new int[hasil.length];

		case4(arr, hasil);

		input.close();

	}

	public static void case4(int[] arr, String[] hasil) {
		// membuat array dengan tipe data integer
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(hasil[i]);
		}

		System.out.println("Before\t: " + Arrays.toString(arr));
		Sorting get = new Sorting();

		System.out.println("After\t: " + Arrays.toString(get.bubbleSort(arr, "asc")));
		
		int min = 2;
		for (int i = 0; i < arr.length+2; i++) {			
			if (arr[i] >= min) {
				System.out.println("Median\t : " + Arrays.toString(arr));
//			min = arr[arr.length / 2];
			}else {
//			min = ((int) (arr[arr.length / 2] + arr[arr.length / 2] - 1)) / 2;
			}
		}
//		System.out.println("Median\t : " + min);
		
	}

}
