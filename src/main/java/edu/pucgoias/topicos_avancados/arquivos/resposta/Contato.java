package edu.pucgoias.topicos_avancados.arquivos.resposta;

/**
 * Classe de modelo que representa um Contato.
 * Esta classe encapsula os dados de nome e telefone.
 */
public class Contato {
    private String nome;
    private String telefone;

    /**
     * Construtor para inicializar um novo objeto Contato.
     * @param nome Nome do contato.
     * @param telefone Telefone do contato.
     */
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters para permitir acesso seguro de leitura
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    /**
     * Sobrescreve o método toString para fornecer uma representação
     * formatada e legível do objeto Contato.
     */
    @Override
    public String toString() {
        // Formatação usando printf-style para alinhar a saída
        return String.format("Nome: %-30sFone: %s", this.nome, this.telefone);
    }
}