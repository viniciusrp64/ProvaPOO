package questao02;

import java.util.Scanner;

public class ProjetoSocial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1- Distribuição de Alimentos");
            System.out.println("2- Trabalho Voluntário");
            System.out.println("3- Sair");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do projeto:");
                    String nomeProjetoDist = scanner.next();
                    System.out.println("Digite a descrição:");
                    String descricaoDist = scanner.next();
                    System.out.println("Digite o endereço:");
                    String enderecoDist = scanner.next();
                    System.out.println("Digite a data de início:");
                    String dataInicioDist = scanner.next();
                    System.out.println("Digite a data de fim:");
                    String dataFimDist = scanner.next();
                    System.out.println("Digite a descrição do alimento:");
                    String descAlimentoDist = scanner.next();
                    System.out.println("Digite a quantidade:");
                    float qtdeDist = scanner.nextFloat();

                    DistribuicaoAlimento dist = new DistribuicaoAlimento(nomeProjetoDist, descricaoDist, enderecoDist,
                            dataInicioDist, dataFimDist, descAlimentoDist, qtdeDist);

                    if (dist.validaProjeto(nomeProjetoDist)) {
                        System.out.println("Projeto válido!");
                        System.out.println(dist.imprimeProjeto());
                    } else {
                        System.out.println("Projeto inválido!");
                    }

                    break;

                case 2:
                    System.out.println("Digite o nome do projeto:");
                    String nomeProjetoTrabVoluntario = scanner.next();
                    System.out.println("Digite a descrição:");
                    String descricaoTrabVoluntario = scanner.next();
                    System.out.println("Digite o endereço:");
                    String enderecoTrabVoluntario = scanner.next();
                    System.out.println("Digite a data de início:");
                    String dataInicioTrabVoluntario = scanner.next();
                    System.out.println("Digite a data de fim:");
                    String dataFimTrabVoluntario = scanner.next();
                    System.out.println("Digite o tipo de trabalho:");
                    String tipoTrabalhoTrabVoluntario = scanner.next();
                    System.out.println("Digite a duração do trabalho:");
                    int duracaoTrabVoluntario = scanner.nextInt();

                    TrabalhoVoluntario trabVoluntario = new TrabalhoVoluntario(nomeProjetoTrabVoluntario,
                            descricaoTrabVoluntario, enderecoTrabVoluntario, dataInicioTrabVoluntario,
                            dataFimTrabVoluntario, tipoTrabalhoTrabVoluntario, duracaoTrabVoluntario);

                    if (trabVoluntario.validaProjeto(nomeProjetoTrabVoluntario)) {
                        System.out.println("Projeto válido!");
                        System.out.println(trabVoluntario.imprimeProjeto());
                    } else {
                        System.out.println("Projeto inválido!");
                    }

                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }

}
