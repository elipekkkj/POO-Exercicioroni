package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio8 {
    public static void resolucao8(){
        
        double area;
        double preco;
        double largura, comprimento, metro_quadrado;

        System.out.println("Digite a largura do terreno: ");
        Scanner leia = new Scanner(System.in);
        largura = leia.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = leia.nextDouble();

        area = largura * comprimento;
        System.out.println("Digite o preço do metro quadrado: ");
        metro_quadrado = leia.nextDouble();

        preco = area * metro_quadrado;
        System.out.printf("A área é = " + "%.2f" , area);
        System.out.printf("\nO valor do metro quadrado é = " + "R$ " + "%.2f" , preco);
    }
}
