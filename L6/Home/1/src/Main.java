import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali")) {
            PreparedStatement preparedStatement = connection.prepareStatement("create table users (id number, username varchar2(20), email varchar2(40), pass varchar2(20), age number, education varchar2(20))");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("insert into users (id, username, email, pass, age, education) values (?,?,?,?,?,?)");
            preparedStatement.setLong(1,1);
            preparedStatement.setString(2, "qwe");
            preparedStatement.setString(3, "qwe@test.com");
            preparedStatement.setString(4, "123");
            preparedStatement.setLong(5, 20);
            preparedStatement.setString(6, "Diploma");
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement("select username, pass from users");
            ResultSet resultSet1 = preparedStatement.executeQuery();
            List<String> users = new ArrayList<>();
            List<String> passes = new ArrayList<>();
            while (resultSet1.next()) {
                users.add(resultSet1.getString("username"));
                passes.add(resultSet1.getString("pass"));
            }

            Scanner scanner = new Scanner(System.in);
            int temp1, id=0;
            String temp2 = null;
            System.out.printf("1\tSign In\n2\tSign Up\n");
            switch (scanner.next()) {
                case "1":
                    System.out.printf("Enter Username: ");
                    String user = scanner.next();
                    if (users.contains(user) == false) {
                        System.out.println("User doesn't exist");
                        exit(preparedStatement, connection);
                    } else {
                        temp1 = users.indexOf(user);
                        temp2 = passes.get(temp1);
                    }
                    System.out.printf("Enter Password: ");
                    String pass = scanner.next();
                    if (pass.equals(temp2)) {
                        System.out.println("Login Successful");
                        id = (passes.indexOf(pass))+1;
                    }
                    else {
                        System.out.println("Wrong Password");
                        exit(preparedStatement, connection);
                    }
                    System.out.printf("1\tShow Info\n2\tUpdate Info\n");
                    switch (scanner.next()) {
                        case "2":
                            System.out.printf("What Do You Want To Update?\n1\tID\n2\tUsername\n3\tEmail\n4\tPassword\n5\tAge\n6\tEducation\n");
                            switch (scanner.next()) {
                                case "1":
                                    temp2 = getUpdate();
                                    preparedStatement = connection.prepareStatement("update users set id=? where id=?");
                                    preparedStatement.setLong(1, Long.parseLong(temp2));
                                    preparedStatement.setLong(2,id);
                                    preparedStatement.executeUpdate();
                                    id = Integer.parseInt(temp2);
                                    break;
                                case "2":
                                    temp2 = getUpdate();
                                    preparedStatement = connection.prepareStatement("update users set username=? where id=?");
                                    preparedStatement.setString(1, temp2);
                                    preparedStatement.setLong(2,id);
                                    preparedStatement.executeUpdate();
                                    break;
                                case "3":
                                    temp2 = getUpdate();
                                    preparedStatement = connection.prepareStatement("update users set email=? where id=?");
                                    preparedStatement.setString(1, temp2);
                                    preparedStatement.setLong(2,id);
                                    preparedStatement.executeUpdate();
                                    break;
                                case "4":
                                    temp2 = getUpdate();
                                    preparedStatement = connection.prepareStatement("update users set pass=? where id=?");
                                    preparedStatement.setString(1, temp2);
                                    preparedStatement.setLong(2,id);
                                    preparedStatement.executeUpdate();
                                    break;
                                case "5":
                                    temp2 = getUpdate();
                                    preparedStatement = connection.prepareStatement("update users set age=? where id=?");
                                    preparedStatement.setLong(1, Long.parseLong(temp2));
                                    preparedStatement.setLong(2,id);
                                    preparedStatement.executeUpdate();
                                    break;
                                case "6":
                                    temp2 = getUpdate();
                                    preparedStatement = connection.prepareStatement("update users set education=? where id=?");
                                    preparedStatement.setString(1, temp2);
                                    preparedStatement.setLong(2,id);
                                    preparedStatement.executeUpdate();
                                    break;
                            }
                        case "1":
                            preparedStatement = connection.prepareStatement("select * from users where id=?");
                            preparedStatement.setLong(1,id);
                            ResultSet resultSet2 = preparedStatement.executeQuery();
                            while (resultSet2.next())
                                System.out.printf(resultSet2.getLong("id") +"\t"+ resultSet2.getString("username") +"\t"+ resultSet2.getString("email") +"\t"+ resultSet2.getString("pass") +"\t"+ resultSet2.getLong("age") +"\t"+ resultSet2.getString("education"));
                            exit(preparedStatement, connection);
                            break;
                    }
                case "2":
                    preparedStatement = connection.prepareStatement("insert into users (id, username, email, pass, age, education) values (?,?,?,?,?,?)");
                    System.out.printf("Enter ID: ");
                    temp2 = scanner.next();
                    preparedStatement.setLong(1, Long.parseLong(temp2));
                    System.out.printf("Username: ");
                    temp2 = scanner.next();
                    preparedStatement.setString(2, temp2);
                    System.out.printf("Email: ");
                    temp2 = scanner.next();
                    preparedStatement.setString(3, temp2);
                    System.out.printf("Password: ");
                    temp2 = scanner.next();
                    preparedStatement.setString(4, temp2);
                    System.out.printf("Age: ");
                    temp2 = scanner.next();
                    preparedStatement.setLong(5, Long.parseLong(temp2));
                    System.out.printf("Education: ");
                    temp2 = scanner.next();
                    preparedStatement.setString(6, temp2);
                    preparedStatement.executeUpdate();
                    break;
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
    public static String getUpdate() {
        System.out.printf("Enter new value: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}