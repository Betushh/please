package MainLesson.Lesson26;

import java.sql.*;

public class CrudOperation {
    static final String CONNECTION_URL = MySQLInfo.CONNECTION_URL.getInfo()+"my_example";
    static final String USERNAME = MySQLInfo.USERNAME.getInfo();
    static final String PASSWORD = MySQLInfo.PASSWORD.getInfo();

    static final String INSERT_STUDENTS = "insert into students(name, surname) values(?, ?)";
    static final String UPDATE_STUDENTS = "update students set university=?, salary=? where id=?";
    static final String DELETE_STUDENTS = "delete from students where id=?";


    public void insert(String name, String surname){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            PreparedStatement s = c.prepareStatement(INSERT_STUDENTS)){
//            String query = "insert into students(name, surname) values('"+name+"', '"+surname+"');";
            s.setString(1, name);
            s.setString(2,surname);
            int i = s.executeUpdate();
            System.out.println("value added "+ i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String university, int salary, int id){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            PreparedStatement s = c.prepareStatement(UPDATE_STUDENTS)){
            s.setString(1,university);
            s.setInt(2,salary);
            s.setInt(3, id);
            int i = s.executeUpdate();
            System.out.println("value updated "+ i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            PreparedStatement s = c.prepareStatement(DELETE_STUDENTS)){
            s.setInt(1, id);
            int i = s.executeUpdate();
            System.out.println("value deleted "+ i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void select(String name){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
            Statement s = c.createStatement()){
            String query = "select * from students where name='" + name + "'" ;
            ResultSet result = s.executeQuery(query);
            while(result.next()){
                System.out.print("Id: "+ result.getInt("id"));
                System.out.print(", Name: "+ result.getString("name"));
                System.out.print(", Surname: "+ result.getString("surname"));
                System.out.print(", University: "+ result.getString("university"));
                System.out.println(", Salary: "+ result.getInt("salary"));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public void injection(String name){
        try(Connection c = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
           Statement s = c.createStatement()){
            String query = "select * from students where name=" + name ;
            ResultSet result = s.executeQuery(query);
            while(result.next()){
                System.out.print("Id: "+ result.getInt("id"));
                System.out.print(", Name: "+ result.getString("name"));
                System.out.print(", Surname: "+ result.getString("surname"));
                System.out.print(", University: "+ result.getString("university"));
                System.out.println(", Salary: "+ result.getInt("salary"));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
