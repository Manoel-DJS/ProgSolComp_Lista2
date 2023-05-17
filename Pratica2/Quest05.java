/**
 
Nome do Aluno: Manoel Vinicius Silva Souza
RA: 722315125
Data: 21 / 05 / 2023

Nome do Programa:
5. Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.

**/

package Pratica2;
import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite seu nome: "); 
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.println("Digite sua idade(anos): ");
        String idade = scanner.nextLine();

        System.out.println("De onde você é(naturalidade): ");
        String naturalidade = scanner.nextLine();

        System.out.println("Deseja visualizar os dados completos? ");
        String validar = scanner.nextLine();

        scanner.close();
        
        // Soluçando

        if(validar.equalsIgnoreCase("S")){
            System.out.println("Dados Completos: ");
            System.out.println("Nome Completo: " + nome + " " + sobrenome + " || Idade: " + idade + " || Nascido: " + naturalidade);
        } else if(validar.equalsIgnoreCase("N")){
            System.out.println("Seus dados: ");
            System.out.println("Nome: " + nome + " || idade: " + idade);
        } else{
            System.out.println("ERROR! caractere informado invalido! Digite apenas 'S' ou 'N'");
        }
    }    
}
