/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
16. Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0 (utilize
while)

**/

package Pratica2;
import java.util.Scanner;

public class Quest16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;

        while(numero >= 0){
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
        }

    }    
}
