package Collections;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int op;
		
		do {
			//criar menu
			System.out.println("\n************************************************");
			System.out.println("\n\t Pilha de Livros");
			System.out.println("\n\t1 - Adicionar Livro na pilha");
			System.out.println("\t2 - Listar todos os Livros");
			System.out.println("\t3 - Retirar Livro da pilha");
			System.out.println("\t0 - Sair");
			System.out.println("\n************************************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = input.nextInt();
			
			//crud com a opção desejada
			switch(op) {
			case 1:
				input.nextLine(); //limpar cache
				System.out.println("\nNome do Livro: ");
				String livro = input.nextLine();
				livros.add(livro);
				System.out.println("\nLivro adicionado!");
				System.out.println("\nPilha atualizada: "+livros);
				break;
			case 2:
				input.nextLine();
				if(livros.isEmpty()) {
					System.out.println("\nA Pilha de Livros está vazia.");
				}else {
					System.out.println("\nLista de Livros na Pilha: "+livros);
				}
				break;
			case 3:
				if(livros.isEmpty()) {
					System.out.println("\nA Pilha de Livros está vazia!");
				}else {
					System.out.println("\nO Livro '"+livros.pop()+"' foi retirado da Pilha!");
					System.out.println("\nPilha atualizada: "+livros);
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
				default:
					System.out.println("\nOpção inválida.");
			}
		}while(op >= 1 || op <= 3);
	}
}
