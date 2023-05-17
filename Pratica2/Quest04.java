/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
4. Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.

**/

package Pratica2;
import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        scanner.close();
        
        // Condição
        if(numero < 0){
            System.out.println("O Número digitado é negativo");
        } else{
            System.out.println("O Número digitado é positivo");
        }

        if(numero % 2 == 0){
            System.out.println("Número é par.");
        } else{
            System.out.println("É ímpar");
        }

        
    }
}
