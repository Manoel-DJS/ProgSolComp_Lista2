/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
12. Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)

**/
package Pratica2;


public class Quest12 {
    public static void main(String[] args) {
        
        int c = 0;
        do{
            System.out.println(c);
            c+=2;
        }while(c % 7 != 0);
    }
}
