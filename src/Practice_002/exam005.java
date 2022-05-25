package Practice_002;

import java.util.Scanner;

public class exam005 {

	/*
	 * Soal 05			N => 7			
			2	4	8	16	32	64	128
	 */
	// kelipatan *2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    
	    
	    
	    input.close();
	    
	    i = 1;
	    int angka = 2;
	  
	    while (i <= jumlah_deret) {
	    	System.out.print(angka + " ");
	    	angka*=2;
	    	i++;
	    }
		    System.out.println();
	}

}
