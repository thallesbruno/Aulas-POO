package edu.pucgoias.topicos_avancados.bd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
    /*private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/mysql";

    private static final String USUARIO = "root";
    private static final String SENHA = "root123";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);

            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

            JOptionPane.showMessageDialog(null,
                    "Conectado com sucesso ao banco de dados!");

            conexao.close();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro! Driver JDBC não encontrado:\n" + e.getMessage(),
                    "Erro de Driver", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao conectar ao banco de dados:\n" + e.getMessage(),
                    "Erro de SQL", JOptionPane.ERROR_MESSAGE);
        }
    }*/


}
