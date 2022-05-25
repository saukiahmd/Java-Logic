package Day4;

import java.util.Iterator;

public class LearnLoopForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrayPeserta = {"Antok", "Arya", "Ardhi"};
		
		System.out.println("Daftar peserta : (foreach) ");
		for(String peserta : arrayPeserta) {
			System.out.println(peserta + " ");
		}
		
		System.out.println("\nDaftar peserta Batch 283 QA : (for)");
		for (int i = 0; i < arrayPeserta.length; i++) {
			// cara ke-1
			// langsung cetak data array
			System.out.println("index ke " + i + " : " +  arrayPeserta[i]);
			
			// cara ke-2
			// tamping terlebih dahulu ke variable
			String peserta = arrayPeserta[i];
			System.out.println("Nama : " + peserta);
		}
	}

}
