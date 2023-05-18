/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
18. Faça um programa que determine o fatorial de um número.
Para este problema, tem-se como entrada o valor do número do
qual se deseja calcular o fatorial. O fatorial de 0 é igual a
1. O fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
N! = 1 * 2 * 3 * 4 * ... * (N-1) * N

**/

package Pratica2;
import java.util.Scanner;

public class Quest18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa Fatorial");
        System.out.println("Determine o número do fatorial: ");
        int num = scanner.nextInt();
        
        int fatorial = 1;
        for(int c = 1;c <= num;c++){
            fatorial *= c;
            System.out.println(fatorial);
        }

        scanner.close();

        System.out.println("\n" + "O valor do fatorial é: " + fatorial);
    }
}
