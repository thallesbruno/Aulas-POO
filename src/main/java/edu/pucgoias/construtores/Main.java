package edu.pucgoias.construtores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciação e acesso via metodo a propriedades de classe
        CarroAntes uno = new CarroAntes();
        uno.setAno(2010);
        uno.setMarca("Fiat");
        uno.setPreco(15000);
        uno.setCor("branco");
        uno.setTemEscada(true);

        uno.ligar();

        System.out.println(uno.getMarca());
        System.out.println(uno.getAno());

        // Criando carro usando o construtor com parâmetros
        CarroDepois meuCarro = new CarroDepois("Ford", "Focus", 2021);
        meuCarro.exibirDetalhes(); // Saída: Marca: Ford, Modelo: Focus, Ano: 2021

        // Criando carro usando o construtor padrão
        CarroDepois outroCarro = new CarroDepois();
        outroCarro.exibirDetalhes(); // Saída: Marca: null, Modelo: null, Ano: 0

        CarroDepois unoComEscada = new CarroDepois(); // Criando objeto e populando-o com tipo CarroDepois
        CarroDepois unoSemEscada =
                new CarroDepois("Fiat", "Uno", 1997);

        CarroDepois unoNovo = new CarroDepois();

        // Instanciação de objeto seguido da liberação do recurso Scanner
        Scanner scan = new Scanner((System.in));

        scan.close();
    }
}
