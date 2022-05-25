package Practice_007;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class exam009 {
	/*
	 * Soal No. 9 — Diagonal Difference
	 * 
	 * Contoh Input 11 2 4 input ke 1 4 5 6 input ke 2 10 8 -12 input ke 3
	 * 
	 * Contoh Output 15
	 * 
	 * Penjelasan Diagonal Pertama adalah: 11 5 -12 Lakukan penjumlahan terhadap
	 * angka didiagonal tersebut 11 + 5 - 12 = 4
	 * 
	 * Diagonal ke dua adalah: 4 5 10 Lakukan penjumlahan terhadap angka didiagonal
	 * tersebut 4 + 5 + 10 = 19
	 * 
	 * Lakukan pengurangan diagonal ke satu terhadap didiagonal ke dua, dan jadikan
	 * bilangan mutlak |4 - 19| = 15
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		List<List<Integer>> matrixInput = new ArrayList<List<Integer>>();

		System.out.print("Input ke 1\t: ");
		List<Integer> list1 = Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		matrixInput.add(list1);

		System.out.print("Input ke 2\t: ");
		matrixInput.add(Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

		System.out.print("Input ke 3 \t: ");
		matrixInput.add(Arrays.stream(input.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()));

		int diagonal1 = 0;
		int diagonal2 = 0;
		for (int i = 0; i < matrixInput.size(); i++) {
			if (matrixInput.get(0).size() != matrixInput.get(i).size()) {
				System.err.println("Panjang data tidak sama");
				break;
			} else {
				int n = matrixInput.get(i).size();
				diagonal1 += matrixInput.get(i).get(i);
				diagonal2 += matrixInput.get(i).get(n - 1 - i);
			}
		}
		System.out.println("Output \t\t: " + Math.abs(diagonal1 - diagonal2));
	}
}
