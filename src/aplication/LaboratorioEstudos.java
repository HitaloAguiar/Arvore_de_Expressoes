package aplication;

import tree.TreeTins;

public class LaboratorioEstudos {

	public static void main(String[] args) {
		
		// primeira expressão
		// 5 + 2 * 3
		
		TreeTins primeiraExpressao = new TreeTins();
		
		primeiraExpressao.add('+');
		primeiraExpressao.add('*');
		primeiraExpressao.add('5');
		primeiraExpressao.add('2');
		primeiraExpressao.add('3');
		
		System.out.println("Resolução da expressão número 1: " + primeiraExpressao.resolverExpressao());
		
		// segunda expressão
		// 5 + 2 * 3 - 4
		
		TreeTins segundaExpressao = new TreeTins();
		
		segundaExpressao.add('+');
		segundaExpressao.add('-');
		segundaExpressao.add('5');
		segundaExpressao.add('*');
		segundaExpressao.add('4');
		segundaExpressao.add('2');
		segundaExpressao.add('3');
		
		System.out.println("Resolução da expressão número 2: " + segundaExpressao.resolverExpressao());
		
		// terceira expressão
		// (5 + 2 * 3 - 4) / 7
		
		TreeTins terceiraExpressao = new TreeTins();
		 
		terceiraExpressao.add('/');
		terceiraExpressao.add('+');
		terceiraExpressao.add('7');
		terceiraExpressao.add('-');
		terceiraExpressao.add('5');
		terceiraExpressao.add('*');
		terceiraExpressao.add('4');
		terceiraExpressao.add('2');
		terceiraExpressao.add('3');
		
//		tree.inOrder();
		
		System.out.println("Resolução da expressão número 3: " + terceiraExpressao.resolverExpressao());
	}

}
