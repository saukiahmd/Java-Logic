package Practice_002;

import java.util.Scanner;

public class exam008 {

	/*
	 * Soal 08			N => 7			
		3	9	27	81	243	729	2187
	 */
	// kelipatan *3
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    

	    
	    i = 1;
	    int angka = 3;
	    int kelipatan = 3;
	  
	    while (i <= jumlah_deret) {
	    	
	    	System.out.print(angka + " ");
	    	
	    	
	    	i++;
	    	angka*=kelipatan;
	    	
	    }
		    System.out.println();
		    input.close();
	}

}
