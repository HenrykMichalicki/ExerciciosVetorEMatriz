package br.com.generation.matrizesevetor;

import java.util.Scanner;

public class ExercicioExtra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][]pontuacao = new int[2][2]; // [0] [1] [2] [3] [4] 
		int maiorPontuacao = 0;
		// int i;
		
		System.out.println("Digite os 4 valores: "); 
		// adiciona valores no vetor
		for(int linha = 0; linha < pontuacao.length; linha++) { 
			for(int coluna = 0; coluna < pontuacao[linha].length; coluna++) {
			pontuacao[linha][coluna] = entrada.nextInt();
			
			if(pontuacao[linha][coluna] > maiorPontuacao) { 
				maiorPontuacao = pontuacao[linha][coluna];
			}
		}
	}

		for(int linha = 0; linha < pontuacao.length; linha++) { 
			for(int coluna = 0; coluna < pontuacao[linha].length; coluna++) {
			System.out.println(pontuacao[linha][coluna]);
				
			}
		}
		System.out.println("A maior pontuação é: " + maiorPontuacao);
		entrada.close();
	}

}
