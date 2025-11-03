package edu.pucgoias.string_format;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char sigla = 'z';
        String nome = "THALLES"; //1 objeto String
        nome += " Santos"; // 2 objeto String

        String nomeCompleto = nome + " Santos";
        System.out.println("Nome Completo: " + nome);

        // validação de String
        if (nomeCompleto.equals("ASD")){
            System.out.println("String de valor igual.");
        } else {
            System.out.println("String diferente.");
        }

        // condições simples e compostas
        int a = 1, b = 2, c = 3;

        if (a > b){
            System.out.println("ok1");
        } else if (b > c) {
            System.out.println("ok2");
        } else {
            System.out.println("ok2");
        }

        // funções da classe String
        System.out.println(nomeCompleto.toUpperCase());

        System.out.println(nomeCompleto.charAt(0));

        System.out.println(nomeCompleto.substring(0, 6));

        System.out.println(1); // conversão int para String

        String oito = String.valueOf(8); // vira String

        // classe Scanner
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();

        // conversão de tipo
        int numeroCalculado = Integer.parseInt(numero) + 10;
        // classe Estática - Integer

        System.out.println(numeroCalculado);

        System.out.println("+++++++++++++++++++");

        // enumeradores
        DiasDaSemana hoje = DiasDaSemana.QUINTA;
        sc.close(); // liberando o recurso após uso

        // usos de String.format
        String name="Ram";
        String sf1=String.format("O nome é %s",name);
        String sf2=String.format("value1 é %f",32.33);
        String sf3=String.format("value2 é %d",32);
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

        System.out.println("+++++++++++++++++++");

        String str1 = String.format("%d", 132); // valor Integer
        String str2 = String.format("%s", "Java"); // valor String
        String str3 = String.format("%f", 10.32); // valor Float
        String str4 = String.format("%x", 100); // valor Hexadecimal
        String str5 = String.format("%c", 'A'); // valor Char
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        System.out.println("+++++++++++++++++++");

        String str11 = String.format("%d", 101);
        String str22 = String.format("|%10d|", 101); // especifica o comprimento de Integer
        String str33 = String.format("|%-10d|", 101); // alinhamento à esquerda dentro da largura especificada
        String str44 = String.format("|% d|", 101);
        String str55 = String.format("|%010d|", 101); // preenche com zeros
        System.out.println(str11);
        System.out.println(str22);
        System.out.println(str33);
        System.out.println(str44);
        System.out.println(str55);
    }
}
