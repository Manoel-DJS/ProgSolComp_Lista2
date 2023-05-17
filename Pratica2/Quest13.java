/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
13. Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma (utilize while).

**/

package Pratica2;

public class Quest13 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        
        while(i <= 100){
            soma += i;
            i++;
        }

        System.out.println("O valor total da soma é: " + soma);
    }
}
