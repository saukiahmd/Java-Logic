package Practice_005;

import java.util.Scanner;

public class exam002 {
/*
 	Soal No.2							
							
	r = 3   c = 7							
	20	19	18	17	16	15	14	
	13	12	11	10	9	8	7	
	6	5	4	3	2	1	0	
								
	Note :							
		- Menggunakan array multidimention						

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("masukkan row  :");
		int nilai1 = input.nextInt();
		
		System.out.print("masukkan col  :");
		int nilai2 = input.nextInt();
		
		System.out.println("masukan suku pertama :");
		int nilai3 = input.nextInt();
		
		int [] [] array2d = new int[nilai1][nilai2];
		
		for (int row = 0, i = nilai3 ; row < array2d.length; row++) {
			for(int col = 0; col < array2d[row].length; col++) {
				array2d[row][col] = i--;
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
