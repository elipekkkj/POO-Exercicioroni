package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao7(){

        //7) Criar um algoritmo que leia dois números inteiros e imprima a seguinte saída:
        //Dividendo, Divisor, Quociente e Resto
        
        int a, b;
        double quociente, resto;
        
        System.out.println("Dividendo: ");
        Scanner leia = new Scanner(System.in);
        a = leia.nextInt();
        
        System.out.println("Divisor: ");
        b = leia.nextInt();

        quociente = a/b;
        resto = a%b;
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

    }
}
