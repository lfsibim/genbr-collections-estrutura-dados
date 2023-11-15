package Collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class List_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random random = new Random();
		
		for(int i=0; i<10; i++) {
			numeros.add(random.nextInt(25)); // gera números aleatórios até 25 e inclui na arraylist
		}
		
		for(int j=0; j<5; j++) {
			System.out.println("\nDigite um número de 1 até 25: ");
			int num = input.nextInt();
			if(numeros.contains(num)) {
				int indice = numeros.indexOf(num);
				System.out.printf("\nO número %s está localizado na posição: %s",num,indice);
			}else {
				System.out.printf("\nO número %s não foi encontrado.",num);
			}
		}
	}
}
