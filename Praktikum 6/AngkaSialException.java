/**
 * File		: AngkaSialException.java 02/04/2023
 * Penulis	: Fara Della Anindia
 * Deskripsi	: Eksepsi buatan sendiri, menolak masukkan angka 13!
 *
 */

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");
	}
}