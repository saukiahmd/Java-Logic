package Practice_007;

import java.util.Arrays;
import java.util.Scanner;

public class exam006 {
	/*
	 	Soal No. 6  — String  Strong Password													
														
		Angka						= "0123456789"							
		Alphabet kecil				= "abcdefghijklmnopqrstuvwxyz"							
		Alphabet besar				= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"							
		Spesial karakter			= "~!@#$%^&*()_+"							
															
		Contoh Input													
		3													
		Ab1													
															
		Contoh Output													
		3													

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan length\t: ");
		int length = Integer.parseInt(input.nextLine());
		
		System.out.print("Masukan Password\t: ");
		char [] arrayPwd = input.nextLine().toCharArray();
		
		// mengecek nilai length dari password
		if (length != arrayPwd.length) {
			System.err.println("Panjang data tidak sesuai dengan length !");
		}else {
			int isNumb = 0, 
				isUpper = 0, 
				isLower = 0, 
				isCharacter = 0;
			
			char [] arraySpesialChar = "~!@#$%^&*()_+".toCharArray();
			
			for (int i = 0; i < arrayPwd.length; i++) {
				int temp = i;
				if (arrayPwd[i] >= '0' && arrayPwd[i] <= '9') {
					isNumb = 1;
				}else if (arrayPwd[i] >= 'a' && arrayPwd[i] <= 'z') {
					isLower = 1;
				}else if (arrayPwd[i] >= 'A' && arrayPwd[i] <= 'Z') {
					isUpper = 1;
//				}else if (Arrays.stream(arraySpesialChar).anyMatch(o -> o == arrayPwd[temp])) {
//					isCharacter = 1;
//				}
				}else {
					for (char c : arraySpesialChar) {
						if (c == arrayPwd[i]) {
							isCharacter = 1;
						}
					}
				}
			}
			System.out.println(isNumb + isLower + isUpper + isCharacter);
		}
		
 	}

}
