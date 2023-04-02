/**
 * File		: Asersi2.java 02/04/2023
 * Penulis	: Fara Della Anindia
 * Deskripsi	: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran
 *		  yang bernilai nol
 */

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0; 
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

//PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
//JAWAB: Pada program diatas terdapat assertion yang kurang tepat yaitu 
//            assert(jariJari>0):"jari-jari tidak boleh nol!!!";

//	 Saat assertions di enable maka ketika jari-jari yang diinputkan
//            tidak lebih besar dari 0, output assertionnya adalah jari-jari tidak boleh nol
//            padahal nilai yang bukan > 0 memiliki 2 kondisi yaitu = 0 dan < 0

//       Saat kondisi < 0 artinya jari-jari yang dimasukkan adalah angka negatif sehingga output assertion  
//            seharusnya bukan jari-jari tidak boleh nol tapi jari-jari tidak boleh negatif 
//            karena tidak mungkin lingkaran memiliki jari-jari yang negatif

//	 Untuk modifikasi sehingga program dapat mencakup 2 kondisi tersebut maka assertions dapat diperbaiki menjadi
//   	       assert(jariJari>0):"jari-jari tidak boleh kurang dari atau sama dengan nol!!!";     