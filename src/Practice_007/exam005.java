package Practice_007;

import java.util.Scanner;

import Common.Sorting;

public class exam005 {
	/*
	 * Soal No. 5 — String Mars Exploration
	 * 
	 * Contoh Input SOSSPRSQSSOR
	 * 
	 * Contoh Output 3
	 * 
	 * Penjelasan Signal yang diharapkan : SOSSOSSOSSOS Signal yang diterima :
	 * SOSSPRSQSSOR Perbedaan : X X X
	 * 
	 * Panjang : 12 Jumlah : 4 Sesuai : 1 Gagal : 3
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("input\t: ");
		String[] data = input.nextLine().split("");
		Sorting hasil = new Sorting();
		hasil.sos(data);
	}
}
