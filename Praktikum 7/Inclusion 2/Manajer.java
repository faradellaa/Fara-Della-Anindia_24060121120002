/**
 * Manajer.java 03/05/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : Contoh polimorfisme inclusion
 *
 */

public class Manajer extends Pegawai{
	private int tunjangan = 700000;
	public Manajer(String nama){
		setNama(nama);
	}
	public void tampilData(){
		super.tampilData();
		System.out.printf("Tunjangan : %d\n",tunjangan);
	}	
}