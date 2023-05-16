/** 

Faça um programa que leia dois números A e B e imprima o maior
deles.

**/

package Pratica2;
import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite um número(A): ");
        int numA = scanner.nextInt();

        System.out.println("Digite um número(B): ");
        int numB = scanner.nextInt();

        scanner.close(); // Fechando Scanner

        int maior = 0;
        String valor = "";

        // Processamento
        if(numA > numB){
            maior = numA;
            valor = "A";

        } else if(numB > numA){
            maior = numB;
            valor = "B";
        }

        // Saída
        System.out.println("\n" + "O Maior número é...");
        System.out.printf("Valor %s: %d", valor, maior);

    }
}
