package Day11;

import java.util.Arrays;
import java.util.Collections;

public class LearnArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		case2();
//		case3();
//		case4();
	}

	public static void case1() {
		// membuat array dengan tipe data integer
		Integer[] arrayNilai = { 23, 89, 70, 95, 65, 80, 40 };
		System.out.println("Before\t: " + Arrays.toString(arrayNilai));

		// mengurutkan dengan class bawaan java
		Arrays.sort(arrayNilai);
		Arrays.sort(arrayNilai, Collections.reverseOrder());
		System.out.println("After\t: " + Arrays.toString(arrayNilai));
	}

	public static void caseBubbleSort() {
		// membuat array dengan tipe data integer
		Integer[] arrayNilai = { 23, 89, 70, 95, 65, 80, 40 };
		System.out.println("Before\t: " + Arrays.toString(arrayNilai));

		for (int i = 0; i < arrayNilai.length; i++) {
			for (int j = 0; j < arrayNilai.length - 1; j++) {
				int kiri = arrayNilai[j];
				int kanan = arrayNilai[j + 1];

				if (kiri > kanan) {
					arrayNilai[j] = kanan;
					arrayNilai[j + 1] = kiri;
				}
			}
			System.out.println(Arrays.toString(arrayNilai));
		}
		// 23, 89, 70, 95, 65, 80, 40
		// 23, 70, 89, 65, 80, 40, 95
		// 23, 70, 65, 80, 40, 89, 95

		// cetak array
		System.out.println("\nAfter\t: " + Arrays.toString(arrayNilai));
	}

	public static void case2() {
		// membuat array dengan tipe data integer
		int[] arrayNilai = { 23, 89, 70, 95, 65, 80, 40 };
		System.out.println("Before\t: " + Arrays.toString(arrayNilai));

		System.out.println("Before\t: " + Arrays.toString(bubbleSort(arrayNilai)));
	}

	public static void case3() {
		// membuat array dengan tipe data integer
		int[] arrayNilai = { 23, 89, 70, 95, 65, 80, 40 };
		System.out.println("Before\t: " + Arrays.toString(arrayNilai));

		System.out.println("Before\t: " + Arrays.toString(bubbleSortDescending(arrayNilai)));
	}

	public static void case4() {
		System.out.println("Case 4");

		// membuat array dengan tipe data integer
		int[] arrayNilai = { 23, 89, 70, 95, 65, 80, 40 };
		System.out.println("Before\t: " + Arrays.toString(arrayNilai));

		System.out.println("Before\t: " + Arrays.toString(bubbleSort(arrayNilai, "Desc")));
	}

	// method bubble sort ascending
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int kiri = array[j];
				int kanan = array[j + 1];

				if (kiri > kanan) {
					array[j] = kanan;
					array[j + 1] = kiri;
				}
			}
		}

		return array;
	}

	// method bubble sort descending
	public static int[] bubbleSortDescending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int kiri = array[j];
				int kanan = array[j + 1];

				if (kiri < kanan) {
					array[j] = kanan;
					array[j + 1] = kiri;
				}
			}
		}

		return array;
	}

	// method bubble sort ascending / descending
	public static int[] bubbleSort(int[] array, String typeSort) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int kiri = array[j];
				int kanan = array[j + 1];

				if (typeSort.toLowerCase().equals("desc") && kiri < kanan) {
					array[j] = kanan;
					array[j + 1] = kiri;
				} else if (typeSort.toLowerCase().equals("asc") && kiri > kanan) {
					array[j] = kanan;
					array[j + 1] = kiri;
				}
			}
		}

		return array;
	}

}
