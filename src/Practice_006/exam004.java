package Practice_006;
import java.util.Arrays;
import java.util.Scanner;

import Common.*;

public class exam004 {

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
	
	public static void case4(int [] arr, String [] hasil) {
		// membuat array dengan tipe data integer
		for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(hasil[i]);
        }
		
		System.out.println("Before\t: " + Arrays.toString(arr));
		Sorting get = new Sorting();

		System.out.println("After\t: " + Arrays.toString(get.bubbleSort(arr, "asc")));
	}


}
