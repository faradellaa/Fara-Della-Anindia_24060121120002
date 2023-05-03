/**
 * Vehicle.java 03/05/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : Contoh polimorfisme inclusion
 *
 */

public class Vehicle{
	void calRent(int distance, float price){
		float fare=distance*price;
		System.out.println("vehicle price = "+fare);
	}
}