package Practice_002;

import java.util.Scanner;

public class exam003 {

	/*
	 * Soal 03			N => 7			
			1	4	7	10	13	16	19
	 */
	// kelipatan +3
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    
	    
	    i = 1;
	    int angka = 1;
	    int kelipatan = 3;
	  
	    while (i <= jumlah_deret) {
	    	System.out.print(angka + " ");
	    	angka+=kelipatan;
	    	i++;
	    }
		    System.out.println();
		    input.close();
	}

}
