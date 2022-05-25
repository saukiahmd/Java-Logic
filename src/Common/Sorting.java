package Common;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static double[] bubbleSort(double[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				double kiri = array[j];
				double kanan = array[j + 1];

				if (kiri > kanan) {
					array[j] = kanan;
					array[j + 1] = kiri;
				}
			}
		}

		return array;
	}

	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int kiri = array[j];
				int kanan = array[j + 1];
				int temp;

				if (kiri > kanan) {
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

	// method insertion sort ascending / descending
	public static int[] insertionSort(int[] array, String typeSort) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			
			if(typeSort.toLowerCase().equals("asc")) {
				while (j >= 0 && temp <= array[j]) {
					array[j + 1] = array[j];
					j = j - 1;
				}	
				array[j + 1] = temp;
			}else if(typeSort.toLowerCase().equals("desc")) {
				while (j >= 0 && temp >= array[j]) {
					array[j + 1] = array[j];
					j = j - 1;
				}
				array[j + 1] = temp;
			}
			
		}
		return array;
	}
	
	// method selection sort ascending / descending
	public static int[] selectionSort(int[] array, String typeSort) {
		for (int i = 0; i < array.length; i++) {
			int a = i; //elemen terkecil di unsorted array
			
			for (int j = i+1; j < array.length; j++) {
				if(typeSort.toLowerCase().equals("asc") && (array[j] < array[a])) {
					a = j; // tukar element terkecil dengan element pertama
					
					int temp = array[a];
					array[a] = array[i];
					array[i] = temp;
				}else if(typeSort.toLowerCase().equals("desc") && (array[j] > array[a])){
					a = j; // tukar element terkecil dengan element pertama
					
					int temp = array[a];
					array[a] = array[i];
					array[i] = temp;
				}
			}
		}
		
		return array;
	}
	
	// menghitung max value
	public static int maxValue(int [] array) {
		int count = 0;
		for (int i = array.length - 1; i > array.length - 5; i--) {
			count = count + array[i];
		}
		return count;
	}
	
	// menghitung min value
	public static int minValue(int [] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			count = count + array[i];
		}
		return count;
	}
	
	// menghitung sum
	public static int sum(int[] sum) {
		int count = 0;
		for (int i = sum.length; i < sum.length-1; i--) {
			count = count + sum[i];
		}
		return (count);
	}
	
	// caesar cipher
	public static String[] Caesar_Cipher(String[] data, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < data.length; j++) {
				char temp = (char) data[j].charAt(0);
				if ((temp >= 'a' && temp < 'z') || (temp >= 'A' && temp < 'Z')) {
					temp = (char) (temp + 1);
				} else if (temp == 'z') {
					temp = (char) ((char) 'a');
				} else if (temp == 'Z') {
					temp = (char) ((char) 'A');
				}
				data[j] = Character.toString(temp);
			}
		}
		return data;
	}
	
	// mencari sos
	public static void sos(String[] data) {
		int panjang = data.length;
		int jumlah = panjang / 3;
		int sesuai = 0;

		for (int i = 0; i < data.length - 2;) {
			if (Character.toLowerCase((data[i]).charAt(0)) == 's'
					&& Character.toLowerCase((data[i + 1]).charAt(0)) == 'o'
					&& Character.toLowerCase((data[i + 2]).charAt(0)) == 's') {
				sesuai++;
			}
			i = i + 3;
		}
		int gagal = jumlah - sesuai;

		System.out.println("panjang\t: " + panjang);
		System.out.println("jumlah\t: " + jumlah);
		System.out.println("sesuai\t: " + sesuai);
		System.out.println("gagal\t: " + gagal);
	}
	
	public static void print(char[] hasil) {
		System.out.print("output\t: ");
		for (int i = 0; i < hasil.length; i++) {
			System.out.print(hasil[i]);
		}
	}

}
