/**
 * Programmer.java 03/05/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : Contoh polimorfisme inclusion
 *
 */

public class Programmer extends Pegawai{
	private int bonus = 450000;
	public Programmer(String nama){
		setNama(nama);
	}
	public void tampilData(){
		super.tampilData();
		System.out.printf("Bonus : %d\n",bonus);
	}	
}