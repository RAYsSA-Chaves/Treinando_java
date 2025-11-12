package aula09;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> listaCpf = new HashSet<>();
        String cpfLido = "";
        int op = 1;

        System.out.println("\n==== SISTEMA DE CPFs ====");
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("[1] Inserir CPF | [2] Remover CPF | [3] Listar CPFs | [0] Sair");
            System.out.print(">>> ");

            try {
                op = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
                continue;
            }

            switch (op) {
                // Inserir CPF
                case 1:
                    try {
                        System.out.print("Digite o CPF a ser inserido: ");
                        cpfLido = scanner.nextLine().replace(".", "")
                                .replace("-", "")
                                .replace(" ", "");

                        // Validações
                        if (cpfLido.length() != 11 || !cpfLido.matches("\\d+")) {
                            throw new InputMismatchException("CPF inválido! Deve conter exatamente 11 dígitos numéricos");
                        }

                        // Adiciona na lista (HashSet não adiciona repetidos por padrão)
                        if (listaCpf.add(cpfLido)) {
                            System.out.println("CPF cadastrado com sucesso!");
                        } else {
                            System.out.println("Este CPF já está cadastrado!");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                // Remover CPF
                case 2:
                    System.out.print("Digite o CPF a ser removido: ");
                    cpfLido = scanner.nextLine().replace(".", "")
                            .replace("-", "")
                            .replace(" ", "");

                    // Remove da lista
                    if (listaCpf.remove(cpfLido)) {
                        System.out.println("CPF removido com sucesso!");
                    } else {
                        System.out.println("CPF não encontrado!");
                    }
                    break;

                // Listar CPFs
                case 3:
                    System.out.println("\nLista de CPFs cadastrados:");
                    if (listaCpf.isEmpty()) {
                        System.out.println("Nenhum CPF cadastrado.");
                    } else {
                        for (String cpf : listaCpf) {
                            // Formata o CPF com pontos e traço
                            String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
                                    cpf.substring(6, 9) + "-" + cpf.substring(9);
                            System.out.println(cpfFormatado);
                        }
                    }
                    break;

                // Sair
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}
