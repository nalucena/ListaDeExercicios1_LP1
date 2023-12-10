import java.util.Scanner;

public class Questao1 {

    /* Escreva um programa que captura nome, idade e profissão do
    usuário e mostra na tela os valores. (Utilize a classe Scanner e
    os 3 métodos print, printf e println).*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome, profissao;
        int idade;

        System.out.println("Para iniciarmos, por favor, digite as informações solicitadas: ");
        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite sua profissão: ");
        profissao = input.next();

        System.out.printf("%nOs dados informados são:%n"
                + "Nome: %s%n"
                + "Idade: %d%n"
                + "Profissão: %s%n", nome, idade, profissao);


    }
}
