package aula08;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double totalNotas = 0;
        double media = 0;
        int contador = 1;

        // Receber notas infinitamente até receber um número negativo
        do {
            try {
                System.out.printf("Digite a %d nota do aluno ou um valor negativo para sair: ", contador);
                nota = Double.parseDouble(scanner.nextLine());
                if (nota >= 0) {
                    totalNotas += nota;
                    contador++;
                }
            } catch (Exception e) {
                System.out.print("Número inválido.");
            }
        } while (nota >= 0);

        // Calcular a média ao sair do loop
        try {
            media = totalNotas/contador;
            System.out.printf("Média do aluno: %f", media);
        } catch (ArithmeticException e) {
            System.out.print("Não foi inserido nemhum aluno, impossível calcular a média.");
        }
    }
}
