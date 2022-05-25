package Practice_003A;

import java.util.Scanner;

public class exam006 {

	/*
	 * Soal 06			N => 7			
		1	5	*	13	17	*	25
		kelipatan = 4
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
		  
	    
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt(); // terima inputan jumlah deret
	    
	    
	    
//	    for(int i=1; i < jumlah_deret * 4; i+=4 ) { // *4 itu adalah penjumlahan beserta kelipatan yang sesuai dengan soal
//	    	if(i%3 == 0) {
//	    		
//	    		arrHimpunan[i/4] = "*"; // i/4 merupakan untuk mencari index yang sesuai dengan soal
//	    	}else {
//	    		arrHimpunan[i/4] = String.valueOf(i);
//	    	}
//	    	
//	    	/*
//	    	 i		i + 4					isian			bintang
//	    	 1		1 + 4 = 5		Y		1 / 4 = 0 		1 % 3 = 1
//	    	 2		2 + 4 = 6								2 % 3 = 2
//	    	 3												3 & 3 = 0
//	    	 4												4 % 3 = 1
//	    	 5		5 + 4 = 9		Y		5 / 4 = 1		5 % 3 = 2
//	    	 6		6 + 4 = 10								6 % 3 = 0
//	    	 7												7 % 3 = 1
//	    	 8												8 % 3 = 2
//	    	 9												9 % 3 = 0
//	    	 */
//	    }
	    
	    int i = 0;	// deklarasi nilai i
	    int angkaAwal = 1; // deklarasi nilai angka awal
	    String[] arrHimpunan = new String[jumlah_deret]; // deklarasi jumlah_deret sebagai array
	    
	    //membuat array
	    while (i < jumlah_deret) {
	    	if(i%3 != 2) {
	    		arrHimpunan[i] = Integer.toString(angkaAwal); // menyimpan data angka awal ke arrHimpunan[i] yang sebelumnya di cast to string
	    	}else {
	    		arrHimpunan[i] = "*";	    		
	    	}
	    	
	    	angkaAwal+=4; // penjumlahan angka awal
	    	i++; // penjumlahan nilai i
	    }
	    
	    for (String angka : arrHimpunan) {
	    	System.out.print(angka + " "); // output untuk menampilkan data yang tersimpan ketika loop
	    }
	    
		    input.close();
	}

}
