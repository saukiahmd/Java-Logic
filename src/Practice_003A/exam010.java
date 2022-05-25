package Practice_003A;

import java.util.Scanner;

public class exam010 {
	/*
	 	Soal 10			N => 7			
		3	9	27	XXX	243	729	2187
		kelipatan *3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		  
	     
	    System.out.print("Jumlah deret yang diinginkan: ");
	    int jumlah_deret = input.nextInt(); // terima inputan jumlah deret
	    
	    
	    int i = 0;	// deklarasi nilai i
	    int angkaAwal = 3; // deklarasi nilai angka awal
	    String[] arrHimpunan = new String[jumlah_deret]; // deklarasi jumlah_deret sebagai array
	    
	    //membuat array
	    while (i < jumlah_deret) {
	    	if(i%4 != 3) {
	    		arrHimpunan[i] = Integer.toString(angkaAwal); // menyimpan data angka awal ke arrHimpunan[i] yang sebelumnya di cast to string
	    	}else {
	    		arrHimpunan[i] = "XXX";	    		
	    	}
	    	
	    	/*
	    	 0%4=0
	    	 1%4=1
	    	 2%4=2
	    	 3%4=3
	    	 4%4=0
	    	 5%4=1
	    	 6%4=2
	    	 7%4=3
	    	 8%4=0
	    	 */
	    	
	    	angkaAwal*=3; // penjumlahan angka awal
	    	i++; // penjumlahan nilai i
	    }
	    
	    for (String angka : arrHimpunan) {
	    	System.out.print(angka + " "); // output untuk menampilkan data yang tersimpan ketika loop
	    }
	    
		    input.close();
	}

}
