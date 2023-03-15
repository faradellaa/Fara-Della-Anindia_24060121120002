/**
 * File : BujurSangkar.java 15/03/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : representasi dari objek Bujur Sangkar, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;

	public BujurSangkar(double panjangSisi){
		this.panjangSisi=panjangSisi;
		this.jumlahSisi = 4;
	}

	public double hitungLuas(){
		return this.panjangSisi*this.panjangSisi;
	}
	
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}