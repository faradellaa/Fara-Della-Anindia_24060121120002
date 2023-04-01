/**
 * MLingkaran2.java 02/04/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : implementasi cara menghitung luas lingkaran dengan input jejari custom dari pengguna
 *
 */

import java.util.Scanner;
public class MLingkaran2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jejari lingkaran : ");
		double jejari = scan.nextDouble();
		scan.close();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari "+jejari+" satuan adalah "+ l.hitungLuas());
	}
}