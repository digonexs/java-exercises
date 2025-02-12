import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
/*  1. Cadastro de Usuário (Variáveis, Tipagem de Dados, Scanner)
    Crie um programa que solicite ao usuário seu nome, idade e altura. Em seguida, exiba os valores informados.

    Exemplo de Entrada:
    Nome: João
    Idade: 25
    Altura: 1.75

    Saída Esperada:
    Nome: João
    Idade: 25 anos
    Altura: 1.75m
 */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        byte idade = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Seu nome é " + nome + ", você tem " + idade + " anos de idade e possui " + altura +"m de altura.");

        scanner.close();
    }
}
