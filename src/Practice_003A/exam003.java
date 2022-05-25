package Practice_003A;

import java.util.Scanner;

public class exam003 {

	/*
	 * Soal 03			N => 7			
		1	4	7	10	13	16	19
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    
	    
	    i = 0;
	    int angkaAwal = 1;
	    int[] angka = new int[jumlah_deret];
	  
	    while (i < jumlah_deret ) {
	    	angka[i] = angkaAwal;
	    	angkaAwal+=3;
	    	i++;
	    }
	    
	    for (int hasil : angka) {
			System.out.print(hasil + " ");
		}
	    
		    input.close();
	}

}
