package edu.pucgoias.modificadores;

public class Carro {

    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private String cor;



    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Métodos públicos (Getters) para ler os atributos
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    // Método público (Setter) para modificar o ano com validação
    public void setAno(int novoAno) {
        if (novoAno > 1900 && novoAno <= 2025) { // Validação de dados!
            this.ano = novoAno;
        } else {
            System.out.println("Ano inválido. O ano não foi alterado.");
        }
    }

    public int getAno() {
        return ano;
    }
}