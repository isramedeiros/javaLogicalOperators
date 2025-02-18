import java.util.Scanner;

public class PraiaParque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criando scanner object

        System.out.println("É um dia ensolarado? ");
        String clima = scanner.nextLine();

        System.out.println("É um dia de fim de semana? ");
        String dia = scanner.nextLine();

        if (clima.equalsIgnoreCase("sim") && dia.equalsIgnoreCase("sim")) {
            System.out.println("♫ Vamos pa' la playa\n" + "Pa' curarte el alma ♪");
        }
        else {
            System.out.println("Melhor ir ao parque");
        }

        scanner.close();
    }
}