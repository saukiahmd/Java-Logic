package Day10;
import java.time.*; // 01. import
import java.time.temporal.ChronoUnit;

public class LearnDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 02. membuat object date
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		// membuat object time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		// format date
		LocalDate myDate2 = LocalDate.of(2022, 3, 15);
		System.out.println(myDate2);
		
		// hitung jumlah hari yang sudah ditempuh selama bootcamp
		LocalDate startBootcamp = LocalDate .of(2022, 2, 25);
		System.out.println(ChronoUnit.DAYS.between(startBootcamp, myDate));
		
		// hitung berapa lama kegiatan belajar di hari ini
		// masuk di jam 08.30
		// pulang di jam 17.30
		LocalTime jamMasuk = LocalTime.of(8, 40);
		LocalTime jamPulang = LocalTime.of(17, 30);
		
		long jamKerja = ChronoUnit.HOURS.between(jamMasuk, jamPulang);
		long menitKerja = ChronoUnit.MINUTES.between(jamMasuk, jamPulang);
		
		System.out.println((jamKerja) + ":" + (menitKerja - jamKerja * 60));
		
		System.out.println("pakai method : " + getTotalWork(jamMasuk, jamPulang));
		
		// LocalDateTime
		LocalDateTime myDt = LocalDateTime.now();
		System.out.println(myDt);
		
		LocalDateTime myDt2 = LocalDateTime.of(2022, 3, 15, 8, 30);

		// mendapatkan selisih hari
		long hari = ChronoUnit.DAYS.between(myDt2, myDt);
		long jam = ChronoUnit.HOURS.between(myDt2, myDt);
		long selisihJam = jam - (hari * 24);
		System.out.println("selisih hari : " + hari);
		
		// mendapatkank selisih jam
		System.out.println("Selisih Jam : " + jam);
		
		System.out.println("selisih jam dan hari : " + hari + "hari" + selisihJam + "jam");
		System.out.println("Selisih Jam dan Hari : %d hari % jam" + hari + jam);
	}
	
	public static String getTotalWork(LocalTime start, LocalTime end) {
		long jamKerja = ChronoUnit.HOURS.between(start, end);
		long menitKerja = ChronoUnit.MINUTES.between(start, end);
		long selisihMenit = menitKerja - jamKerja * 60;
		
		return jamKerja + ":" + selisihMenit;
	}
	
}
