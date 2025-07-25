//Sistema de controle de notas

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variáveis (qtd de alunos, nome do aluno, média do aluno, qtd de alunos reprovados, nome + média dos alunos reprovados)
        int qtd_alunos = 0;
        String nome = "";
        double media = 0;
        int qtd_reprovados = 0;
        String info_reprovados = "";

        //Pedir a quantidade de alunos
        System.out.println("BEM-VINDO(A) AO SEU SISTEMA DE CONTROLE DE NOTAS!\n");
        System.out.print("Informe a quantidade de alunos: ");
        qtd_alunos = Integer.parseInt(scanner.nextLine());

        //Pedir o nome e média de cada aluno
        for (int i = 0; i < qtd_alunos; i++) {
            System.out.print("Informe o nome do aluno: ");
            nome = scanner.nextLine();
            System.out.printf("Informe a média de %s: ", nome);
            media = Integer.parseInt(scanner.nextLine());
            System.out.println();

            //Verificar se o aluno está reprovado
            if (media < 5) {
                qtd_reprovados += 1;
                info_reprovados += "ALUNO: " + nome + " | " + "MÉDIA: " + media + "\n";
            }
        }

        //Exibir a quantidade de reprovados e os nomes e médias desses alunos
        System.out.println("----------------------------");
        System.out.printf("Quantidade de alunos reprovados: %d\n\n%s", qtd_reprovados, info_reprovados);
    }
}
