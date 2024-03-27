import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe dados do veiculo1
        System.out.println("Informe o peso do primeiro veículo :");
        int peso1 = scanner.nextInt();

        System.out.println("Informe a velocidade máxima do primeiro veículo:");
        int velocMax1 = scanner.nextInt();

        System.out.println("Informe o preço do primeiro veículo:");
        float preco1 = scanner.nextFloat();

        // Cria o objeto Veiculo1
        Veiculo veiculo1 = new Veiculo(peso1, velocMax1, preco1);

        // recebe dados do veiculo2
        System.out.println("\nInforme o peso do segundo veículo :");
        int peso2 = scanner.nextInt();

        System.out.println("Informe a velocidade máxima do segundo veículo:");
        int velocMax2 = scanner.nextInt();

        System.out.println("Informe o preço do segundo veículo:");
        float preco2 = scanner.nextFloat();

        // Cria o objeto Veiculo2
        Veiculo veiculo2 = new Veiculo(peso2, velocMax2, preco2);

        // Exibe os dados do
        System.out.println("\nDados do primeiro veículo:");
        System.out.println(veiculo1);

        System.out.println("\nDados do segundo veículo:");
        System.out.println(veiculo2);

        scanner.close();
    }
}
