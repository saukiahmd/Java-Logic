package Practice_005;
import java.util.*;

public class exam001 {

	/*
	 	Soal No.1							
							
		r = 2   c = 7							
		7	8	9	10	11	12	13	
		14	15	16	17	18	19	20	
									
		Note :							
			- Menggunakan array multidimention						
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("masukkan row  :");
		int nilai1 = input.nextInt();
		
		System.out.print("masukkan col  :");
		int nilai2 = input.nextInt();
		
		System.out.println("masukan suku pertama :");
		int nilai3 = input.nextInt();
		
		int [] [] array2d = new int[nilai1][nilai2];
		
		for (int row = 0, i = nilai3 ; row < array2d.length; row++) {
			for(int col = 0; col < array2d[row].length; col++) {
				array2d[row][col] = i++;
			}
		}
		
		// menampilkan
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[row].length; col++) {
				System.out.print(array2d[row][col] + "\t");
			}
			System.out.println();// cetak baris baru
		
		}
		input.close();
	}
	
}
