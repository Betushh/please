package MainLesson.Lesson26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableOperation {
    static final String CONNECTION_URL = MySQLInfo.CONNECTION_URL.getInfo()+"my_example";
    static final String USERNAME = MySQLInfo.USERNAME.getInfo();
    static final String PASSWORD = MySQLInfo.PASSWORD.getInfo();

    public void create(){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
            String query = "CREATE TABLE `my_example`.`info` (\n" +
                    "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `name` VARCHAR(45) NULL,\n" +
                    "  `age` INT NULL,\n" +
                    "  `race` VARCHAR(45) NULL,\n" +
                    "  `gender` VARCHAR(45) NULL,\n" +
                    "  PRIMARY KEY (`id`));";
            s.executeUpdate(query);
            System.out.println("Table has been created");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void drop(){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
            String query = "drop table info";
            s.executeUpdate(query);
            System.out.println("Table dropped");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
