//Cálculo de suprimento para Blobs

/*
Regras:
- blobs comem sempre 1/4 do suprimento disponível por dia (independente da quantidade de blobs)
- o suprimento deve ser resposto para que sempre haja no mínimo 1kg para cada blob
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Pedir quantidade de blobs e suprimento
        System.out.print("Informe a quantidade de Blobs no planeta: ");
        int blobs = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe a quantidade de suprimento (em kg): ");
        double comida = Double.parseDouble(scanner.nextLine());

        //Variáveis de dias que o suprimento vai durar e cálculo do consumo
        int dias = 0;
        double consumo = 0;

        //Verificar se a quantidade de suprimento inicial é válida
        while (comida < blobs) {
            System.out.printf("A quantidade de suprimento é insufuciente para %d Blobs", blobs);
            System.out.print("Informe a quantidade de suprimento novamente: ");
            comida = Double.parseDouble(scanner.nextLine());
}

        //Calcular quantos dias o suprimento vai durar
        while (comida >= blobs) {
            consumo = comida/4;
            comida -= consumo;
            dias += 1;
        }

        //Informar em quantos dias o suprimento precisa ser reposto
        System.out.printf("O suprimento ficará inferior à %dkg em %d dias.", blobs, dias);
    }
}
