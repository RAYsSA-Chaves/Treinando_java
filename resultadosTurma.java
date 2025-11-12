package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        ArrayList<String> nomesVermelhos = new ArrayList<String>();
        ArrayList<Integer> notasVermelhas = new ArrayList<Integer>();
        String nomeLido = "";
        Integer notaLida = 0;
        int op = 0;
        double media = 0;
        int qtdAbaixoMedia = 0;

        System.out.println("\n==== SISTEMA DE NOTAS DA TURMA ====");
        do {
            // Opção do usuário
            System.out.println();
            System.out.println("Menu:\n[1] Inserir aluno e nota | [0] Ver resultados da turma");
            System.out.print(">>> ");
            try{
                op = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida!");
                continue;
            }
            System.out.println();

            switch (op) {
                // Inserir aluno e nota
                case 1:
                    System.out.print("Insira o nome do aluno: ");
                    nomeLido = scanner.nextLine();
                    nomes.add(nomeLido);

                    System.out.printf("Insira a nota de %s: ", nomeLido);
                    try{
                        notaLida = Integer.parseInt(scanner.nextLine());
                        notas.add(notaLida);
                    } catch (NumberFormatException e) {
                        System.out.println("Nota inválida!");
                        nomes.remove(nomes.size());
                    }
                    break;

                // Sair e retornar média infos da turma
                case 0:
                    System.out.println("---- Resultados da turma ----\n");

                    // Calcula média
                    for(int i = 0; i < notas.size(); i++) {
                        media += notas.get(i);
                    }
                    media = media/notas.size();

                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum aluno adicinado");
                    }
                    else {
                        // Conta alunos com nota abaixo de 5
                        for(int i = 0; i < notas.size(); i++) {
                            if (notas.get(i) < 5) {
                                qtdAbaixoMedia += 1;
                                notasVermelhas.add(notas.get(i));
                                nomesVermelhos.add(nomes.get(i));
                            }
                        }

                        // Exibe resultados
                        System.out.printf("Média da turma: %.2f\n", media);
                        System.out.printf("Alunos abaixo da média: %d\n", qtdAbaixoMedia);
                        for(int i = 0; i < notasVermelhas.size(); i++) {
                            System.out.printf(" - %s | %d\n", nomesVermelhos.get(i), notasVermelhas.get(i));
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}
