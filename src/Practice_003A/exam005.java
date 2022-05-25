package Practice_003A;

import java.util.Scanner;

public class exam005 {

	/*
	 * Soal 05			N => 7			
		2	4	8	16	32	64	128
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    
	    
	    i = 0;
	    int angkaAwal = 2;
	    int[] angka = new int[jumlah_deret];
	  
	    while (i < jumlah_deret ) {
	    	angka[i] = angkaAwal;
	    	angkaAwal*=2;
	    	i++;
	    }
	    
	    for (int hasil : angka) {
			System.out.print(hasil + " ");
		}
	    
		    input.close();
	}

}
