package FilteringTest1;

import java.util.Arrays;
import java.util.Scanner;

import Sorting.Sorting;

public class soal08 {
	/*
	 	Seringkali kita melihat data yang dienkripsi terhadap informasi yang bersifat rahasia. Beragam metode enkripsi telah dikembangkan hingga saat ini. Kali ini kalian akan ditugaskan untuk membuat metode enkripsi sendiri agar informasi yang diinput menjadi aman, dengan menggunakan original alfabet yang dirotasi pada enkripsi tersebut.

		Constraint :
		-    Original Alfabet : abcdefghijklmnopqrstuvwxyz
		-    Semua enkripsi hanya menggunakan huruf kecil
		-    Spasi/karakter spesial tidak dianggap
		
		Input :
		string : mengandung data yang belum dienkripsi
		n : jumlah huruf yang digunakan untuk merotasi original alfabet (0 <= n <= 100)
		
		Example
		string : ba ca
		n : 3
		
		Output
		Original Alfabet : abcdefghijklmnopqrstuvwxyz
		Alfabet yang dirotasi : defghijklmnopqrstuvwxyzabc
		Hasil enkripsi : edfd
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Huruf\t: ");
		String [] data = input.nextLine().split("");
		
		System.out.print("Masukan n\t: "); //jumlah rotasi
		int n = input.nextInt();
		
		Sorting hasil = new Sorting();
		hasil.enkripsi(data, n);
		System.out.print("Hasil enkripsi : " + Arrays.toString(data).replace("],", "").replace(",", "").replace(" ", "").replaceAll("[\\[\\]]", ""));
	}

}
