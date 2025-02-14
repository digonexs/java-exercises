import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){

    /*
        2. Conversão de Tipos (Tipagem de Dados, Dados Primitivos e Não Primitivos)
        Solicite um número decimal ao usuário e exiba:

        O número como um int
        O número como um double
        O número como uma String

        Exemplo de entrada:
        Digite um número: 5.7

        Saída esperada:
        Número como int: 5
        Número como double: 5.7
        Número como String: "5.7"
    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        int numeroInteiro = (int) numeroDecimal;
        System.out.println("Número como int: " + numeroInteiro);

        System.out.println("Número como double: " + numeroDecimal);

        String numeroString = Double.toString(numeroDecimal);
        System.out.println("Número como String: \"" + numeroString + "\"");

        scanner.close();
    }
}
