package Practice_005;

import java.util.Scanner;

public class exam003 {
	/*
	 * Soal No. 3
	 * 
	 * r = 4 c = 4 * * * * * * * *
	 * 
	 * Note : - Menggunakan array multidimention
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("masukkan row  :");
		int nilai1 = input.nextInt();

		System.out.print("masukkan col  :");
		int nilai2 = input.nextInt();

//		System.out.println("masukan suku pertama :");
//		String nilai3 = input.nextLine();
//		
		char[][] array2d = new char[nilai1][nilai2];
		int i = 0; // row
		int j = 0; // col

		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				if (i < nilai1) {
					array2d[i][j] = '*';
					i++;
				} else {
					j++;
				}

			}
		}

		// menampilkan
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				System.out.print(array2d[row][col] + "\t");
			}
			System.out.println();// cetak baris baru

		}
		input.close();

	}

}
