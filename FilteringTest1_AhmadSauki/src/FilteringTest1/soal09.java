package FilteringTest1;

import java.util.Arrays;
import java.util.Scanner;

import Sorting.Sorting;

public class soal09 {
	/*
	 	Problem : urutkan huruf/karakter dari gabungan beberapa kata atau sebuah kalimat sesuai dengan abjad alfabet
		Input : gabungan beberapa kata atau sebuah kalimat
		Constraints :
		    - mengandung huruf vokal dan konsonan
		    - urut dan pisahkan huruf/karakter tersebut
		    - kelompokkan huruf yang sama
		    - diproses sebagai huruf kecil (spasi diabaikan)
		Output : huruf yang sama dikelompokkan menjadi satu dan dipisahkan dengan tanda "-"
		
		Example
		input n : Sample Case
		output : aa - c - ee - l - m - p - ss
		
		input n :  Next Case
		output : a - c - ee - n - s - t - x
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("input n\t: ");
		String[] data = input.nextLine().split("");
		
		String vokal = new String();
		String konsonan = new String();
		
		for (int i = 0; i < data.length; i++) {
			if((data[i].toLowerCase().equals("a"))
				|| (data[i].toLowerCase().equals("i"))
				|| (data[i].toLowerCase().equals("u"))
				|| (data[i].toLowerCase().equals("e"))
				|| (data[i].toLowerCase().equals("o"))) {
					vokal+=data[i];
			}else if (data[i].equals("a") ) {
				
			}
			}
		
		char[] a = vokal.toCharArray();
		char[] b = vokal.toCharArray();
		
		Arrays.sort(a);
//		Arrays.sort(b);
		Sorting sort = new Sorting();
		sort.print(a);
		System.out.println();
//		sort.print(b);
		}
	}

