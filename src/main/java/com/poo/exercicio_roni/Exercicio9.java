package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio9 {
    public static void resolucao9(){

        double km;
        double combustivel, consumo_medio;

        System.out.println("Digite a distância percorrida em km: ");
        Scanner leia = new Scanner(System.in);
        km = leia.nextDouble();

        System.out.println("Digite o total gasto em combustivel: ");
        combustivel = leia.nextDouble();

        consumo_medio = km/combustivel;
        System.out.printf("O consumo médio por km foi de: " + "%.2f" , consumo_medio);

    }
}
