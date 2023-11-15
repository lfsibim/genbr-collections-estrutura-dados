package Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Set_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		Random randomNum = new Random();
		
		for(int x=0; x<10; x++) {
			numeros.add(randomNum.nextInt(20));
		}
		
		System.out.println("\nDigite 5 números de 0 até 20!");
		for(int x=0; x<5; x++) {
			System.out.printf("\n%sº número: ",(x+1));
			int num = input.nextInt();
			if(numeros.contains(num)) {
				System.out.printf("\nO número %s foi encontrado.\n",num);
			}else {
				System.out.printf("\nO número %s não foi encontrado.\n",num);
			}
		}
	}
}
