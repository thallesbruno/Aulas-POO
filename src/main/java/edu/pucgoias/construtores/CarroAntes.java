package edu.pucgoias.construtores;

public class CarroAntes {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private boolean temEscada;
    private double quilometragem;
    final int QTDEMINIMADECARECTERES = 1;

    public CarroAntes(){

    }

    public CarroAntes(String marca, String modelo, int ano){

    }

    public void ligar(){
        System.out.println("Está ligando...");
    }

    private void calcularKm(){

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return "O ano do veículo é: " + String.valueOf(ano);
    }

    public int getAnoDefault(){
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isTemEscada() {
        return temEscada;
    }

    public void setMarca(String marca) {
        if (marca.length() <= QTDEMINIMADECARECTERES) {
            System.out.println("O nome da Marca deve ser um valor válido!");
        } else {
            this.marca = marca;
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 1980){
            System.out.println("Ano inválido");
        } else {
            this.ano = ano;
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTemEscada(boolean temEscada) {
        this.temEscada = temEscada;
    }
}
