package singleton;

import java.sql.*;

public class SingletonDB {
    private static SingletonDB instance = null;
    private static String url = "jdbc:mysql://127.0.0.1:3306/dbbooks";
    private static String username = "root";
    private static String password = "ochiengowiro37";
    private  static String query = "select * From  tblBooks;";
    private static int counter=0;

    private SingletonDB(){
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int isbn = resultSet.getInt("ISBN");
                String author = resultSet.getString("Author");
                String title = resultSet.getString("Title");
                String edition = resultSet.getString("Title");
                System.out.println(isbn);
                System.out.println(author);
                System.out.println(title);
                System.out.println(edition);
            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  static void incrcounter(){
        counter++;

    }
    public int  getcount(){
        return counter;
    }
    public static SingletonDB StartConnection(){
        if (instance==null){
            instance = new SingletonDB();

        }
        incrcounter();
        return instance;
    }

}
