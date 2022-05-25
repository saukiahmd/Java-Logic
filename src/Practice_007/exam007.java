package Practice_007;

import java.util.Scanner;

public class exam007 {
	/*
	 * Soal No. 7 — String CamelCase
	 * 
	 * Alice menulis urutan kata dalam CamelCase sebagai string huruf, s, yang
	 * memiliki properti berikut: - Ini adalah gabungan dari satu atau lebih kata
	 * yang terdiri dari huruf bahasa inggris - Semua huruf di kata pertama adalah
	 * huruf kecil - Untuk setiap kata berikutnya, huruf pertama adalah huruf besar
	 * dan huruf lainnya adalah huruf kecil - Format inputan yaitu Satu baris berisi
	 * string s.
	 * 
	 * Contoh Input saveChangesInTheEditor
	 * 
	 * Contoh Output 5
	 * 
	 * Penjelasan String s berisikan lima data: 1 save 2 Changes 3 In 4 The 5 Editor
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// membuat scanner
		Scanner input = new Scanner(System.in);

		// menerima inputan user
		System.out.print("Input\t: ");
		String inputUser = input.nextLine();

		input.close();

		if (inputUser.isEmpty()) {
			System.err.println("Data yang diinputkan kosong");
		} else if (!(Character.isLowerCase(inputUser.charAt(0)))) {
			System.err.println("Data yang diinputkan tidak valid!");
		} else {
			// menghitung huruf kapital dalam kalimat yang diinputkan
			int count = 1;
			for (int i = 0; i < inputUser.length(); i++) {
				if (inputUser.charAt(i) >= 'A' && inputUser.charAt(i) <= 'Z') {
					count++;
				}
			}
			System.out.println("Output\t: " + count);
		}

	}
}
