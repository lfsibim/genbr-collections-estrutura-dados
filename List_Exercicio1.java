package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int x=1; x<=5; x++) {
			System.out.println("\nDigite a "+x+"ª cor: ");
			String cor = input.nextLine();
			cores.add(cor);			
		}
		
		System.out.println("\nLista de cores: "+cores);
		
		Collections.sort(cores);
		System.out.println("\nCores ordenadas: "+cores);
	}
}