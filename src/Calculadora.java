import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //create a Scanner obj
        int escolha;
        float num1, num2, resultado;


        System.out.println("Bem-vindo à calculadora");
        System.out.println("Por favor, escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        escolha = entrada.nextInt();
        System.out.println("Digite dois números: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        if (escolha == 1) {
            resultado = num1 + num2;
        }
        else if (escolha == 2) {
            resultado = num1 - num2;
        }
        else if (escolha == 3) {
            resultado = num1 * num2;
        }
        else {
            resultado = num1 / num2;
        }
        System.out.println(resultado);
    }
}
