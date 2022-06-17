package faculdadeescolher.faculdadeescolher.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;
import com.mysql.cj.xdevapi.Result;

import faculdadeescolher.faculdadeescolher.repositorys.alunoDAO;

/**
 * alunoCRUD
 */
public class alunoCRUD {
    static alunoDAO aluno = new alunoDAO();
    static Connection connection = alunoDAO.connectionDatabase();

    public static void main(String[] args) {
        
        creatAluno("ALysson", 18);
        readAluno();
        // updateAluno(null, 0);
        deleteAluno(0);
    }

    private static void creatAluno(String nome , int idade) {
        try {
            PreparedStatement prep = connection.prepareStatement("INSERT INTO info (id,nome,idade) VALUE (null,?,?)");
            prep.setString(1, nome);
            prep.setInt(2, idade);
            prep.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error no creatAluno");
        }
    }

    private static void readAluno() {
        ResultSet info;
        try {
            info = connection.createStatement().executeQuery("SELECT * FROM info");
        } catch (Exception e) {
            System.out.println("Error em readAluno");
        }
    }

    private static void updateAluno(String nome , int idade) {
        try {
            PreparedStatement prep = connection.prepareStatement("INSERT INTO info (id,nome,idade) VALUES (null0,?,?)");
            prep.setString(1, nome);
            prep.setInt(2, idade);
        } catch (SQLException e) {
            System.out.println("Error no updateAluno");
        }

    }

    private static void deleteAluno(int id) {
        try {
            PreparedStatement prep = connection.prepareStatement("DELETE INTO info WHERE id = ?");
            prep.setInt(0, id);
            prep.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error no deleteAluno");
        }

    }
}