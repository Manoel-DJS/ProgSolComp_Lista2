/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
6. Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo

**/

package Pratica2;
import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // Entrada de Dados
                System.out.println("Digite sua nota conceito(0 a 100): ");
                int nota = scanner.nextInt();
        
                scanner.close();
        
                // Condição
                if(nota >= 0 && nota <= 49){
                    System.out.println("Nota conceito: Insuficiente!");
                } else if( nota > 49 && nota <= 64){
                    System.out.println("Nota conceito: Regular!");
                } else if( nota > 64 && nota <= 84){
                    System.out.println("Nota conceito: BOM!");
                } else if( nota > 84 && nota <= 100){
                    System.out.println("Nota conceito: Ótimo!");
                }
    }
}
