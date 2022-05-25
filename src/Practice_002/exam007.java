package Practice_002;

import java.util.Scanner;

public class exam007 {
	
	/*
	 * Soal 07			N => 7			
		1	5	*	9	13	*	17
	 */
	// kelipatan +4
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		  
		  
	    int i;
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt();
	    
	    
	    i = 1;
	    int angka = 1;
	    int kelipatan = 4;
		  
	    while (i <= jumlah_deret) {
	    	if (i == 3 || i == 6 ) {
	    		System.out.print("* ");
	    	}else {	    		
	    		System.out.print(angka + " ");
	    		angka+=kelipatan;
	    	}
	    	
	    	i++;
	    	
	    }
		    System.out.println();
		    input.close();
	}

}
