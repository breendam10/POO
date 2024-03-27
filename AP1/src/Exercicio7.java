import java.util.Scanner;

public class Exercicio7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String palavra;
        
        do {
            System.out.println("Digite uma palavra para verificar se é um palíndromo ou não (ou 'sair' para encerrar):");
            palavra = scanner.nextLine();
            
            if (!palavra.equalsIgnoreCase("sair")) {
            	if (ehPalindromo(palavra)) {
                    System.out.println("A palavra '" + palavra + "' é um palíndromo!");
                } else {
                    System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
                }
            }
        } while (!palavra.equalsIgnoreCase("sair"));
        
        System.out.println("Programa finalizado.");
        scanner.close();
    }
    
    public static boolean ehPalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        
        int inicio = 0;
        int fim = palavra.length() - 1;
        
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false; 
            }
            inicio++;
            fim--;
        }
        return true; 
    }
}
