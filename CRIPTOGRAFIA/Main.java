package CRIPTOGRAFIA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o texto:");
            String text = scanner.nextLine();

            System.out.println("\nEscolha a operação:\n");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            System.out.println("3 - Sair\n");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            limpar.limparTerminal();

            try {
                if (opcao == 1) {
                   
                    String encryptedText = CryptoUtil.encrypt(text);
                    System.out.println("Texto Criptografado: " + encryptedText);

                } else if (opcao == 2) {
                   
                    try {
                        String decryptedText = DescriptoUtil.decrypt(text);
                        System.out.println("Texto Descriptografado: " + decryptedText);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: O texto fornecido não está no formato Base64.");
                    } catch (Exception e) {
                        System.out.println(
                                "Erro ao descriptografar: Certifique-se de que o texto foi criptografado corretamente.");
                    }
                }else if (opcao == 3) {
                        System.out.println("Saindo do projeto");
                        break;
                    
                } else {
                    System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

    }
}
