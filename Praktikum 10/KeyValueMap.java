/**
 * File : KeyValueMap.java 06/06/2023
 * Penulis : Fara Della Anindia
 * Deskripsi : program yang digunakan untuk menampilkan key dan value dari sebuah Map, 
 *	       dimana key merupakan NIM dan value merupakan nama mahasiswa, menggunakan ekspresi 
 *	       lambda
 */

import java.util.*;
public class KeyValueMap{
	public static void main(String[] args){
		Map<String, String> mahasiswa = new HashMap<>();
		mahasiswa.put("24060121120002", "Fara Della Anindia");
		mahasiswa.put("12345678890009", "Jennie Ruby Jane");
		mahasiswa.put("98765439921118", "Roseanne Park");
		mahasiswa.forEach((nim, nama)-> System.out.println("NIM: " + nim + ", Nama Mahasiswa: "+nama));

	}
}