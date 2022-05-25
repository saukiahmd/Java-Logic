package FilteringTest1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Sorting.Sorting;

public class soal03 {
	/*
	 	Berikut ini adalah record penjualan buah dalam bentuk string

		Apel:1, Pisang:3, Jeruk:1, Apel:3, Apel:5, Jeruk:8, Mangga:1
		
		Buat summary penjualannya
		
		Input: string record penjualan
		Output: Summary penjualan, dalam alphabetical order
		    Apel: 9
		    Jeruk: 9
		    Mangga: 1
		    Pisang: 3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan data: ");
		String [] data = input.nextLine().split("," + " "); // memisahkan kata per index menggunakan , dan spasi
		
		
		HashMap<String, Integer> buahHash = new HashMap<String, Integer>();
		
		for (int i = 0; i < data.length; i++) {
			int indexJml = data[i].indexOf(":"); // memisahkan antara kata dengan angka menggunakan : 
			String buah = data[i].toLowerCase().trim().substring(0, indexJml);	
			int jmlBuah = Integer.parseInt(data[i].trim().substring(indexJml+1));
			
			
			
		if(buahHash.containsKey(buah) == true) {
			
			int jumlahSebelum = buahHash.get(buah);
			buahHash.replace(buah, jumlahSebelum + jmlBuah);
		}else {
			buahHash.put(buah, jmlBuah);
		}
	}
	
		for(Map.Entry<String, Integer> buahHasil : buahHash.entrySet()) {
//			Sorting get = new Sorting();
			
			System.out.println(buahHasil.getKey() + " : " + buahHasil.getValue());
		}
		input.close();
	}
	


}
