package Practice_003B;

import java.util.Scanner;

public class exam007 {
/*
	 Soal 7							
	input		:	PT. XSIS MITRA UTAMA				
	output		:	1				

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.println("Masukan Huruf");
		String huruf = input.nextLine();
		
		int hitung = 0;
		for(int i = 0; i < huruf.length(); i++) {
			if(huruf.charAt(i) == '.'){ // mengambil 1 karakter dalam index tertentu
				hitung++;
			}
		}
		System.out.println(hitung);
	}

}
