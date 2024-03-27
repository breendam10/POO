import java.util.Scanner; // Importando Scanner para ler entrada

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner para receber a frase
        System.out.println("Digite a frase que será alterada:"); // recebe a frase
        String input = scanner.nextLine(); // Le a frase 

        StringBuffer sb = new StringBuffer(input);//cria strings mutaveuis

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (i % 2 == 0) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            } else {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }

        // Imprime a frase alterada com letras maisculas e minusculas
        System.out.println("Frase alterada:");
        System.out.println(sb.toString());
        scanner.close();
    }

}
