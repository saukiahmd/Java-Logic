package Day1;

import java.util.Scanner;

public class LearnUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// membuat object scanner untuk menerima inputan dari user
		Scanner input = new Scanner(System.in); // deklarasi variable input
		
		// terima inputan user
		System.out.print("masukkan nama anda :");
		String name = input.nextLine();
		
		// cetak hasil inputan user
		System.out.println("nama anda adalah " + name);
		
		input.close();
	}

}
