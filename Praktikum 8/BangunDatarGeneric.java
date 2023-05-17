/**
 * File : BangunDatarGeneric.java 17/05/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T extends BangunDatar>{
//public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T bangunDatar;
	//private T1 bangunDatar;

	public void set(T tipeBangunDatar){
	//public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}	
	
	public T get(){
	//public T1 get(){
		return bangunDatar;
	}

	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}


//saat T diganti T1, T2, ataupun yang lain tetap tidak masalah, tidak ada yang berubah
//karena itu hanya penamaan dan T adalah standarisasi penamaannya