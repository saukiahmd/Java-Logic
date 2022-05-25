package Day11;

import java.util.Arrays;

public class LatihanBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		caseBubbleSort();
	}
	
	public static void caseBubbleSort() {
		// membuat array dengan tipe data integer
		double [] arrayNilai = {3, 2, 4, 1, 5};
		
		System.out.println("Before \t" + Arrays.toString(arrayNilai));
		
		for (int i = 0; i < arrayNilai.length; i++) {
			for (int j = 0; j < arrayNilai.length-1; j++) {
				double kiri = arrayNilai[j];
				double kanan = arrayNilai[j+1];
				
				if (kiri > kanan) {
					arrayNilai[j] = kanan;
					arrayNilai[j+1]= kiri;
				}
			}
		}
	}
	
}
