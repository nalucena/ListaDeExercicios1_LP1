import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        /* Faça um programa que calcula a área das seguites figuras
           geometricas - Retângulo, Triângulo, Círculo e Trapézio.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a forma geométrica para calcular a área:");
        System.out.println("1. Retângulo");
        System.out.println("2. Triângulo");
        System.out.println("3. Círculo");
        System.out.println("4. Trapézio");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                calcularAreaRetangulo(scanner);
                break;
            case 2:
                calcularAreaTriangulo(scanner);
                break;
            case 3:
                calcularAreaCirculo(scanner);
                break;
            case 4:
                calcularAreaTrapezio(scanner);
                break;
            default:
                System.out.println("Escolha inválida. Por favor, execute o programa novamente.");
        }

        scanner.close();
    }

    private static void calcularAreaRetangulo(Scanner scanner) {
        System.out.println("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
    }

    private static void calcularAreaTriangulo(Scanner scanner) {
        System.out.println("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }

    private static void calcularAreaCirculo(Scanner scanner) {
        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }

    private static void calcularAreaTrapezio(Scanner scanner) {
        System.out.println("Digite o comprimento da base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();
        System.out.println("Digite o comprimento da base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();
        System.out.println("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + area);
    }
}
