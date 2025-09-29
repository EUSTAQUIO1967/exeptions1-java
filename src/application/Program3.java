package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		File file = new File("/home/gabi/Documentos/dados_viaturas.txt");
		
		Locale.setDefault(Locale.US);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		

		
	}

}
