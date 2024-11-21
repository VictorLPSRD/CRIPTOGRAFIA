package CRIPTOGRAFIA;

public class limpar {
    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("Erro");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();  
        }
    }
}