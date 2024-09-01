package com.poo.exercicio_roni;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao6(){

     //6) Escreva um programa que leia a temperatura em Celsius e retorne o valor em Fahrenheit.

     int celcius;
     double fahrenheit;

     System.out.println("Digite a temperatura em grau Celcius: ");
     Scanner leia = new Scanner(System.in);
     celcius = leia.nextInt();

     fahrenheit = (celcius * 1.8) + 32;
     System.out.println((+ celcius + " graus Celcius") + " equivalem a " + ( + fahrenheit + " graus Fahreinheit."));


    }
}
