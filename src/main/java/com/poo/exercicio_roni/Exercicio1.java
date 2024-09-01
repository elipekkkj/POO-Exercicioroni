package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio1 {
        public static void resolucao(){

         // 1) Leia dois valores pelo teclado e imprima a soma
		
		int n1, n2; 	// variavel inteiro n1, n2
		
		System.out.print("Digite o primeiro número: "); 		// Escreva ()
		Scanner scannerLeia = new Scanner(System.in); 			//Aqui cria a scanner (CLasse Objeto)
		n1 = scannerLeia.nextInt(); 							//Aqui é o "leia ()"
	
		System.out.print("O primeiro número é: " + n1 + "\n"); 	
		
		System.out.println("Digite o segundo número: ");
		n2 = scannerLeia.nextInt();

		System.out.println("O segundo número é: " + n2);

		System.out.println("A soma é: " + (n1+n2));
   
    }
}
