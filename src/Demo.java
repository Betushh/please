import MainLesson.Lesson26.MySQLInfo;

import java.sql.*;

public class Demo {

    static final String CONNECTION_URL = MySQLInfo.CONNECTION_URL.getInfo()+"my_example";
    static final String USERNAME = MySQLInfo.USERNAME.getInfo();
    static final String PASSWORD = MySQLInfo.PASSWORD.getInfo();

    public static void main(String[] args) {
        Demo d = new Demo();
     d.create();
     //          d.insert();
  //      d.select();



    }

    public void create(){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD)){
            Statement s = c.createStatement();
            String query = "CREATE TABLE `my_example`.`countries` (\n" +
                    "  `country_id` INT NOT NULL AUTO_INCREMENT,\n" +
                    "  `country_name` VARCHAR(45) NULL,\n" +
                    "  `region_id` INT NULL,\n" +
                    "  PRIMARY KEY (`country_id`));\n";


            String delete = "drop table countries";
            s.executeUpdate(query);
            System.out.println("ok");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
           String query = "";
           s.executeUpdate(query);
            System.out.println("value added ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void select(){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
            String query = "select * from jobs where max_salary>25000";
            ResultSet result = s.executeQuery(query);
            while(result.next()){
                System.out.print("Id: "+ result.getInt("job_id"));
                System.out.print(", Job_title: "+ result.getString("job_title"));
                System.out.print(", Min_salary: "+ result.getString("min_salary"));
                System.out.println(", Max_salary: "+ result.getString("max_salary"));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}