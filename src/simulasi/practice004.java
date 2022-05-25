package simulasi;
import java.util.*;

import Common.Sorting;

public class practice004 {
	/*
	 	kalimat : saya ingin dapat kopi gratis, tapi gimana caranya..?

		Buatlah :
		   - output 1 adalah kata vokal, berurutan dengan tipe descending
		   - output 2 adalah kata konsonan, berurutan dengan tipe ascending
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan kalimat : ");
		String[] data = input.nextLine().split("");

		
		String vokal = new String();
		String konsonan = new String();
		for (int i = 0; i < data.length; i++) {
			if ((data[i].toLowerCase().equals("a"))
					|| (data[i].toLowerCase().equals("i"))
					|| (data[i].toLowerCase().equals("u"))
					|| (data[i].toLowerCase().equals("e"))
					|| (data[i].toLowerCase().equals("o"))) {
				vokal += data[i];
			} else if(data[i].toLowerCase().charAt(0) >= 'a' && data[i].toLowerCase().charAt(0) <= 'z') {
				konsonan += data[i];
			}
		}
		char[] a = vokal.toCharArray();
		char[] b = konsonan.toCharArray();
		
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		Sorting sort = new Sorting();
		sort.print(a);
		System.out.println();
		sort.print(b);
	}

}
//namaArray.toString().replace("],", "\n").replace(",", "\t ").replaceAll("[\\[\\]]", "\t")
//cetak array single line
