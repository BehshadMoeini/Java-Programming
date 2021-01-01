import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali")) {
            PreparedStatement preparedStatement = connection.prepareStatement("create table emp (id number primary key, name varchar2(30), melli varchar2(10), father varchar2(15), post varchar2(10), salary varchar2(10), experience number)");
            preparedStatement.executeUpdate();
            System.out.printf("Enter employee count: ");
            Scanner scanner = new Scanner(System.in);
            int t1=scanner.nextInt(), t3;
            String t2;
            for (int i=1; t1>0 ; t1--,i++) {
                preparedStatement = connection.prepareStatement("insert into emp (id, name, melli, father, post, salary, experience) values (?,?,?,?,?,?,?)");
                preparedStatement.setLong(1,i);
                System.out.printf("Enter Full Name: ");
                t2 = scanner.next();
                preparedStatement.setString(2, t2);
                System.out.printf("Melli Code: ");
                t2 = scanner.next();
                preparedStatement.setString(3, t2);
                System.out.printf("Father Name: ");
                t2 = scanner.next();
                preparedStatement.setString(4, t2);
                System.out.printf("Post: ");
                t2 = scanner.next();
                preparedStatement.setString(5, t2);
                System.out.printf("Salary: ");
                t2 = scanner.next();
                preparedStatement.setString(6, t2);
                System.out.printf("Experience: ");
                t3 = scanner.nextInt();
                preparedStatement.setLong(7, t3);
                preparedStatement.executeUpdate();
            }
            System.out.printf("Enter employee ID to delete: ");
            t1 = scanner.nextInt();
            preparedStatement = connection.prepareStatement("delete from emp where id=?");
            preparedStatement.setLong(1,t1);
            preparedStatement.executeUpdate();
            exit(preparedStatement, connection);
        } catch (SQLException e) {
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public static void exit(PreparedStatement preparedStatement, Connection connection) {
        try {
            preparedStatement = connection.prepareStatement("drop table emp");
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.exit(0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}