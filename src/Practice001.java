import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;

public class Practice001 {
/*
 	Latihan Logic - Practice 001
 	ada data sebagai berikut “mangga:5;jambu:4;pisang:3;mangga:2”
	output program sebagai berikut
	mangga     = 7
	jambu      = 4
	pisang     = 3
	Note : gunakan Hasmap<>
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan data: ");
		String [] data = input.nextLine().split(";");
		
		HashMap<String, Integer> buahHash = new HashMap<String, Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			int indexJml = data[i].indexOf(":");
			String buah = data[i].toLowerCase().trim().substring(0, indexJml);
			int jmlBuah = Integer.parseInt(data[i].trim().substring(indexJml+1));
			
			if(buahHash.containsKey(buah) == true) {		
				int jumlahSeb = buahHash.get(buah);
				buahHash.replace(buah, jumlahSeb + jmlBuah);
			}else {
				buahHash.put(buah, jmlBuah);
			}
		}
		for (Map.Entry<String, Integer> buahHasil : buahHash.entrySet()) {
			System.out.println(buahHasil.getKey() + " = " + buahHasil.getValue());
		}
		
		input.close();
		
	}

}
