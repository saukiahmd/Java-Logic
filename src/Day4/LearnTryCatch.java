package Day4;

public class LearnTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrayNama = {"Rizka", "Latifah", "Pricil" };
		// index				0		1			2
		// urutan				1		2			3
		
		
		// cetak index data ke 1 menggunakan index
		// data ke 1 = rizka
		// index data ke 1 = 0
		System.out.println(arrayNama[1]);
		
		// cetak data ke 3 menggunakan index
		// data ke 3 = pricillia
		// index data ke 3 = 2
		System.out.println(arrayNama[2]);
		
		// cetak data ke 1 dan 3 jadi satu baris
		// data ke 1 = rizka
		// index data ke 1 = 0
		// data ke 3 = pricillia
		// index data ke 1 = 2
		// output = rizka, pricillia
		System.out.println(arrayNama[0] + ", " + arrayNama[2]);
		
		try {
			// cetak data ke 4 menggunakan index 
			// data ke 4 = ....
			// index data ke 4 = 3
			System.out.println(arrayNama[3]);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
