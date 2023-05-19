/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
21. Escreva um programa que, dado um número positivo digitado
pelo o usuário mostre a tabuada de todos os números de 1 até o
número digitado. (utilize for)

**/

package Pratica2;
import java.util.Scanner;

public class Quest21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa Tabuada até o número pedido" + "\n");

        System.out.println("Digite um número positivo: ");
        int numeroT = scanner.nextInt();
        
        scanner.close();
        System.out.println("Tabuada do " + numeroT);
        for(int c = 1; c <= numeroT; c++){
            System.out.printf("%d x %d: %d \n" , numeroT,c,(numeroT*c));
        }

        
    }
}
