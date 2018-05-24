package examePratico;

import java.util.*;
import java.io.*;

public class POO15AP {

	public static void main(String[] args) {
		POO15AP ap = new POO15AP();
		ap.alinea1();
		ap.alinea2();
		ap.alinea3();
	}

	public void alinea1() {
		System.out.println("\nA1)");
		LojaAlimentar lZe = new LojaAlimentar("Loja do Zé", "Rua Domingos Carrancho, 15, 3800-145 Aveiro");
		Lacteo lact1 = new Lacteo("Iogurte Natural Danone", 1.48, 56, "07.06.2015");

		// nome, preço, calorias, validade
		lact1.setGordura(4.0);
		lact1.setTemp(4, 6); // temperaturas mínima e máxima
		lZe.add(lact1);
		lZe.add(new Lacteo("Leite UHT Meio Gordo Mimosa", 0.64, 46, "20.06.2015", 1.7));

		// o último valor é a gordura
		Cereal c1 = new Cereal("Nestlé Fitness", 1.59, 200, "15.09.2015");
		c1.setComp(TIPO_CEREAL.ARROZ_TRIGO);
		lZe.add(c1);
		lZe.add(new Refrigerante("Cola Cola", 1.12, 300, "15.09.2015"));
		System.out.println(lZe); // imprime todos os produtos da loja
		try {
			PrintWriter fl = new PrintWriter(new File("output3.txt"));
			fl.println(lZe);
			fl.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void alinea2() {

		System.out.println("\nA2)\n");

		LojaAlimentar la = new LojaAlimentar("Tiago", "Bairro de Santiago, Aveiro");

		Lacteo lact1 = new Lacteo("Iogurte Natural Danone", 1.48, 56, "07.06.2015");

		// nome, preço, calorias, validade
		lact1.setGordura(4.0);
		lact1.setTemp(4, 6); // temperaturas mínima e máxima
		la.add(lact1);
		la.add(new Lacteo("Leite UHT Meio Gordo Mimosa", 0.64, 46, "20.06.2015", 1.7));

		// o último valor é a gordura
		Cereal c1 = new Cereal("Nestlé Fitness", 1.59, 200, "15.09.2015");
		c1.setComp(TIPO_CEREAL.ARROZ_TRIGO);
		la.add(c1);
		la.add(new Refrigerante("Cola Cola", 1.12, 300, "15.09.2015"));
		
		for(Alimento a : la.getAlimentos()) {
			if(a instanceof Frigorifico) {
				System.out.println(a);
			}
		}
	}
	
	public void alinea3() {
		
		Scanner file = null;
		
		try {
			file = new Scanner(new FileReader("alimentos.txt"));
		} catch(FileNotFoundException e) {
			System.out.println("\nErro ao abrir o ficheiro!");
		}
		
		String firstLine = file.nextLine();
		
		System.out.printf("%-10s%-20s%-10s%-10s%-10s%-10s", "Tipo","Nome","Preco","Calorias","Data","Gordura");
		
		while(file.hasNextLine()) {
			
			String[] linha = file.nextLine().split("\t");
			
			String tipo = linha[0];
			String nome = linha[1];
			double preco = Double.parseDouble(linha[2]);
			int calorias = Integer.parseInt(linha[3]);
			String data = linha[4];
			double gordura = 0.0;
			if(linha[5] != null) {
				gordura = Double.parseDouble(linha[5]);
			}
			
		}
		
	}
	

}
