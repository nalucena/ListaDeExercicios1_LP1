import java.util.Scanner;
public class Questao3 {

        /* 3. Suponha que precisamos trabalhar em um projeto da NASA que
pretende lançar um novo satélite. A economia de memória é
muito importante nessa missão, pois vamos ter uma quantidade
de memória limitada. Vamos trabalhar em 3 módulos e não
podemos ultrapassar o limite de memória de cada módulo. Ao
iniciar o programa o operador deve digitar os dados da missão
para que armazene todos os dados em cada um dos módulos e
no final deve ser printado todos os valores por ele escolhidos.

a. Móludo 01 - Controle de tempo x funcionários:
i. Memória disponível: 3 bytes
ii. Requisitos: Armazenar o ano atual da missão (max
9999), quantidade de funcionários envolvidos
(max 100).
b. Móludo 02 - Controle de distância x velocidade:
i. Memória disponível: 6 bytes


ii. Requisitos: Armazenar distancia que o satélite
ficará da terra (max 2 milhões), velocidade máxima
(max 30.000 km/h)
c. Móludo 03 - Status da missão:
i. Memória disponível: 17 bytes
ii. Requisitos: Armazenar o estado da missão (se já
iniciou ou não), distância que será percorrida
durante a missão em km (max 3 bilhões de km) e
calibragem das antenas (número racional com
precisão de no mínimo 14 casa decimais). */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Módulo 01 - Controle de tempo x funcionários
        System.out.println("Módulo 01 - Controle de tempo x funcionários");

        // Validação do ano

        short anoAtual;
        do {
            System.out.print("Digite o ano atual da missão (até 9999): ");
            anoAtual = scanner.nextShort();
        } while (anoAtual < 0 || anoAtual > 9999);

        // Validação para funcionários

        byte qtdFuncionarios;
        do {
            System.out.print("Digite a quantidade de funcionários envolvidos (até 100): ");
            qtdFuncionarios = scanner.nextByte();
        } while (qtdFuncionarios < 0 || qtdFuncionarios > 100);

        // Módulo 02 - Controle de distância x velocidade
        System.out.println("\nMódulo 02 - Controle de distância x velocidade");

        // Validação da distância

        int distanciaSatelite;
        do {
            System.out.print("Digite a distância que o satélite ficará da terra (até 2 milhões km): ");
            distanciaSatelite = scanner.nextInt();
        } while (distanciaSatelite < 0 || distanciaSatelite > 2000000);

        // Validação da velocidade máxima

        short velocidadeMaxima;
        do {
            System.out.print("Digite a velocidade máxima do satélite (até 30.000 km/h): ");
            velocidadeMaxima = scanner.nextShort();
        } while (velocidadeMaxima < 0 || velocidadeMaxima > 30000);

        // Módulo 03 - Status da missão
        System.out.println("\nMódulo 03 - Status da missão");

        // Validação para estado da missão

        int estadoMissao;
        do {
            System.out.print("Digite o estado da missão (1 para iniciada, 0 para não iniciada): ");
            estadoMissao = scanner.nextInt();
        } while (estadoMissao != 0 && estadoMissao != 1);

        boolean missaoIniciada = estadoMissao == 1;

        // Validação para distancia que será percorrida

        long distanciaMissao;
        do {
            System.out.print("Digite a distância que será percorrida durante a missão em km (até 3 bilhões km): ");
            distanciaMissao = scanner.nextLong();
        } while (distanciaMissao < 0 || distanciaMissao > 3000000000L);

        // Validação para calibragem das antenas

        double calibragemAntenas;
        do {
            System.out.print("Digite a calibragem das antenas (número racional com precisão de no mínimo 14 casas decimais): ");
            calibragemAntenas = scanner.nextDouble();
        } while (String.valueOf(calibragemAntenas).indexOf('.') == -1 || String.valueOf(calibragemAntenas).split("\\.")[1].length() < 14);

        System.out.println("\nValores escolhidos pelo operador:");
        System.out.printf("Módulo 01 - Ano Atual: %d, Qtd Funcionários: %d%n", anoAtual, qtdFuncionarios);
        System.out.printf("Módulo 02 - Distância do Satélite: %d km, Velocidade Máxima: %d km/h%n", distanciaSatelite, velocidadeMaxima);
        System.out.printf("Módulo 03 - Missão Iniciada: %b, Distância da Missão: %d km, Calibragem das Antenas: %.14f%n",
                missaoIniciada, distanciaMissao, calibragemAntenas);


        scanner.close();
    }
}
