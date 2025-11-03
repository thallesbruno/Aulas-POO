package edu.pucgoias.construtores;

public class CarroDepois {
    String marca;
    String modelo;
    int ano;
    String cor = "VERMELHO"; // code smell
    double preco;
    boolean temEscada;
    double quilometragem;

    // Construtor padrão (sem parâmetros)
    public CarroDepois() {

    }

    // Construtor com parâmetros para inicializar os atributos
    public CarroDepois(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public CarroDepois(String marca, String modelo, int ano, String cor, double preco, boolean temEscada, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.temEscada = temEscada;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s - Marca: %s - Ano: %d", this.modelo, this.marca, this.ano);
    }
}
