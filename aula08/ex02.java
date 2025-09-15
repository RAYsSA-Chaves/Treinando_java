package aula08;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Variáveis (opção, números para cálculo, validação dos números, resultado da operação e mensagem final com a conta e resultado)
        String opcao = "";
        double n1 = 0;
        double n2 = 0;
        boolean n1_valido = false;
        boolean n2_valido = false;
        double resultado = 0;

        // Loop da calculadora
        do {
            System.out.println("============CALCULADORA============");
            // Loop para escolher uma operação válida
            do {
                System.out.println("(Digite 'sair' para encerrar)");
                System.out.println("Escolha a operação desejada:\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Raiz\n[6] Potenciação");
                opcao = scanner.nextLine().toLowerCase();
                System.out.println();

                try {
                    if (!opcao.equals("sair") && !opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4") && !opcao.equals("5") && !opcao.equals("6")) {
                        throw new Exception("Opção inválida.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " Tente novamente.\n");
                }
            } while ((!opcao.equals("sair")) && (!opcao.equals("1")) && (!opcao.equals("2")) && (!opcao.equals("3")) && (!opcao.equals("4")) && (!opcao.equals("5")) && (!opcao.equals("6")));

            if (!opcao.equals("sair")) {
                // Caso seja cálculo de raiz, pedir o número e o índice
                if (opcao.equals("5")) {
                    System.out.print("Digite um número: ");
                    // Não permitir valor inválido
                    while (!n1_valido) {
                        try {
                            n1 = Double.parseDouble(scanner.nextLine());
                            if (n1 >= 0) {
                                n1_valido = true;
                            }
                            else {
                                throw new Exception("Valor inválido. Tente novamente.\n");
                            }
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("Valor inválido. Tente novamente.\n");
                            System.out.print("Digite um número: ");
                        }
                    }

                    System.out.print("Digite o índice: ");
                    // Não permitir valor inválido
                    while (!n2_valido) {
                        try {
                            n2 = Double.parseDouble(scanner.nextLine());
                            n2_valido = true;
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("Valor inválido. Tente novamente.\n");
                            System.out.print("Digite o índice: ");
                        }
                    }
                }

                // Caso seja potenciação, mensagem diferente
                else if (opcao.equals("6")) {
                    // Solicitar primeiro número
                    System.out.print("Digite o número que corresponde à base: ");
                    // Não permitir valores inválidos
                    while (!n1_valido) {
                        try {
                            n1 = Double.parseDouble(scanner.nextLine());
                            n1_valido = true;
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("Valor inválido. Tente novamente.\n");
                            System.out.print("Digite o primeiro número: ");
                        }
                    }

                    // Solicitar segundo número
                    System.out.print("Digite o número que corresponde ao expoente: ");
                    // Não permitir valores inválidos
                    while (!n2_valido) {
                        try {
                            n2 = Double.parseDouble(scanner.nextLine());
                            n2_valido = true;
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("Valor inválido. Tente novamente.\n");
                            System.out.print("Digite o segundo número: ");
                        }
                    }
                }

                // Mensagens normais solicitando dois números
                else {
                    // Solicitar primeiro número
                    System.out.print("Digite o primeiro número: ");
                    // Não permitir valores inválidos
                    while (!n1_valido) {
                        try {
                            n1 = Double.parseDouble(scanner.nextLine());
                            n1_valido = true;
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("Valor inválido. Tente novamente.\n");
                            System.out.print("Digite o primeiro número: ");
                        }
                    }

                    // Solicitar segundo número
                    System.out.print("Digite o segundo número: ");
                    // Não permitir valores inválidos
                    while (!n2_valido) {
                        try {
                            n2 = Double.parseDouble(scanner.nextLine());
                            n2_valido = true;
                        } catch (Exception e) {
                            System.out.println();
                            System.out.println("Valor inválido. Tente novamente.\n");
                            System.out.print("Digite o segundo número: ");
                        }
                    }
                }

                // Cálculos
                switch (opcao) {
                    case "1":
                        resultado = n1 + n2;
                        System.out.println();
                        System.out.printf("%.2f + %.2f = %.2f\n\n", n1, n2, resultado);
                        break;
                    case "2":
                        resultado = n1 - n2;
                        System.out.println();
                        System.out.printf("%.2f - %.2f = %.2f\n\n", n1, n2, resultado);
                        break;
                    case "3":
                        resultado = n1 * n2;
                        System.out.println();
                        System.out.printf("%.2f x %.2f = %.2f\n\n", n1, n2, resultado);
                        break;
                    case "4":
                        resultado = n1 / n2;
                        System.out.println();
                        System.out.printf("%.2f / %.2f = %.2f\n\n", n1, n2, resultado);
                        break;
                    case "5":
                        resultado = Math.pow(n1, (1.00/n2));
                        System.out.println();
                        System.out.printf("√%.1f = %.1f\n\n", n1, resultado);
                        break;
                    case "6":
                        resultado = Math.pow(n1, n2);
                        System.out.println();
                        System.out.printf("%.1f ^ %.1f = %.1f\n\n", n1, n2, resultado);
                        break;
                }
            }

            // Resetar validção dos números
            n1_valido = false;
            n2_valido = false;
        } while (!opcao.equals("sair"));
    }
}
