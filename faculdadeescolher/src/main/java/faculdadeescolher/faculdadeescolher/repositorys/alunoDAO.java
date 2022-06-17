package faculdadeescolher.faculdadeescolher.repositorys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * alunoDAO
 */
public class alunoDAO {

    public static void main(String[] args) {
        connectionDatabase();
    }

    public static Connection connectionDatabase() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/aluno", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR_CLASS_FORNAME");
        }
        return connection;
    }
}