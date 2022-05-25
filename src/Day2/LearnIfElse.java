package Day2;

public class LearnIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String warnaBalon = "hijau";
		if(true) {
			System.out.println(warnaBalon);
		}
		
		if(false) {
			System.out.println(warnaBalon);
		}
		
		warnaBalon = "HIJAU";
		if (warnaBalon.equals("HIJAU")) {
			System.out.println("warna balon adalah hijau");
		}else if (warnaBalon.equals("Merah")){
			System.out.println("warna balon adalah merah");
		}else if (warnaBalon.endsWith("Biru")) {
			System.out.println("warna balon adalah biru");
		}
		
		int a = 10;
		int b = 10;
		
		if (a == b) {
			System.out.println("a lebih besar dari b");
		}
		
	}

}
