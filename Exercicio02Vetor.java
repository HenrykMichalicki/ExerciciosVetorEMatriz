package br.com.generation.matrizesevetor;

import java.util.Scanner;

/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o. */

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
			System.out.println("O valor da m�dia aritm�tica �: " + mediaAritmetica);
			System.out.println("O n�mero de vezes que o maior n�mero aparece �: " + contagem);
			
	}
}
