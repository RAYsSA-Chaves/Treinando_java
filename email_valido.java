//Verificar se o endereço de email de é válido

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir para digitar um email
        System.out.print("Digite um endereço de email: ");
        String email = scanner.nextLine();

        //Verificações
        boolean validaçao = true;

        if (email.contains("@")) {
            if (email.contains(".")) {
                //Separar email e dominio
                String nome_usuario = email.substring(0, email.lastIndexOf("@"));
                String dominio = email.substring(email.lastIndexOf("@"));
                if (email.contains(" ")) {
                    validaçao = false;
                } else if (nome_usuario == "" || dominio == "") {
                    validaçao = false;
                } else if (nome_usuario.contains("@") || nome_usuario.charAt(0) == '.') {
                    validaçao = false;
                } else if (dominio.charAt(dominio.length() - 1) == '.' || dominio.charAt(dominio.length() - 1) == '@') {
                    validaçao = false;
                } else if (dominio.charAt(1) == '.') {
                    validaçao = false;
                }
            }
            else {
                validaçao = false;
            }
        }
        else {
            validaçao = false;
        }

        //Exibir validação
        if (validaçao == true) {
            System.out.print("Email válido");
        }
        else {
            System.out.print("Email inválido");
        }
    }
}
