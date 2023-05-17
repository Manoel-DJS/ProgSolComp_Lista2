/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
14. Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50

**/
package Pratica2;

public class Quest14 {
    public static void main(String[] args) {
        int vetor[] = new int[50]; // tamanho do vetor

        for(int c = 0; c <= 50 -1; c++){ // preenchendo vetor
            vetor[c] = 0; 
        }

        for(int c = 0; c <= 50 -1; c++){ // Acessando e imprimindo os 0
            System.out.println("Vetor= na posição: " + c + " o valor é: " + vetor[c]);
        }
    }
}
