import java.io.IOException;

/**
 * File		: ExceptionOnArray1.java 02/04/2023
 * Penulis	: Fara Della Anindia
 * Deskripsi	: Program penggunaan eksepsi menggunakan class library Java
 *
 */

public class ExceptionOnArray1{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			//arrayInteger[4] = 10;
			throw new IOException();
		}catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		}catch(IOException exception){
			System.out.println("IOException caught");
		}finally{
			System.out.println("clean up code...");
		}
	}
}
