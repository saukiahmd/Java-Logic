package Day5;

public class LatihanDay5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rizka";
		int softskill = 70;
		int hardskill = 70;
		String grade = "III";
		
		cetakDataPeserta(name, softskill, hardskill, grade);
		System.out.println("");
		cetakDataPeserta();
	}
	
	static void cetakDataPeserta(String name, int softskill, int hardskill, String grade) {
		System.out.println("Nama\t\t: " + name);
		System.out.println("Softskill\t: " + softskill);
		System.out.println("Hardskill\t: " + hardskill);
		System.out.println("Grade\t\t: " + grade);
	}
	
	static void cetakDataPeserta() {
		System.out.println("Nama\t\t: Ahmad Sauqi");
		System.out.println("Softskill\t: 70");
		System.out.println("Hardskill\t: 70");
		System.out.println("Grade\t\t: III");
	}

}
