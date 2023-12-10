import java.util.Scanner;

public class Questao5 {

        //Faça um programa que calcula o IMC
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, informe a sua altura em metros.");
        double altura = scan.nextDouble();

        System.out.println("Por favor, informe o seu peso em kg");
        double peso = scan.nextDouble();


        double imc = peso / (altura * altura);

   				 /*	Abaixo de 17	Muito abaixo do peso
							Entre 17 e 18,49	Abaixo do peso
							Entre 18,50 e 24,99	Peso normal
							Entre 25 e 29,99	Acima do peso
							Entre 30 e 34,99	Obesidade I
							Entre 35 e 39,99	Obesidade II (severa)
							Acima de 40	Obesidade III (mórbida)				*/

        if (imc < 17) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado muito abaixo do peso)");
        } else if ((imc >=17) && (imc <= 18.49)) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado abaixo do peso)");
        } else if ((imc >= 18.50) && (imc <= 24.99)) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado peso normal)");
        } else if ((imc >= 25) && (imc <= 29.99)) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado acima do peso)");
        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado Obesidade I)");
        } else if ((imc >= 35) && (imc <= 39.99)) {
            System.out.println("O valor do seu IMC é " + imc + " (considerado Obesidade II - severa)");
        } else {
            System.out.println("O valor do seu IMC é " + imc + " (considerado Obesidade III - mórbida)");
        }


    }
}
