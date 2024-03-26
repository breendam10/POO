package questao2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso do veículo em quilos:");
        int peso1 = scanner.nextInt();
        System.out.println("Digite a velocidade máxima do veículo em Km/h:");
        int velocMax1 = scanner.nextInt();
        System.out.println("Digite o preço do veículo em R$:");
        float preco1 = scanner.nextFloat();

        Veiculo veiculo1 = new Veiculo(peso1, velocMax1, preco1);

        System.out.println("Digite o peso do segundo veículo em quilos:");
        int peso2 = scanner.nextInt();
        System.out.println("Digite a velocidade máxima do segundo veículo em Km/h:");
        int velocMax2 = scanner.nextInt();
        System.out.println("Digite o preço do segundo veículo em R$:");
        float preco2 = scanner.nextFloat();

        Veiculo veiculo2 = new Veiculo(peso2, velocMax2, preco2);

        System.out.println("\nDados do primeiro veículo:");
        System.out.println(veiculo1.toString());

        System.out.println("\nDados do segundo veículo:");
        System.out.println(veiculo2.toString());

        scanner.close();
    }
}
