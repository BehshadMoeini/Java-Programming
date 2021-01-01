import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali")) {
            PreparedStatement preparedStatement = connection.prepareStatement("create table users (name varchar2(20), pass varchar2(20), username varchar2(20), email varchar2(40))");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("insert into users (name, pass, username, email) values (?,?,?,?)");
            preparedStatement.setString(1,"qwe");
            preparedStatement.setString(2,"123");
            preparedStatement.setString(3,"qwe123");
            preparedStatement.setString(4,"qwe@test.com");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into users (name, pass, username, email) values (?,?,?,?)");
            preparedStatement.setString(1,"asd");
            preparedStatement.setString(2,"234");
            preparedStatement.setString(3,"asd234");
            preparedStatement.setString(4,"asd@test.com");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into users (name, pass, username, email) values (?,?,?,?)");
            preparedStatement.setString(1,"zxc");
            preparedStatement.setString(2,"345");
            preparedStatement.setString(3,"zxc345");
            preparedStatement.setString(4,"zxc@test.com");
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement("select username, pass from users");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<String> users = new ArrayList<>();
            List<String> passes = new ArrayList<>();
            while (resultSet.next()) {
                users.add(resultSet.getString("username"));
                passes.add(resultSet.getString("pass"));
            }

            Scanner scanner = new Scanner(System.in);
            int temp1;
            String temp2 = null;
            System.out.printf("Enter Username: ");
            String user = scanner.next();
            if (users.contains(user)==false) {
                System.out.println("User doesn't exist");
                exit(preparedStatement, connection);
            }
            else {
                temp1 = users.indexOf(user);
                temp2 = passes.get(temp1);
            }
            System.out.printf("Enter Password: ");
            String pass = scanner.next();
            if (pass.equals(temp2)) {
                System.out.println("Login Successful");
                exit(preparedStatement, connection);
            }
            else {
                System.out.println("Wrong Password");
                exit(preparedStatement, connection);
            }
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }

    public static void exit(PreparedStatement preparedStatement, Connection connection) {
        try {
            //preparedStatement = connection.prepareStatement("drop table users");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.exit(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}