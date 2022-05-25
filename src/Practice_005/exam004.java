package Practice_005;

import java.util.Scanner;

public class exam004 {
	/*
	 	Soal No. 4							
							
		r = 4   c = 4							
					*				
				*	*				
			*	*	*				
		*	*	*	*				
									
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
		
//		System.out.println("masukan suku pertama :");
//		String nilai3 = input.nextLine();
//		
		char [] [] array2d = new char[nilai1][nilai2];
		
		for (int row = 0; row < array2d.length; row++) {
			for(int col = 0; col < array2d[row].length; col++) {
				if(col+1>=nilai1-row) {		
					array2d[row][col] = '*' ;					
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
