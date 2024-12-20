package MainLesson.Lesson26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperation {

    static final String CONNECTION_URL = MySQLInfo.CONNECTION_URL.getInfo();
    static final String USERNAME = MySQLInfo.USERNAME.getInfo();
    static final String PASSWORD = MySQLInfo.PASSWORD.getInfo();

    public void create(String data){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
                String query = "create database "+data;
                s.executeUpdate(query);
            System.out.println("Db created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void drop(String info){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
            String query = "drop database " + info;
            s.executeUpdate(query);
            System.out.println("Db dropped");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
