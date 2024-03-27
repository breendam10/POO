public class Veiculo {
    private int peso, velocMax;
    private float preco;

    // Construtor sem argumentos iniciando valor em 0
    public Veiculo() {
        this.peso = 0;
        this.velocMax = 0;
        this.preco = 0.0f;
    }

    // Construtor com argumentos
    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    // Métodos getters e setters
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(int velocMax) {
        this.velocMax = velocMax;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // usa Tostring pra exibir os dados
    @Override
    public String toString() {
        return "Peso: " + peso + " kg, Velocidade Máxima: " + velocMax + " km/h, Preço: R$ " + preco;
    }

}
