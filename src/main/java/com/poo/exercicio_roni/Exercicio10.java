package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio10 {
    public static void resolucao10(){

        int tempo_segundos, horas;
        int minutos, segundos;
        
        
        System.out.println("Digite o tempo em segundos: ");
        Scanner leia = new Scanner(System.in);
        tempo_segundos = leia.nextInt();

        horas = tempo_segundos / 3600;
        minutos = (tempo_segundos % 3600) / 60;
        segundos = tempo_segundos % 60;

        System.out.println("Horas:" + horas + ":" + minutos + ":" + segundos);

    }
}
