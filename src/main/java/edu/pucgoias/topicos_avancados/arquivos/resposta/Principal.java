package edu.pucgoias.topicos_avancados.arquivos.resposta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe principal para demonstrar a manipulação básica de arquivos de texto
 * (leitura e escrita) utilizando classes do pacote java.io.
 * Refatorada para utilizar a classe Contato.
 */
public class Principal {
    /* Atributos */
    private String nomeDoArquivo;

    /* Construtor */
    public Principal(String nomeArquivo) {
        this.nomeDoArquivo = nomeArquivo;
    }

    /* Métodos */
    /**
     * Insere um novo registro no arquivo, anexando-o ao final.
     * O registro é formatado como "nome:telefone".
     * @param registro A linha de dados a ser escrita no arquivo.
     */
    public void inserirDados(String registro) {
        File fArquivo = null;
        try {
            fArquivo = new File(this.nomeDoArquivo);

            // O construtor FileWriter(file, true) cria o arquivo se ele não existir
            // e sempre anexa (append) se ele já existir.
            FileWriter fwArquivo = new FileWriter(fArquivo, true);

            BufferedWriter bw = new BufferedWriter(fwArquivo);

            // Escreve o registro no arquivo e adiciona uma quebra de linha
            bw.write(registro + "\n");

            System.out.println("Registro adicionado com sucesso...");

            // Fechando os recursos
            bw.close();
            fwArquivo.close();

        } catch (Exception e) {
            System.err.println("Erro ao inserir linhas no arquivo: " + fArquivo);
        }
    }

    /**
     * Lista todos os dados contidos no arquivo, processando linha por linha.
     */
    public void listarDados() {
        Scanner lendoArquivo = null;
        File arquivo = null;
        try {
            arquivo = new File(this.nomeDoArquivo);
            lendoArquivo = new Scanner(arquivo);

            System.out.println("\n..:: Dados Listados do Arquivo ::..");

            while (lendoArquivo.hasNextLine()) {
                this.processandoLinha(lendoArquivo.nextLine());
            }

            System.out.println("..:: Fim da Lista ::..\n");

        } catch (FileNotFoundException e) {
            System.err.println("Erro: arquivo nao existe. " + arquivo);
        } finally {
            if (lendoArquivo != null) {
                lendoArquivo.close();
            }
        }
    }

    /**
     * Implementa a busca por nome no arquivo.
     * @param nomeBusca O nome a ser buscado no primeiro campo do registro.
     */
    public void buscarDados(String nomeBusca) {
        Scanner lendoArquivo = null;
        File arquivo = null;
        boolean encontrado = false;

        try {
            arquivo = new File(this.nomeDoArquivo);
            lendoArquivo = new Scanner(arquivo);

            System.out.println("\n..:: Resultado da Busca por: " + nomeBusca + " ::..");

            while (lendoArquivo.hasNextLine()) {
                String linha = lendoArquivo.nextLine();
                if (linha != null && !linha.trim().isEmpty()) {
                    String[] campos = linha.split(":");

                    if (campos.length >= 2) {
                        String nomeNoArquivo = campos[0].trim();

                        // Comparação case-insensitive (ignorando maiúsculas/minúsculas)
                        if (nomeNoArquivo.equalsIgnoreCase(nomeBusca.trim())) {
                            Contato contatoEncontrado = new Contato(nomeNoArquivo, campos[1].trim());
                            System.out.println(contatoEncontrado);
                            encontrado = true;
                        }
                    }
                }
            }

            if (!encontrado) {
                System.out.println("Nenhum contato encontrado com o nome: " + nomeBusca);
            }

            System.out.println("..:: Fim da Busca ::..\n");

        } catch (FileNotFoundException e) {
            System.err.println("Erro: arquivo nao existe. " + arquivo);
        } finally {
            if (lendoArquivo != null) {
                lendoArquivo.close();
            }
        }
    }

    /**
     * Processa e exibe uma única linha lida do arquivo, criando um objeto Contato.
     * Implementa a segurança de leitura (Exercício 2.1 e 2.3).
     * @param linha A string contendo o registro (nome:telefone).
     */
    private void processandoLinha(String linha) {
        // Formato esperado: nome:telefone
        if (linha != null && !linha.trim().isEmpty()) {
            try {
                // Separando os campos através do delimitador ':'
                String[] campos = linha.split(":");

                // VERIFICAÇÃO CRÍTICA (prevenção de ArrayIndexOutOfBoundsException)
                if (campos.length >= 2) {
                    // Cria e imprime o objeto Contato (o toString() é chamado automaticamente)
                    Contato contato = new Contato(campos[0].trim(), campos[1].trim());
                    System.out.println(contato);
                } else {
                    System.out.println("[AVISO] Linha ignorada por formato inválido: " + linha);
                }
            } catch (Exception e) {
                System.err.println("[ERRO INESPERADO] Falha ao processar linha: " + linha);
            }
        }
    }

    /**
     * Apresenta o menu de interação com o usuário (Atualizado com Busca).
     */
    public void menu() {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        do {
            try {
                System.out.println("\n..:: Trabalhando com Arquivos Texto ::..");
                System.out.println("1 - Inserir linha (Nome:Telefone)");
                System.out.println("2 - Listar todo arquivo");
                System.out.println("3 - Buscar por Nome"); // Nova opção
                System.out.println("4 - Sair");            // Sair movido para 4
                System.out.print("Entre com uma opcao: ");

                op = teclado.nextInt();

                switch (op) {
                    case 1:
                        teclado.nextLine();
                        String nome;
                        String telefone;
                        System.out.println("\n--- Entrada de Dados ---");
                        System.out.print("Nome: ");
                        nome = teclado.nextLine();
                        System.out.print("Fone: ");
                        telefone = teclado.nextLine();
                        this.inserirDados(nome + ":" + telefone);
                        break;
                    case 2:
                        this.listarDados();
                        break;
                    case 3: // Opção de Busca
                        teclado.nextLine();
                        System.out.print("Entre com o nome para buscar: ");
                        String nomeBusca = teclado.nextLine();
                        this.buscarDados(nomeBusca);
                        break;
                    case 4:
                        System.out.println("Saindo do programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Digite apenas números para a opção do menu.");
                teclado.nextLine(); // Limpa o buffer de entrada
                op = 0;
            }

        } while (op != 4); // Loop continua até a opção 4
        teclado.close();
    }

    public static void main(String[] args) {
        // ATENÇÃO: Altere o caminho do arquivo para um local válido em seu sistema!
        Principal p = new Principal("c:/dev/logs/agenda-poo.txt");

        p.menu();
    }
}