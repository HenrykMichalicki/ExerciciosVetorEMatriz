package br.com.generation.matrizesevetor;

import java.util.Scanner;

/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. */

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int [] lancamento = new int [10];
			
			int i, contagem = 0; 
			double soma = 0.0, mediaAritmetica = 0.0, numerosMaiorPontuacao = 0.0;
			
			System.out.println("Digite 10 valores: ");
			
			for(i=0; i < lancamento.length; i++) {
				lancamento[i] = leia.nextInt();
				soma = lancamento[i] + soma;
				mediaAritmetica = soma / 10;
				
			 if (lancamento[i] > numerosMaiorPontuacao) {
				 numerosMaiorPontuacao = lancamento[i];
				 contagem = 0;
			 }
			 if (lancamento[i] == numerosMaiorPontuacao) {
				 contagem++;
			 
			}
	}
			System.out.println("O valor da média aritmética é: " + mediaAritmetica);
			System.out.println("O número de vezes que o maior número aparece é: " + contagem);
			
	}
}
