//Soma de todos os números até um número natural

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //Variável de soma e para guardar a conta
        int soma = 0;
        String conta = "";

        //Pedir um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int num = Integer.parseInt(scanner.nextLine());

        //Não permitir número negativo
        while (num < 0) {
            System.out.println("Não são permitidos números negativos. Tente novamente.");
            System.out.print("Digite um número inteiro positivo: ");
            num = Integer.parseInt(scanner.nextLine());
        }

        //Calcular a soma de todos os números até o digitado
        for (int i = 1; i <= num; i++) {
            soma += i;
            if (i == 1) {
                conta += i;
            }
            else {
                conta += " + " + i;
            }
        }

        //Exibir a soma
        System.out.printf("%s = %d", conta, soma);
    }
}
