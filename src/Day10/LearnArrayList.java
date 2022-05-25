package Day10;
import java.util.*;


public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// membuat object array list
		ArrayList<String> cars = new ArrayList<String>();
		
		// isi data ke array list
		cars.add("Honda");
		cars.add(0, "Toyota");
		
		System.out.println(cars);
		
		// merubah isi array list
		cars.set(1, "Suzuki");
		
		// cetak array list
		System.out.println(cars);
		
		// menghapus data array list
		cars.remove(0);
		cars.remove("Suzuki");
		
		System.out.println(cars);
		
	}

}
