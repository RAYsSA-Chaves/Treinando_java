// Cadastro de alunos e notas e filtro por notas abaixo de, notas acima de ou nome

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis/listas
        String[] nomes = new String[5];
        int[] notas = new int[5];

        int op = 0;
        int valorFiltro = 0;
        String nomeFiltrado = "";
        String nome = "";
        int nota = 0;

        // Guardando nomes e notas
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite o nome do %d° aluno: ", i+1);
            nome = scanner.nextLine();
            nomes[i] = nome;
            System.out.printf("Digite a nota de %s: ", nome);
            try {
                notas[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido!");
                System.exit(1); // 0 → sinaliza que o programa terminou com sucesso; 1 ou outro número → sinaliza que houve algum erro
            }
            System.out.println();
        }

        // Opções de filtros
        System.out.println("Filtrar por:\n[1] Notas ABAIXO de _\n[2] Notas ACIMA de _\n[3] Nome");
        System.out.print(">>> ");
        try {
            op = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida!");
            System.exit(1);
        }
        System.out.println();

        // Lógica dos filtros
        try {
            switch (op) {
                case 1:
                    System.out.print("Filtrar por notas abaixo de: ");
                    try {
                        valorFiltro = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido!");
                    }
                    System.out.println();

                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] < valorFiltro) {
                            nome = nomes[i];
                            nota = notas[i];
                            System.out.printf("Aluno: %s | Nota: %d", nome, nota);
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Filtrar por notas acima de: ");
                    try {
                        valorFiltro = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido!");
                    }
                    System.out.println();

                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] > valorFiltro) {
                            nome = nomes[i];
                            nota = notas[i];
                            System.out.printf("Aluno: %s | Nota: %d", nome, nota);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Buscar nome: ");
                    nomeFiltrado = scanner.nextLine().toLowerCase();

                    for (int i = 0; i < notas.length; i++) {
                        if (nomes[i].toLowerCase().contains(nomeFiltrado)) {
                            nome = nomes[i];
                            nota = notas[i];
                            System.out.printf("Aluno: %s | Nota: %d", nome, nota);
                            System.out.println();
                        }
                    }
                    break;
                default: throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Opção inválida!");
        }
    }
}
