 package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";   //usuário padrão do MySql (alterar depois)
    public static final String PASS = "";       //password padrão do MySql (alterar depois)

    public static Connection getConnection() throws SQLException {
        //carrega o driver 
        Connection connection = DriverManager.getConnection(URL, USER, PASS);  //estabelece a conexão
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }

    //é possível criar 2 métodos com o mesmo nome mas com parâmetros diferentes:
    public static void closeConnection(Connection connection, PreparedStatement statement) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
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

        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
}
