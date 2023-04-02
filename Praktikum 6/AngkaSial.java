/**
 * File		: AngkaSial.java 02/04/2023
 * Penulis	: Fara Della Anindia
 * Deskripsi	: Program penggunaan exception buatan sendiri
 *		  Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

//PERTANYAAN 1 : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//JAWABAN : Jika eksepsi terjadi maka baris yang berisi System.out.println(angka+" bukan angka sial") tidak akan dieksekusi
//          dan program akan langsung menuju blok catch karena AngkaSialException dilempar ke kelas exception

//PERTANYAAN 2 : Apakah baris 21 (catch(AngkaSialException ase)) pada AngkaSial.java di atas dieksekusi?
//JAWABAN : Baris catch(AngkaSialException ase) pada program diatas dieksekusi karena terdapat as.cobaAngka(13) pada blok try,
//          jika angka adalah 13 maka objek AngkaSialException dilempar oleh metode cobaAngka dan masuk ke blok catch(AngkaSialException ase)
     