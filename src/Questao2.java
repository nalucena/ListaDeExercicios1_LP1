import java.util.Scanner;

public class Questao2 {

    /* Escreva um programa que captura nome, salário, idade, altura e
sexo. Mostre na tela utilizando o printf.*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome, sexo;
        int idade;
        double salario, altura;

        System.out.println("Digite as informações abaixo solicitadas: ");

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o seu salário: ");
        salario = input.nextDouble();
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite sua altura em metros: ");
        altura = input.nextDouble();
        System.out.println("Digite o seu sexo: ");
        sexo = input.next();

        System.out.printf("%nOs dados informados são:%n"
                + "Nome: %s%n"
                + "Salário: %.2f%n"
                + "Idade: %d%n"
                + "Altura: %.2f%n"
                + "Sexo: %s%n", nome, salario, idade, altura, sexo);



    }
}
