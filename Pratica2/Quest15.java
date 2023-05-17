/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
15. Faça um programa que preencha com zeros todas as posições
de uma matriz com 10 linha e 10 colunas

**/
package Pratica2;

public class Quest15 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10]; // Criando Matriz

        for(int l = 0;  l < 10 ; l++){ // Preenchendo Matriz
            for(int c = 0; c < 10 ; c++){
                matriz[l][c]=0;
            }
        }
        //
        for(int l = 0;  l < 10 ; l++){
            System.out.println("");
            for(int c = 0; c < 10 ; c++){
                System.out.println(" Posição da Linha: " + l + " || Posição da coluna: "+ c + " || O valor na Matriz é: " + matriz[l][c]); 
            }
        }
    
    }
    
}
