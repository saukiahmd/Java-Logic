package Day10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Scanner;

public class LatihanDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*	Latihan Datetime
		 	=> Tanggal libur : 3 Maret
		 	
		 	=> Tanggal Pesan barang : 2 Maret
		 	
		 	=> Durasi pengiriman : 5 hari
		 	
		 	di tanggal berapakah paket tiba?
		 	
		 	note : 
		 	- jika tanggal merah tidak dihitung!
		 */
		LocalDate libur = LocalDate.of(2022, 3, 3);
		LocalDate mulaiPesan = LocalDate.of(2022, 3, 2);
		LocalDate estimasiSampai = mulaiPesan;
		int estimasiHari = 5;
		
		for (int i = 1; i <= estimasiHari;) {
			estimasiSampai = estimasiSampai.plusDays(1);
			if (!estimasiSampai.equals(libur)) {
				System.out.println(estimasiSampai);
				i++;
			}
	
	}

}
}