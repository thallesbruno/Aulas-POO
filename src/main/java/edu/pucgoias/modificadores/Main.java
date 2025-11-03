package edu.pucgoias.modificadores;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Uno", 2018, "Branco");

        // Tentativa de acesso direto (vai dar erro de compilação)
        // meuCarro.ano = 1999;

        // Acessando via Getter
        System.out.println("Marca do carro: " + meuCarro.getMarca()); // Saída: Marca do carro: Fiat

        // Modificando via Setter (com validação)
        meuCarro.setAno(2023); // Ano válido
        System.out.println("Novo ano: " + meuCarro.getAno());

        meuCarro.setAno(1800); // Ano inválido
    }
}
