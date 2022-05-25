package Day10;

import java.util.Iterator;

public class LearnArray2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// mendefinisikan array 2 dimensi
		// cara ke 1, baris = 2, kolom = 3 dan langsung ada isi data
		int [] [] array2d1 = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};
		
		// cara ke 2, baris = 2, kolom = 3 dan langsung ada isi data
		int [] [] array2d2 = new int [2] [3];
	
		// cetak array 2 dimensi dengan method
		cetakArray2dBaris(array2d1);
		
		
		// ubah data di array 2 dimensi
		array2d1 [1] [1] = 90;
		
		
	}
	
	public static void cetakArray2dBaris (int [] [] array2d) {
		for (int[] array : array2d) {
			for (int data : array) {
				System.out.print(data);
			}
		}
	}
	
	public static void cetakArray2dBarisKolom (int [] [] array2d) {
		for (int[] array : array2d) {
			for (int data : array) {
				System.out.print(data + ", ");
			}
			System.out.println();
		}
	}
	
	public static void cetakArray2dFor (int [] [] array2d) {
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				System.out.print(array2d[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void isiDataArray2d(int [] [] array2d) {
		for (int row = 0, i = 1; row < array2d.length; row++) {
			for(int col = 0; col < array2d[row].length; col++) {
				array2d[row][col] = i++;
			}
		}
	}

}
