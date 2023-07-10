package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/turmacatalisa", "postgresql", "123456");
            if (conexao != null) {
                System.out.println("Conexão com o banco de dados realizada com sucesso!");
                Statement st = conexao.createStatement();
                consultarDados(st);
            } else {
                System.out.println("Conexão com o banco de dados falhou!");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    static void consultarDados(Statement st){
        String sql = "SELECT id, nome FROM alunos";
        try {
            ResultSet result = st.executeQuery(sql);
            while (result.next()){
                System.out.println("ID: " + result.getInt("id") + ", Nome do aluno: " + result.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}