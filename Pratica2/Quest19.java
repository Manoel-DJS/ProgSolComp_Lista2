/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
19. Um determinado gás duplica seu volume a cada segundo.
Dada um volume inicial, em centímetros cúbicos, digitado pelo
usuário faça um programa que determine o tempo necessário para
que esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)

**/

package Pratica2;
import java.util.Scanner;

public class Quest19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double volumeini = scanner.nextDouble();
        double volumefinal = 1000;
        int segundos = 0;
        while(volumeini < volumefinal){
            volumeini = volumeini * 2;
            segundos += 1;
            System.out.println("Volume atual: " + volumeini);
        }
        scanner.close();
        
        System.out.print("O tempo necessário para o gás ultrapassar 1000 centímetros cúbicos é de " + (segundos) + " segundos");
        
    }
}
