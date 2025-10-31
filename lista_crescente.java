import java.util.Arrays;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis/listas
        int[] lista_original = new int[10];
        int[] lista_final = new int[10];
        int num = 0;
        int menor = 0;
        int atual = 0;
        int proximo = 0;

        // Pedir 10 números
        for (int i = 0; i < lista_original.length; i++) {
            System.out.printf("Digite o %d° número: ", i+1);

            try {
                lista_original[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido!");
                System.exit(1);
            }
            System.out.println();
        }
        lista_final = lista_original;

        // Ordenar de forma crescente
        for (int i = 0; i < lista_final.length; i++) {
            for (int j = i+1; j < lista_final.length; j++) {
                atual = lista_final[i];
                proximo = lista_final[j];
                if (proximo <= atual) {
                    lista_final[i] = proximo;
                    lista_final[j] = atual;
                }
                else {
                    lista_final[i] = atual;
                    lista_final[j] = proximo;
                }
            }
        }

        // Exibir lista ordenada
        System.out.println(Arrays.toString(lista_final));
    }
}
