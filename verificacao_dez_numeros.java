//Verificar o maior e menor número e quantos são pares e ímpares entre dez números

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variáveis de número digitado, maior e menor número e quantidade de números pares e ímpares
        int num_digitado = 0;
        int pares = 0;
        int impares = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {
            //Pedir 10 números
            System.out.printf("Digite o %d° número: ", i);
            num_digitado = Integer.parseInt(scanner.nextLine());

            //Guardar o primeiro número digitado para iniciar a comparação
            if (i == 1) {
                maior = num_digitado;
                menor = num_digitado;
            }
            else {
                //Verificar quem é o maior e menor
                if (num_digitado > maior) {
                    maior = num_digitado;
                }
                else if (num_digitado < menor) {
                    menor = num_digitado;
                }
            }
            //Verificar os pares e ímpares
            if (num_digitado % 2 == 0) {
                pares ++;
            }
            else {
                impares ++;
            }
        }

        //Exibir o maior, menor e quantidade de par e impar
        System.out.printf("O maior número é %d\nO menor número é %d\nHá %d números pares\nHá %d números ímpares", maior, menor, pares, impares);
    }
}
