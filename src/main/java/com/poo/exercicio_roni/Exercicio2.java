package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio2 {
        public static void resolucao2(){

        //2) Leia um numero pelo teclado e imrpima o antecessor e o sucessor do numero digitado

		int numero; 

		System.out.print("Digite um número: ");
		Scanner leia= new Scanner(System.in);	
		numero = leia.nextInt();

		System.out.println("Antecessor: " + (numero - 1));
		System.out.println("Sucessor:" + (numero + 1));
    }
}
