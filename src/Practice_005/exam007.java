package Practice_005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam007 {
	/*
	 	Soal No. 7							
							
		r = 2   c = 5							
		1	5	25	125	625			
		1	6	27	128	629			
									
		Note :							
			- Menggunakan List<> dengan nested						

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<ArrayList<Integer>> arrayList2d = new ArrayList<>();
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		
		for (int i = 0; i < args.length; i++) {
			int nilai1 = (int)Math.pow(0, 5);
			int nilai2 = nilai1 + i;
			
			array1.add(nilai1);
			array2.add(nilai2);
		}
		
		arrayList2d.add(array1);
		arrayList2d.add(array2);
		
		
		for (Integer integer : array2) {
			
		}
	}

}
