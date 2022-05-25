package Practice_005;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class exam008 {
	/*
	 	Soal No. 8							
							
		r = 4   c = 7 & 5							
		0	1	2	3	4	5	6	
		7	14	21	28	21	14	7	
		0	1	2	3	4			
		5	10	15	10	5			
									
		Note :							
			- Menggunakan List<> dengan nested						

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> arrayList2d = new ArrayList<>();
		
		List<Integer> arrayList1 = new ArrayList<>();
		List<Integer> arrayList2 = new ArrayList<>();
		List<Integer> arrayList3 = new ArrayList<>();
		List<Integer> arrayList4 = new ArrayList<>();
		
		//mengisi data list untuk bari ke 1 dan ke 3
		for (int i = 0, x = 0; i < 7; i++) {
			arrayList1.add(i); // mengisi data baris ke 1
			
			// mengisi data baris ke 2
			if(i <= (7/2)) {
				arrayList2.add(x+7);
				x= x+7;
			}else {
				arrayList2.add(x-7);
				x= x-7;
			}
		}
		
		// mengisi data list untuk baris ke 3 dan ke 4
		for (int i = 0, x = 0; i < 5; i++) {
			arrayList3.add(i); // mengisi data baris ke 3
			
			// mengisi data baris ke 4
			if(i <= (5/2)) {
				arrayList4.add(x+5);
				x=x+5;
			}else {
				arrayList4.add(x-5);
				x= x-5;
			}
		}
		
		
		arrayList2d.add(arrayList1);
		arrayList2d.add(arrayList2);
		arrayList2d.add(arrayList3);
		arrayList2d.add(arrayList4);
		
		// cetak menggunkan foreach
		for (List<Integer> list : arrayList2d) {
			for (int data : list) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
		
		
		// cetak menggunakan for 
		for (int i = 0; i < arrayList2d.size(); i++) {
			List<Integer> list = arrayList2d.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + "\t");
			}
			System.out.println();
		}
		
	}

}
