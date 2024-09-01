package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio5 {
    public static void resolucao5(){

        //5) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra. Escreva um
        //algoritmo que leia o total de horas normais trabalhadas e o total de horas extras trabalhadas por um
        //empregado em um anoe calcule o salário anual deste trabalhador.
        
        
        int hora_normal;
        int hora_extra;
        double resultado;

        System.out.println("Digite o número de horas normais trbalhadas no ano: ");
        Scanner leia = new Scanner(System.in);
        hora_normal = leia.nextInt();

        System.out.println("Digite o número de horas extras trbalhadas no ano: ");
        hora_extra = leia.nextInt();

        resultado = (hora_normal*10) + (hora_extra*15);
        System.out.println("Seu salario anual é de: " + ("R$ " + resultado));
    }
}
