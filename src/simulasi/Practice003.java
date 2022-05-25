package simulasi;

import java.util.Scanner;

public class Practice003 {
	/*
	 	Sepasang kekasih melakukan touring menggunakan motor melewati gunung dan lembah dengan definisi :
		   - gunung   : urutan naik dari 0 mdpi dan turun di mdpi,
		    			simbolnya U
		   - lembah   : urutan turun dari 0 mdpi dan naik di mdpi, 
		   				simbolnya D
		berikut ini adalah historynya UUUDDUDDDDUUUUUDD
		Berapa gunung dan lembah yang dilewati ?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan history\t: ");
		String[] data = input.nextLine().split("");
		
		int u = 0;
		int d = 0;
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if(data[i].equals("U")) {
				count++;
			}else if(data[i].equals("D")){
				count--;
			}
			if(count == 0 && data[i].equals("U")) {
				u++;
			}else if (count == 0 && data[i].equals("D")){
				d++;
			}
		}
		System.out.println("gunung " + u);
		System.out.println("lembah " + d);
	}

}
