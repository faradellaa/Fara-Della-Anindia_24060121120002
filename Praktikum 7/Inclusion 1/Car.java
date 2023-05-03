/**
 * Car.java 03/05/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : Contoh polimorfisme inclusion
 *
 */

public class Car extends Vehicle{
	void calRent(int jarak, float harga){
		float fare=jarak*harga;
		fare=fare-100.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}