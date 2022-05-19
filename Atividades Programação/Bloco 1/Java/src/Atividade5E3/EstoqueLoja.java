package Atividade5E3;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	ArrayList<String> estoque = new ArrayList();
	
	int op;
	String produto;
	String att;
	
	do {
		System.out.println("\n\t\tMenu");
		System.out.println("\n1 - Adicionar produto no estoque");
		System.out.println("\n2 - Remover produto do estoque");
		System.out.println("\n3 - Atualizar estoque");
		System.out.println("\n4 - Exibir produtos do estoque");
		System.out.println("\n5 - Finalizar programa");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		switch (op) {
			case 1: // Adicionando produto
				produto = leia.nextLine();
				System.out.println("\nInforme o produto a ser adicionado no estoque: ");
				produto = leia.nextLine();
				estoque.add(produto);
				break;
			
			case 2: // Removendo produto
				produto = leia.nextLine();
				System.out.println("\nInforme qual produto deseja remover: ");
				produto = leia.nextLine();
				if (estoque.contains(produto)) {
					estoque.remove(produto);
					System.out.println("\n" + produto + " removido do estoque.");
				}
				else {
					System.out.println("\nNão existe este produto no estoque.");
				}
				break;
			case 3: // Atualizando estoque (Removendo e adicionando)
				produto = leia.nextLine();
				System.out.println("\nInforme quel produto deseja atualizar: ");
				produto = leia.nextLine();
				System.out.println("\nInforme o novo produto: ");
				att = leia.nextLine();
				if (estoque.contains(produto)) {
					estoque.remove(produto);
					estoque.add(att);
					System.out.println("\n" + produto + " removido do estoque, e adicionado " + att);
				}
				else {
					System.out.println("\nNão existe o produto informado no estoque.");
				}
				break;
			case 4: // Informando todo o estoque
				produto = leia.nextLine();
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
			case 5: // Encerrando
				System.out.println("\nFinalizando programa.");
				break;
			default:
				System.out.println("\nOpção inválida.");
		}
		
	} while (op != 5);
}
}
