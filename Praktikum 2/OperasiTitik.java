/**
 * File		: OperasiTitik.java 01/03/2023
 * Penulis	: Fara Della Anindia
 * Deskripsi	: Kelas OperasiTitik
**/

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}

	private void refleksiSumbuY(Titik titik){
		titik.setAbsis(-titik.getAbsis());
	}

	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}

	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}