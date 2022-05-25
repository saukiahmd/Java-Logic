package Day4;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// membuat array tanpa sebut panjang dan isi data
		String[] arrString;
		int[] arrInt;
		float[] arrFloat;
		
		// arrString = new String[3];
		// arrString = new String[] {"", ""};
		
		/*
		 	-semua tipe data primitif bisa digunakan untuk membuat array
		 	-tidak bisa menggunakan method length jika 
		 */
		
		//membuat array tanpa ada isi data
		String[] arrString2 = new String[3];
		int[] arrInt2 = new int[5];
		float[] arrFloat2 = new float[4];
		
		
		System.out.println("Panjang string array = " + arrString2.length);
		System.out.println("Panjang int array = " + arrInt2.length);
		System.out.println("Panjang float array = " + arrFloat2.length);
		
		
		// membuat array langsung dengan datanya
		String[] arrString3 = {"BMW", "Suzuki", "Toyota"};
		int[] arrInt3 = new int[] {80, 90, 99};
		float[] arrFloat3 = new float[] {80f, 90f};
		
		
		
		// ---------------------------- akses array => ambil data
		// cetak data di arrString3
		System.out.println("data pada arrString3 index ke 2 " + arrString3[2]);
		
		// ---------------------------- akses array => rubah data
		// rubah data toyota jadi volvo
		// index toyota = 2
		arrString3[2] = "volvo";
		System.out.println(arrString3[2]);
		
		// ---------------------------- akses array => cetak data
		System.out.println("\nCetak manual dengan index");
		System.out.println(arrString3[0]);
		System.out.println(arrString3[1]);
		System.out.println(arrString3[2]);
		
		System.out.println("\nCetak dengan foreach");
		for (String car : arrString3) {
			System.out.println(car);
		}
		
		System.out.println("\nCetak dengan for");
		for (int i = 0; i < arrString3.length; i++) {
			System.out.println(arrString3[i]);
		}
		
		System.out.println("\nCetak dengan while");
		int i = 0;
		while (i < arrString3.length) {
			System.out.println(arrString3[i]);
			i++;
		}
		
		System.out.println("\nCetak dengan do while");
		int x = 0;
		do {
			System.out.println(arrString3[x]);
			x++;
		}
		while (x < arrString3.length);
		
		System.out.println("\npanjang arrString3 dengan do while" 
		+ " dan berdasarkan urutan data textnya descending");
		int y = 2;
		do {
			System.out.println(arrString3[y]);
			y--;
			
		}
		while (y >= 0);
		
		
	}

}
