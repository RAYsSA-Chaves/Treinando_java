package aula09;

import java.util.HashSet;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis e listas
        HashSet<Integer> lista1 = new HashSet<>();
        HashSet<Integer> lista2 = new HashSet<>();
        int num = 0;
        HashSet<Integer> interseccao = new HashSet<>();

        // Lista 1
        System.out.println("==== LISTA 1 ====");
        do {
            System.out.println("Adicione um número na primeira lista ou digite 0 para sair: ");
            System.out.print(">>> ");
            num = Integer.parseInt(scanner.nextLine());
            if(num != 0) {
                lista1.add(num);
            }
        } while (num != 0);

        System.out.println();

        // Lista 2
        System.out.println("==== LISTA 2 ====");
        do {
            System.out.println("Adicione um número na segunda lista ou digite 0 para sair: ");
            System.out.print(">>> ");
            num = Integer.parseInt(scanner.nextLine());
            if(num != 0) {
                lista2.add(num);
            }
        } while (num != 0);

        // Buscar números iguais nas duas listas
        for(int elemento : lista1) {
            if(lista2.contains(elemento)) {
                interseccao.add(elemento);
            }
        }

        System.out.println();

        // Exibir a interseção
        System.out.printf("Lista1: %s\nLista2: %s\n\n==== Intersecção ====\n%s", lista1, lista2, interseccao);
    }
}
