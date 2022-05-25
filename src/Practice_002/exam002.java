package Practice_002;

import java.util.Scanner;

public class exam002 {

	/*
	 * Soal 02			N => 7			
			2	4	6	8	10	12	14
	 */
	// kelipatan +2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    
	    
	    i = 1;
	    int angka = 2;
	    int kelipatan = 2;
	  
	    while (i <= jumlah_deret) {
	    	System.out.print(angka + " ");
	    	angka+=kelipatan;
	    	i++;
	    }
		    System.out.println();
		    input.close();
	}

}
