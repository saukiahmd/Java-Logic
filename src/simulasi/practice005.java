package simulasi;
import java.util.*;

public class practice005 {
	/*
	 	input ke 1 : 1 1 3 5 7
		input ke 2 : 2 2 4 6 8
		input ke 3 : 1 1 1 1 1
		output     : 4 4 8 12 16
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input 1 : ");
		String[] data1 = input.nextLine().split(" ");
		
		System.out.print("input 2 : ");
		String[] data2 = input.nextLine().split(" ");
		
		System.out.print("input 3 : ");
		String[] data3 = input.nextLine().split(" ");
		
		System.out.print("output\t: ");
		for (int i = 0; i < data1.length; i++) {
			System.out.print(Integer.parseInt(data1[i])
					+Integer.parseInt(data2[i])
					+Integer.parseInt(data3[i]) 
					+ " ");
		}
	}
	

}
