package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio3 {
        public static void resolucao3(){
        
            //3) Construa um algoritmo que leia o nome de um aluno, disciplina, 
           // quatro notas e exiba na tela a média

		String nome;
		String disciplina;
		double a, b, c, d, media;
		
		System.out.println("Qual seu nome? ");
		Scanner scannerLeia = new Scanner(System.in);
		nome = scannerLeia.nextLine();
		
		System.out.println("Qual a disciplina? ");
		disciplina = scannerLeia.nextLine();

		System.out.println("Digite a primeira nota: ");
		a = scannerLeia.nextDouble();

		System.out.println("Digite a segunda nota: ");
		b = scannerLeia.nextDouble();	

		System.out.println("Digite a terceira nota: ");
		c = scannerLeia.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		d = scannerLeia.nextDouble();
		
		media = ((+ a+b+c+d)/4);
        System.out.printf("A média delas são: " + "%.1f" , media);
		
        }
}
