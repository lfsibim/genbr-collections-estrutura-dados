package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		//
		System.out.println("Digite 10 números inteiros não repetidos.");
		for(int i=1; i<=10; i++) {
			System.out.println("\n"+i+"º número: ");
			int num = input.nextInt();
			numeros.add(num);
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		System.out.println("\nListar dados: \n");
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}