package Practice_003B;
import java.util.Arrays;
import java.util.Scanner;

public class exam009 {
	/*
	 	Soal 9					
		input		:	ManTuL bingits		
		output		:	almntu bgiinst		
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//membuat scanner untuk input
		Scanner input = new Scanner(System.in);
				
		// membuat variabel untuk input
		System.out.print("Input\t: ");
		String kalimat = input.nextLine();

		// deklarasi array untuk tiap kata
		String[] arayKalimat = kalimat.toLowerCase().split(" ");
				
		// mencetak sesuai format soal
		for (int i = 0; i < arayKalimat.length; i++) {
				String[] arayKata = arayKalimat[i].split("");
				Arrays.sort(arayKata);
			
			for (int j = 0; j < arayKata.length; j++) {
					System.out.print(arayKata[j]);
					}
					System.out.print(" ");
			}
						
		//menutup scanner
		input.close();

	}
}
