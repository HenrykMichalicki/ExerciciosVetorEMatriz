package br.com.generation.matrizesevetor;

import java.util.Scanner;

/* 1.	Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade
  e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] pontuacao = new int[5]; // [0] [1] [2] [3] [4] // inicia o vetor e determina a quantidade de posi��es. o nome vetor pode ser qualquer um, batata, arroz, 
		int maiorPontuacao = 0;
		int i;
		
		
		System.out.println("Digite os 5 valores: "); // determina o que precisa ser digitado pelo usu�rio
		// adiciona valores no vetor
		for(i = 0; i < pontuacao.length; i++) { // ou i <5 = i <pontuacao.length, ambos os processos fazem com que o sistema percorra as 5 posi��es/at� o final do vetor
			pontuacao[i] = entrada.nextInt(); //pega o numero digitado e coloca dentro do vetor em cada uma das posi��es
			
			if(pontuacao[i] > maiorPontuacao) { //  compara os n�meros digitados pelo usu�rio e determina qual � o maior deles. Faz isso em todas as posi��es do vetor
				maiorPontuacao = pontuacao[i];
			}
		}
		// coleta valores do vetor
		for(i = 0; i < pontuacao.length; i++) {
			System.out.println(pontuacao[i]);
			
		}
		System.out.println("A maior pontua��o �: " + maiorPontuacao); // imorime a maior pontuacao, dos 5 n�meros digitados
		
		
		}
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		