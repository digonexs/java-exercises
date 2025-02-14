import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
    /*
       3. Verificação de Maioridade (Condicionais if/else, Scanner, Tipos Primitivos)
       Solicite a idade do usuário e exiba uma mensagem informando se ele é maior ou menor de idade.

       Entrada:
       Digite sua idade: 17

       Saída esperada:
       Você é menor de idade.
    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        byte idade = scanner.nextByte();
        scanner.nextLine();

        System.out.println (idade >= 18 ? "Você é maior de idade." : "Você é menor de idade.");

        scanner.close();
    }
}
