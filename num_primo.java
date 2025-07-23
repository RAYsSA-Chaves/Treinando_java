import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir um número
        System.out.print("Digite um número: ");
        int num = Integer.parseInt(scanner.nextLine());

        //Variável contador e resultado
        int contador = 2;
        String resultado = "é primo";

        //Verificar se é primo
        if (num <= 1) {
            resultado = "não é primo";
        }
        else if (num != 2) {
            while (contador != num) {
                if (num % contador == 0) {
                    resultado = "não é primo";
                    break;
                }
                contador += 1;
            }
        }

        //Informar se é primo ou não
        System.out.printf("O número %d %s", num, resultado);
    }
}
