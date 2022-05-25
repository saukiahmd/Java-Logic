package Practice_005;

import java.util.Scanner;

public class exam006 {
	/*
	 	Soal No. 6						
						
		r = 4   c = 7 & 5						
		0	1	2	3	4	5	6
		42	35	28	21	14	7	0
		0	1	2	3	4		
		20	15	10	5	0		
								
		Note :						
			- Menggunakan Jagged Arrays					

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		System.out.print("masukkan row   :");
		int nilai1 = input.nextInt();
		
		
		// deklarasi array 2 dimensi 
		int [] [] array2d = new int[nilai1][];
		
		
		// membuat banyak row
		for(int i = 0; i < array2d.length; i++) {
			System.out.println("masukan panjang kolom pada baris ke-" + (i+1) + "\t:");
			int nilai2 = input.nextInt();
			 array2d [i] = new int [nilai2];
		}
		
		for(int row = 0; row < array2d.length; row++) {
			for(int col = 0; col < array2d[row].length; col++) {
				if (row == 0 || row == 2) {
					array2d[row][col] = col;
				}
			}
		}
		for(int row = 0; row < array2d.length; row++) {
			for(int col = array2d[row].length-1, i = 0; col >= 0; col--) {
				if(row == 1 || row == 3) {
					array2d[row][col] = i;
					i = i + array2d[row].length;
				}
			}
		}
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + "\t");
			}
			System.out.println();
		}
		
		
//		System.out.print("masukkan col 1 :");
//		int nilai2 = input.nextInt();
//		
//		System.out.print("masukkan col 2 :");
//		int nilai3 = input.nextInt();
//		
//		
//		int [] [] array2d = new int[nilai1][nilai2];
//		int [] [] array2d1 = new int[nilai1][nilai3];
//		
//		for (int row = 0, i = 0; row < array2d.length; row++) {
//			for(int col = 0; col < array2d[row].length; col++) {
//				array2d[row][col] = i++;
//			}
//		}
//		
//		// menampilkan
//		for (int row = 0; row < array2d.length; row++) {
//			for (int col = 0; col < array2d[row].length; col++) {
//				System.out.print(array2d[row][col] + "\t");
//			}
//			System.out.println();// cetak baris baru
//		
//		}
		input.close();

	}

}
