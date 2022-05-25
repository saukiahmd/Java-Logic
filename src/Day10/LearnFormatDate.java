package Day10;
import java.time.format.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LearnFormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// membuat object date
		LocalDate myDate = LocalDate.now();
		LocalDateTime myDt = LocalDateTime.now();
		
		// membuat object formating
		DateTimeFormatter formatDate1 = DateTimeFormatter.ofPattern("dd MMMM YYYY");
		
		DateTimeFormatter formatDt1 = DateTimeFormatter.ofPattern("dd MMMM YYYY HH:mm:ss");
		
		
		// proses merubah data ke format
		String strDate = myDate.format(formatDate1);
		String strDt = myDt.format(formatDt1);
		
		// cetak 
		System.out.println(strDate);
		System.out.println(strDt);
		
		
	}

}
