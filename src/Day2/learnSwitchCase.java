package Day2;

public class learnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String gender = "laki-laki";
		
		switch (gender) {
			case "laki-laki": {
				System.out.println("Antok adalah laki-laki!");
				break;
			}
		}
		
		switch (gender) {
		case "perempuan": {
			System.out.println("antok adalah perempuan!");
			break;
		}
		case "laki-laki": {
			System.out.println("antok adalah laki-laki!");
			break;
		}
	}
		
		
		switch (gender) {
			case "Perempuan": {
				System.out.println("Antok adalah perempuan!");
				break;
			}
			case "Laki-laki": {
				System.out.println("Antok adalah laki-laki!");
				break;
			}
			default:
				System.out.println("jenis kelamin tidak dikenal!");
				break;
		}
		
		
		String kota = "Jakarta".toLowerCase(); // Jakarta => jakarta
		
		switch (kota) {
			case "jakarta": {
				System.out.println("kota adalah jakarta");
			}
		}
	}
}

//.toLowerCase() membuat huruf string menjadi kecil
//.toUpperCase() membuat huruf string menjadi besar

