package FilteringTest1;

public class soal05 {
	/*
	 	Huruf alfabet dalam huruf kecil di bawah ini mengandung bobot yang sudah ditentukan sebagai berikut:
		a = 1; b = 2; c = 3; d = 4; .... Z = 26.
		Tentukan apakah dalam sebuah input string sudah memiliki bobot yang sesuai.

		Constraint :
		-    0 <= n <= 100
		-    string hanya mengandung huruf kecil
		
		Input
		string : mengandung kata/kalimat
		array n : mengandung array angka yang harus dicocokkan terhadap string
		
		Example
		string : abcdzzz
		array : [1, 2, 2, 4, 4, 26, 26]
		
		Output : true, true, false, true, false, true, true
		
		Explanation :
		a = 1 -> true
		b = 2 - > true
		c = 3 -> false
		d = 4 -> true
		z = 4 -> false
		z = 26 -> true
		z = 26 -> true
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] alfabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"
							, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		int [] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24
		}
	}

}
