package Practice_003B;

import java.util.Scanner;

public class exam006 {

	/*
	 Soal 6					
		input		:	saya pasti bisa		
		output		:	YA STI SA		
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.println("Masukan Huruf");
		String huruf = input.nextLine();
		
		//deklarasi array
		String[] arrHuruf = huruf.toUpperCase().split(" ");
		
		//mencetak array
		for (String kata : arrHuruf) {
			// menentukan batas awal(kata.length()/2) dan batas akhir(kata.length())
			System.out.print(kata.substring(kata.length()/2, kata.length()) + " ");
		}
		input.close();
	}

}
