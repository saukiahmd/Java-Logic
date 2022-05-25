package Practice_007;
import java.util.*;
import java.util.stream.Collectors;

public class exam010 {
	/*
	 * Soal No. 10 — Array Comparation
	 * 
	 * Alice dan Bob masing-masing menciptakan satu masalah untuk HackerRank.
	 * Seorang pengulas menilai dua tantangan, memberikan poin pada skala dari 1
	 * hingga 100 untuk tiga kategori: kejelasan masalah, orisinalitas, dan
	 * kesulitan. Kami mendefinisikan peringkat untuk tantangan Alice menjadi
	 * triplet a = (a[0], a[1], a[2]), dan peringkat untuk tantangan Bob menjadi
	 * triplet b = (1,[0] , b [1], b[2]).
	 * 
	 * Tugas Anda adalah menemukan titik perbandingannya dengan membandingkan a[0]
	 * dengan b[0], a[1] dengan b[1], dan a[2] dengan b[2]. • Jika nilai item Alice
	 * lebih besar dari Bob, maka Alice diberikan 1 poin. • Jika nilai item Alice
	 * lebih kecil dari Bob, maka Bob diberikan 1 poin. • Jika nilai item Alice sama
	 * dari seperti Bob, maka tidak ada orang yang menerima poin.
	 * 
	 * Poin perbandingan adalah total poin yang diperoleh seseorang. Diberikan a dan
	 * b, tentukan titik perbandingannya masing-masing. Misalnya, a = [1, 2, 3] dan
	 * b = [3, 2, 1]. Untuk elemen 0, Bob diberikan poin karena a[0] < b[0]. Untuk
	 * elemen yang sama a[1] dan b[1] tidak ada poin yang diperoleh. Akhirnya, untuk
	 * elemen 2, a,[2] > b[2] sehingga Alice menerima poin.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// membuat variabel input
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan nilai Alice\t: ");
		List<Integer> input1 = Arrays.stream(input.nextLine().split(",")).map(Integer::parseInt)
				.collect(Collectors.toList());

		System.out.print("Masukkan nilai Bob\t: ");
		List<Integer> input2 = Arrays.stream(input.nextLine().split(",")).map(Integer::parseInt)
				.collect(Collectors.toList());

		// mengecek kesesuaian input dan membandingkan array
		int nilaiMaxAlice = Collections.max(input1);
		int nilaiMinAlice = Collections.min(input1);
		int nilaiMaxBob = Collections.max(input2);
		int nilaiMinBob = Collections.min(input2);

		if (nilaiMaxAlice > 100 || nilaiMaxBob > 100) {
			System.err.println("Nilai tidak boleh melebihi 100");
		} else if (nilaiMinAlice < 0 || nilaiMinBob < 0) {
			System.err.println("Nilai tidak boleh kurang dari 0");
		} else {
			int pointAlice = 0, pointBob = 0;
			for (int i = 0; i < input2.size(); i++) {
				if (input1.get(i) > input2.get(i)) {
					pointAlice++;
				} else if (input1.get(i) < input2.get(i)) {
					pointBob++;
				}
			}
			// cetak output
			System.out.println("Point Alice\t: " + pointAlice);
			System.out.println("Point Bob\t: " + pointBob);
		}
	}
}
