/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
2. Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.

**/

package Pratica2;
import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            // Entrada de dados
        System.out.println("Digite um número(A): ");
        int a = scanner.nextInt();

        System.out.println("Digite um número(B): ");
        int b = scanner.nextInt();

        System.out.println("Digite um número(C): ");
        int c = scanner.nextInt();

        scanner.close();

        if (a <= b && a <= c) {
            System.out.println(a);
            if (b <= c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b <= a && b <= c) {
            System.out.println(b);
            if (a <= c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            if (a <= b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
