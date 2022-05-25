package Day5;

public class LearnMethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// memanggil method return value + dicetak
				System.out.println(hitungNilai());
				
				// memanggil method return value, ditampung ke variable lalu dicetak
				int nilai = hitungNilai();
				System.out.println(nilai);
				
				int a = 4 + 2; // 6
				int[] b = {4, 2}; // benar
				
				
				System.out.println("Nama anda adalah " + namaDepan()); // manggil method
				
				// memanggil method return value dan ditampungke variable lalu dicetak
				String namaDepan = namaDepan();
				String namaBelakang = namaBelakang();
				System.out.println("Nama lengkap anda adalah " + namaDepan + " " + namaBelakang); // manggil variable
				
				
				// soal no.6
				// ada data dengan nama peserta "Priscilia Lovita"
				// buat method return values String[] dengan parameter String
				// index ke 0 : "Priscilia"
				// index ke 1 : "Lovita"
				
				// soal no.7
				// ada data dengan NIK "09129"
				// buat method return values int[] dengan parameter String
				// index ke 0 : 0
				// index ke 1 : 9
				// index ke 2 : 1
				// index ke 3 : 2
				// index ke 4 : 9
			}
			
			// membuat method return value untuk melakukan penjumlahan
			static int hitungNilai() {
				return 4+2; //6
			}
			
			static String namaDepan() {
				return "Ardhi";
			}
			
			static String namaBelakang() {
				return "Muttaqin";
			}
			
			static String namaTengah() {
				return 80;
			}
}
