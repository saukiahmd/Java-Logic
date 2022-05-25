package Practice_003B;

import java.util.Scanner;

public class exam010 {
	/*
	 Soal 10							
		input		:	kerupuk udang balado				
		output		:	k***k u***g b***o				
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.print("Masukan Huruf :");
		String kalimat = input.nextLine();
		
		String[] arrayKalimat = kalimat.split(" ");
		
		System.out.println("output\t:");
		for(int i= 0; i< arrayKalimat.length; i++) {
			System.out.print(arrayKalimat[i].charAt(0) + "***" 
			+ arrayKalimat[i].charAt(arrayKalimat[i].length()-1) + " ");
		}
	}

}
