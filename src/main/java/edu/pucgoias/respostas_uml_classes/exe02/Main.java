package edu.pucgoias.respostas_uml_classes.exe02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextoSaida novoTexto1 = new TextoSaida(); // criação do objeto novoTexto1 que irá armazenar a referência a uma classe TextoSaida
        novoTexto1.texto = "Opa!"; // atribuição direta de valores
        novoTexto1.corFundo = Cor.AZUL; // atribuição direta de valores
        novoTexto1.corFonte = Cor.BRANCO; // atribuição direta de valores


        Scanner sc = new Scanner(System.in); // classe Scanner recebendo como parâmetro um objeto System.in pertencente ao pacote java.lang
    }
}
