/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
17. Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)

**/
package Pratica2;


public class Quest17 {
    public static void main(String[] args) {
        
        int c = -7;
        do{
            System.out.println(c);
            c-=7;
        }while(c > -1000);
        
    }
}
