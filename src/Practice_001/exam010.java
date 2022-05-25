package Practice_001;

import java.util.Scanner;

public class exam010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Soal No. 10																								
																								
		STRUK BELANJA																								
		===================================																								
		Bon		X593-309-29345										tipe data string, panjang karakter max. 15												
		===================================																								
		kopika				1		5700		 5700 				tipe data angka bebas, nama item dan total item berupa inputan												
		mie rebus			20		2765		 55300 				tipe data angka bebas, nama item dan total item berupa inputan												
		sok klin			2		16582		 33164 				tipe data angka bebas, nama item dan total item berupa inputan												
		----------------------------------------------------																								
		Total Item				23				 94164																
		Total Disc.								 1412				jika total item lebih dari 70000 maka dpt diskon 1,5%												
		Total Belanja							 92752																
		Cash								  	 100000																
		Cash Out								 7248																

		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nomer bon\t:"); 
		String bon = input.nextLine(); //inputan untuk nomer bon
		
		System.out.print("masukkan nama item 1\t:"); 
		String nilai1 = input.nextLine(); //inputan untuk nama item 1
		
		System.out.print("masukkan harga item 1\t:"); 
		int harga1 = Integer.parseInt(input.nextLine()); //inputan untuk harga item 1
		
		System.out.print("masukkan total item 1\t:"); 
		int total1 = Integer.parseInt(input.nextLine());; //inputan untuk total 1
		
		System.out.print("masukkan nama item 2\t:"); 
		String nilai2 = input.nextLine(); //inputan untuk nama item 2
		
		System.out.print("masukkan harga item 2\t:"); 
		int harga2 = Integer.parseInt(input.nextLine()); //inputan untuk harga item 2
		
		System.out.print("masukkan total item 2\t:"); 
		int total2 = Integer.parseInt(input.nextLine()); //inputan untuk total item 2
		
		System.out.print("masukkan nama item 3\t:"); 
		String nilai3 = input.nextLine(); //inputan untuk nama item 3
		
		System.out.print("masukkan harga item 3\t:"); 
		int harga3 = Integer.parseInt(input.nextLine()); //inputan untuk harga item 3
		
		System.out.print("masukkan total item 3\t:"); 
		int total3 = Integer.parseInt(input.nextLine()); //inputan untuk total item 3
		
		System.out.print("masukkan jumlah cash\t:"); 
		int cash = Integer.parseInt(input.nextLine()); //inputan untuk total item 3
		
		
		int hasil1 = total1 * harga1;
		int hasil2 = total2 * harga2;
		int hasil3 = total3 * harga3;
		
		int jumlahTotal = total1 + total2 + total3;
		
		int hargaTotal = hasil1 + hasil2 + hasil3;
		
		double hargaDiskon = hargaTotal * 1.5 / 100;
		
		double hasilTotal = hargaTotal - hargaDiskon;
		
		double hasilKembalian = cash - hasilTotal;
		
		
		System.out.println("\t\tSTRUK BELANJA");
		System.out.println("===================================");
		if(bon.length() <= 15) {
			System.out.println("Bon\t" + bon);
		}else {
			System.out.println("bon\t" + "panjang karakter maksimal 15");
		}
		System.out.println("===================================");
		System.out.println(nilai1 + "\t\t" + total1 + "\t" + harga1 + "\t" + hasil1);
		System.out.println(nilai2 + "\t" + total2 + "\t" + harga2 + "\t" + hasil2);
		System.out.println(nilai3 + "\t" + total3 + "\t" + harga3 + "\t" + hasil3);
		System.out.println("------------------------------------");
		System.out.println("Total item\t" + jumlahTotal + "\t\t" + hargaTotal);
		if (hargaTotal >= 70000) {
			System.out.println("Total Disc\t\t\t" + ((int)hargaDiskon));
		}
		System.out.println("Total Belanja\t\t\t" + ((int)hasilTotal));
		System.out.println("Cash\t\t\t\t" + ((int)cash));
		System.out.println("Cash out\t\t\t" + ((int)hasilKembalian));
		
		
		input.close();
		
	}

}
