package Practice_002;

import java.util.Scanner;

public class exam004 {

	/*
	 * Soal 04			N => 7			
			1	5	9	13	17	21	25
	 */
	// kelipatan +4
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();

	    
	    input.close();
	    
	    i = 1;
	    int angka = 1;
	    int kelipatan = 4;
	  
	    while (i <= jumlah_deret) {
	    	System.out.print(angka + " ");
	    	angka+=kelipatan;
	    	i++;
	    }
		    System.out.println();

	}

}
