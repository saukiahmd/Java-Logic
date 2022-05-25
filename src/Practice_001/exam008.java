package Practice_001;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class exam008 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		/*
		 * 																												
			Soal No. 8																											
																														
			======== Form Pendaftaran ========																											
			Nama			:	Dani Ramdani							tipe data string, panjang karakter max. 20																
			Email			:	danixxxx@zzz.com							tipe data string, wajib ada @ dan .																
			No. Tlpon		:	08131241233							tipe data decimal, nomor depan hanya boleh 0 dan 62, panjang karakter min. 7 dan max. 13																
			Tgl.Lahir		:	20 januari 2000							tipe data date																
			No. Identitas	:	54123151231141							tipe data string, panjang karakter min. 10 dan max. 13																
																														

		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("masukkan nama\t\t:"); 
		String nama = input.nextLine(); //inputan untuk nama
		
		System.out.print("masukkan email\t\t:"); 
		String email = input.nextLine(); //inputan untuk email
		
		System.out.print("masukkan no.telp\t:"); 
		String telp = input.nextLine(); //inputan untuk nomer telp
		
		System.out.print("masukkan tgl.lahir\t\t:"); 
		String tglLahir = input.nextLine(); //inputan untuk tanggal lahir
		
		System.out.print("masukkan no identitas\t\t:"); 
		String noIdentitas = input.nextLine(); //inputan untuk nomer identitas
		
		
		input.close();
		
		
		
		String[] bulan = {"Januari","Februari","Maret",
				 "April","Mei","Juni","Juli",
				 "Agustus","September","Oktober",
				 "November","Desember"};

		
		SimpleDateFormat ft = new SimpleDateFormat("dd MM yyyy");
		Date date = ft.parse(tglLahir);
		
		String result = date.getDate() + bulan[date.getMonth()] + (date.getYear() + 1900);
		
		
		System.out.println("======== Form Pendaftaran ========");
		
		if(nama.length() <= 20) {
			System.out.println("Nama\t\t:" + nama);
		}else {
			System.out.println("Nama\t\t:" + "panjang karakter maksimal 20");
		}
		
		//	check karakter @ dan .
		if((email.indexOf("@") != -1) && (email.indexOf(".") != -1)) {
			System.out.println("Email\t\t:" + email);
		}else {
			System.out.println("Email\t\t:" +  "karakter wajib ada @ dan .");
		}
		// check angka 0 dan 62
		if((telp.indexOf("0") != -1) || (telp.indexOf("62") != -1)) {
			System.out.println("No Telp\t\t:" + telp);
		}else {
			System.out.println("No Telp\t\t:" + "karakter pertama hanya boleh 0 dan 62");
		}
		
		System.out.println("Tgl.Lahir\t:" + result);
		
		if (noIdentitas.length() >= 10 && noIdentitas.length() <= 10 ) {
			System.out.println("No. Identitas\t:" + noIdentitas);
		}else {
			System.out.println("No. Identitas\t:" + "panjang karakter minimal 10 dan maksimal 13");
		}
	

	}

}
