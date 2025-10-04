package atividade4;
import java.util.Scanner;

public class atividadeQuatro {
    private static final String MENU = """
        calculadora simples.
        
        [1] +
        [2] -
        [3] *
        [4] /
        
        escolha uma opcao
        """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(MENU);
        int opcao = scanner.nextInt();

        System.out.print("digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("resultado: " + (num1 + num2));
        } else if (opcao == 2) {
            System.out.println("resultado: " + (num1 - num2));
        } else if (opcao == 3) {
            System.out.println("resultado: " + (num1 * num2));
        } else if (opcao == 4) {
            if (num2 != 0) {
                System.out.println("resultado: " + (num1 / num2));
            } else {
                System.out.println("divisao por zero nao e possivel");
            }
        } else {
            System.out.println("opcao invalida");
        }
    }
}
