package Sorting;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	// method bubble sort ascending / descending
	public static int[] bubbleSort(int[] array, String typeSort) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int kiri = array[j];
				int kanan = array[j + 1];
				
//				if (kiri > kanan) {
//					array[j] = kanan;
//					array[j + 1] = kiri;
//				}
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
	
	// enkripsi
		public static String[] enkripsi(String[] data, int n) {
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
		
		public static void print(char[] hasil) {
			System.out.print("output\t: ");
			for (int i = 0; i < hasil.length; i++) {
				System.out.print(hasil[i]);
			}
		}


}
