//Tabuada de um número

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variáveis (número digitado, conta e resultado)
        int num = 0;
        int resultado = 0;
        String conta = "";

        //Pedir um número
        System.out.print("Digite um número: ");
        num = Integer.parseInt(scanner.nextLine());

        //Calcular a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
