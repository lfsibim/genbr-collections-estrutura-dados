package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int op;
		
		do {
			//criar o menu
			System.out.println("\n************************************************");
			System.out.println("\n\t  Menu Gerenciamento de Fila");
			System.out.println("\n\t1 - Adicionar Cliente na Fila");
			System.out.println("\t2 - Listar todos os Clientes");
			System.out.println("\t3 - Retirar Cliente da Fila");
			System.out.println("\t0 - Sair");
			System.out.println("\n************************************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = input.nextInt();
			
			//crud de acordo com a opção desejada
			switch(op) {
			case 1:
				input.nextLine(); //limpar cache
				System.out.println("\nDigite o nome do cliente: ");
				String nome = input.nextLine();
				if(nome.isEmpty()) {
					System.out.println("\nO cliente não foi adicionado na fila, você não digitou o nome.");
				}
				fila.add(nome);
				System.out.println("\nCliente adicionado!");
				System.out.println("\nFila atualizada: "+fila);
				break;
			case 2:
				input.nextLine();
				System.out.println("\nLista de clientes na fila: ");
				for(Iterator<String> iFila = fila.iterator();iFila.hasNext();) {
					System.out.println(iFila.next());
				}
				break;
			case 3:
				input.nextLine();
				if(fila.isEmpty()) {
					System.out.println("\nA fila está vazia!");
				}else {
					System.out.printf("\nO cliente %s foi chamado!",fila.poll());
					System.out.println("\nFila atualizada: "+fila);
				}
				break;
			case 0:
				System.out.println("\nEncerrando sistema de filas...");
				System.out.println("\nPrograma finalizado!");
				break;
				default:
					System.out.println("\nOpção inválida.");	
			}
		}while(op >= 1 || op <= 3);
	}
}
