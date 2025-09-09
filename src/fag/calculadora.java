import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        }

        if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        }

        if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        }

        if (operador == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero.");
            }
        }

        if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
            System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}
