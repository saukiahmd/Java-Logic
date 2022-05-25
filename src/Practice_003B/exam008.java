package Practice_003B;

import java.util.Scanner;

public class exam008 {
	/*
	 	Soal 8				
		input		:	abuba	
		output		:	abuba	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// membuat input
		System.out.println("Masukan Huruf :");
		String kalimat = input.nextLine();
		
		// deklarasi array
		String[] arrayKalimat = kalimat.split("");
		
		//cetak array
		for(int i = arrayKalimat.length-1; i >= 0; i--) {
			System.out.print(arrayKalimat[i]);
		}
	}

}
