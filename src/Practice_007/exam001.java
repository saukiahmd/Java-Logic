package Practice_007;

import java.util.Arrays;
import java.util.Scanner;

import Common.Sorting;

public class exam001 {
	/*
	 	Soal No. 1  — Min Max Sum														
														
		Lengkapi fungsi miniMaxSum pada editor di bawah ini.														
		Itu harus mencetak dua bilangan bulat yang dipisahkan spasi pada satu baris														
		jumlah minimum dan jumlah maksimum 4 dari 5 elemen														
																
		Contoh Input														
		1,2,3,4,5														
																
		Contoh Output														
		10 14														
																
		Penjelasan														
		empat angka kecil ditambahkan: 1+2+3+4=10														
		Empat angka besar ditambahkan: 2+3+4+5=14														

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// terima inputan
		System.out.print("Masukkan angka: ");
		String angka = input.nextLine();
		
		String[] hasil = angka.split(" ");
		
		// merubah array string menjadi integer
		int[] arr = new int[hasil.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(hasil[i]);
		}
		
		Sorting get = new Sorting();
		
		get.bubbleSort(arr, "asc");
		System.out.println(Arrays.toString(arr));
		System.out.println("Hasil\t:" + get.minValue(arr) + " " + get.maxValue(arr));
		input.close();
	}

}
