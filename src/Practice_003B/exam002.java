package Practice_003B;

import java.util.Scanner;

public class exam002 {
	/*
	 * Soal 2 input : Tapi saya Tidak Sayang KAMU!! output : a = 7 upper = 7
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// membuat scanner untuk input
		Scanner input = new Scanner(System.in);

		// membuat variabel untuk input
		System.out.print("Masukan\t: ");
		String kalimat = input.nextLine();

		// deklarasi variabel untuk menghitung jumlah uppercase
		int upper = 0;
		int countA = 0;

		// membuat array
		String[] arayKalimat = kalimat.split("");

		// menghitung jumlah karakter uppercase
		for (int i = 0; i < arayKalimat.length; i++) {
			if (Character.isUpperCase(arayKalimat[i].charAt(0))) {
				upper++;
			}
			if (arayKalimat[i].toLowerCase().equals("a")) {
				countA++;
			}
		}

		// mencetak sesuai format soal
		System.out.println("Output\t: a = " + countA);
		System.out.println("\tupper = " + upper);

		// menutup scanner
		input.close();
	}

}
