//Exibir as tabuadas do 1 ao 10

public class ex09 {
    public static void main(String[] args) {

        //Variáveis (conta e resultado)
        int resultado = 0;
        String conta = "";

        for (int i = 1; i <= 10; i++) {
            System.out.printf("-------- TABUADA DO %d --------\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
