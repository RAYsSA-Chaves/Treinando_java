import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcao = "";
        double saldo = 0;
        double valor = 0;

        // Sempre reiniciar
        do {
            System.out.println("==========CAIXA==========");
            System.out.print("[1] CONSULTAR SALDO\n[2] REALIZAR SAQUE\n[3] REALIZAR DEPÓSITO\n>>> ");
            opcao = scanner.nextLine();
            System.out.println();

            // Tentar fazer a operação desejada
            try {
                switch (opcao) {
                    case "1":
                        System.out.printf("SALDO: R$ %.2f", saldo);
                        System.out.println();
                        System.out.println();
                        break;

                    case "2":
                        if (saldo > 0) {
                            System.out.print("Quanto deseja sacar?\n>>> ");

                            try {
                                valor = Double.parseDouble(scanner.nextLine());
                                System.out.println();
                                if (valor > 0) {
                                    if ((saldo - valor) >= 0) {
                                        saldo -= valor;
                                        System.out.printf("Saque de R$%.2f realizado com sucesso!", valor);
                                        System.out.println();
                                    }
                                    else {
                                        throw new Exception("Saldo insuficiente para realizar o saque!");
                                    }
                                }
                                else {
                                    throw new Exception("Valor inválido.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.print("Valor inválido.");
                            }
                        }
                        else {
                            throw new Exception("Saldo insuficiente para realizar saques!");
                        }
                        System.out.println();
                        break;

                    case "3":
                        System.out.print("Quanto deseja depositar?\n>>> ");

                        try {
                            valor = Double.parseDouble(scanner.nextLine());
                            System.out.println();
                            if (valor > 0) {
                                saldo += valor;
                                System.out.printf("Depósito de R$%.2f realizado!", valor);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            else {
                                throw new Exception("Valor inválido!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido.");
                            System.out.println();
                        }
                        break;

                    default:
                        throw new Exception("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

        } while (true);
    }
}
