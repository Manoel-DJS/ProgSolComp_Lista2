/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
3. Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.

**/
package Pratica2;
import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         // Entrada de Dados
         System.out.println("Digite um número(A): ");
         int numA = scanner.nextInt();
 
         System.out.println("Digite um número(B): ");
         int numB = scanner.nextInt();
 
         scanner.close(); // Fechando Scanner

         // Processamento
         if (numA % numB == 0 || numB % numA == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

    }
}
