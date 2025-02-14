import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
    /*
       4. Validação de Senha (Scanner, Validação de Dados, If/Else)
       Peça ao usuário para digitar uma senha e verifique se ela atende os seguintes critérios:

       - Deve ter pelo menos 8 caracteres
       - Deve conter pelo menos um número
       - Deve conter pelo menos uma letra maiúscula
       Caso a senha não atenda os critérios, peça para digitar novamente até ser válida.
    */

        Scanner scanner = new Scanner(System.in);

        String senha;

        while (true) {
            System.out.println("Crie sua senha");
            System.out.println("Sua senha deve seguir as seguintes regras:");
            System.out.println(" - Deve ter pelo menos 8 caracteres");
            System.out.println(" - Deve conter pelo menos um número");
            System.out.println(" - Deve conter pelo menos uma letra maiúscula");

            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            if (senha.length() < 8) {
                System.out.println("Sua senha deve ter pelo menos 8 caracteres");
                System.out.println("Tente novamente!");
            } else {
                boolean temNumero = false;
                boolean temMaiuscula = false;

                for (int i = 0; i < senha.length(); i++) {
                    char c = senha.charAt(i);
                    if (Character.isDigit(c)) {
                        temNumero = true;
                    }
                    if (Character.isUpperCase(c)) {
                        temMaiuscula = true;
                    }
                }

                if (temNumero && temMaiuscula) {
                    System.out.println("Senha válida!");
                    break;
                } else {
                    System.out.println("A senha deve conter pelo menos um número e uma letra maiúscula.");
                    System.out.println("Tente novamente!");
                }
            }
        }
        scanner.close();
    }
}
