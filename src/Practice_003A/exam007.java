package Practice_003A;

import java.util.Scanner;

public class exam007 {

	/*
	 	Soal 07			N => 7			
		1	5	*	9	13	*	17
		kelipatan +4
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt(); // terima inputan jumlah deret
	    
	    
	    int i = 0;	// deklarasi nilai i
	    int angkaAwal = 1; // deklarasi nilai angka awal
	    String[] arrHimpunan = new String[jumlah_deret]; // deklarasi jumlah_deret sebagai array
	    
	    //membuat array
	    while (i < jumlah_deret) {
	    	if(i%3 != 2) {
	    		arrHimpunan[i] = Integer.toString(angkaAwal); // menyimpan data angka awal ke arrHimpunan[i] yang sebelumnya di cast to string
	    		angkaAwal+=4; // penjumlahan angka awal
	    	}else {
	    		arrHimpunan[i] = "*";	    		
	    	}
	    	
	    	/*
	    	 0%3=0
	    	 1%3=1
	    	 2%3=2
	    	 3%3=0
	    	 4%3=1
	    	 5%3=2
	    	 6%3=0
	    	 7%3=1
	    	 */
	    	
	    	i++; // penjumlahan nilai i
	    }
	    
	    for (String angka : arrHimpunan) {
	    	System.out.print(angka + " "); // output untuk menampilkan data yang tersimpan ketika loop
	    }
	    
		    input.close();
		
		
	}

}
