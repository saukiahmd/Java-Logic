package Practice_006;

import java.util.Arrays;
import java.util.Scanner;

import Common.Sorting;

public class exam006 {
	/*
	 	Soal No. 6  —  Mean, Median & Modus										
										
		Input		:	5,3,6,7,2,6							
												
		Output										
		Mean		:	4							
		Median		:	3							
		Modus		:	6							
												
		- Tidak boleh memakai Array.Sort maupun Linq (Lamda)										

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
		
		System.out.println(9/2);
		
	}
	
	public static void case4(int [] arr, String [] hasil) {
		// membuat array dengan tipe data integer
		for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(hasil[i]);
        }
		
		System.out.println("Before\t: " + Arrays.toString(arr));
		Sorting get = new Sorting();

		System.out.println("After\t: " + Arrays.toString(get.bubbleSort(arr, "asc")));
		
		// mencari mean
		int jumlah = 0;
		for (int arrayMean : arr) {
			jumlah += arrayMean;
		}
		System.out.println("Mean\t: " + jumlah / arr.length);
		
		// mencari median
		int median;
		if (arr.length % 2 == 1) {
			median = arr[arr.length / 2];
		}else {
			median = ((int) (arr[arr.length / 2] + arr[arr.length / 2] - 1)) / 2;
		}
		System.out.println("Median\t : " + median);
		
		
		//mencari modus
		
	}
	

}
