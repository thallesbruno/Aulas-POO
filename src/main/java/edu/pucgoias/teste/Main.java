package edu.pucgoias.teste;

class DadosInvalidosException extends Exception {
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

class CadastroCliente {
    void cadastrar(String nome, int idade) throws DadosInvalidosException {
        if (nome == null || nome.isEmpty() || idade < 18) {
            throw new DadosInvalidosException("Nome não pode ser vazio e idade deve ser maior que 18.");
        }
        System.out.println("Cliente cadastrado com sucesso!");
    }
}

class AppFinanceiro {
    static double calcularDivisao(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        } finally {
            System.out.println("Operação finalizada com sucesso.");
        }
    }

    public static void main(String[] args) {
        calcularDivisao(10, 0);

        CadastroCliente cadastro = new CadastroCliente();
        try {
            cadastro.cadastrar("", 16);
        } catch (DadosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
