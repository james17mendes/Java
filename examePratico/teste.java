package examePratico;

import java.util.*;
import java.io.*;

public class teste {

	public static void main(String[] args) {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileReader("companhias.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("\nErro ao abrir o ficheiro!");
		}
		
		String firstString = sc.nextLine();
		
		while(sc.hasNextLine()) {
			String[] linha = sc.nextLine().split("\t");
			
			for(String s : linha) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
	}

}
