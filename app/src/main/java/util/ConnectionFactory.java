package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//classe responsável por criar a conexão com o banco de dados e devolver pra alguma parte do código que precise fazer algum crud
public class ConnectionFactory {
    public static final String DRIVER ="com.mysql.jdbc.Driver"; //qual o driver do banco específico
    public static final String URL = "jdbc:mysql://localhost:3306/todoApp";
    public static final String USER = "root";
    public static final String PASS = "";

    //esse método me devolve uma conexão e ele é estático pois posso usar o método sem precisar instancia-lo
    public static java.sql.Connection getConnection() {
        try {//esse meu try vai tentar rodar o que tem dentro dele ex: n achar o driver, n conseguir fazer conexão
            Class.forName(DRIVER);//essa linha serve para carregar o driver que eu coloquei lá em cima
            return DriverManager.getConnection(URL, USER, PASS); //quero fazer uma conexão com esses parametros, depois de ter carregado os drivers. conexão com o DB
        } catch (Exception ex) {//aqui eu lanço o erro que aconteceu, lanço minha exceção
            throw new RuntimeException("Erro na conexão com o banco de dados no método getConnection", ex);
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }

        } catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            }   catch (Exception ex) {
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }

//    public static void closeConnection(Connection connection, PreparedStatement statement) {
//        closeConnection(connection);
//        try {
//            if (statement != null) {
//                statement.close();
//            }
//        } catch (Exception ex) {
//            throw new RuntimeException("Erro ao fechar a conex�o com o banco de dados", ex);
//        }
//
//    }
}}
