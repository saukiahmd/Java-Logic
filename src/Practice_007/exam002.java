package Practice_007;

import java.util.Scanner;

public class exam002 {
	/*
	 * Soal No. 2 — Plus Minus
	 * 
	 * Contoh Input -4 3 -9 0 4 1
	 * 
	 * Contoh Output 0,50000 0,33333 0,16667
	 * 
	 * Penjelasan Ada 3 angka positif, 2 angka negatif, dan 1 nol dalam array.
	 * Proporsi kemunculannya positif: 3/6 = 0,500000, negatif: 2/6 = 0,333333 dan
	 * nol: 1/6 = 0,166667.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// membuat object scanner untuk menerima inputan dari user
		Scanner input = new Scanner(System.in);

		// terima inputan dari user berupa String
		System.out.print("Input\t: ");
		String inputUser = input.nextLine();

		// input user ke dalam array String
		String[] arrayNilai = inputUser.split(" ");

		// mengelompokkan bilangan positif negatif dan nol
		double positif = 0;
		double negatif = 0;
		double nol = 0;

		// loop untuk mengelompokkan bilangan positif, negatif dan nol
		for (int i = 0; i < arrayNilai.length; i++) {
			if (Integer.parseInt(arrayNilai[i]) > 0) {
				positif++;
			} else if (Integer.parseInt(arrayNilai[i]) < 0) {
				negatif++;
			} else if (Integer.parseInt(arrayNilai[i]) == 0) {
				nol++;
			}
		}

		// membuat peluang
		double peluangPos = positif / (arrayNilai.length);
		double peluangNeg = negatif / (arrayNilai.length);
		double peluangNol = nol / (arrayNilai.length);

		System.out.println("Proporsi kemunculannya positif :" + String.format("%.5f", peluangPos) + " ");
		System.out.println("Proporsi kemunculannya negatif :" + String.format("%.5f", peluangNeg) + " ");
		System.out.println("Proporsi kemunculannya nol :" + String.format("%.5f", peluangNol) + " ");

	}

}
