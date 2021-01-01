import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali")) {
            PreparedStatement preparedStatement = connection.prepareStatement("create table stu (id number primary key, name varchar2(30), year number, avg number)");
            preparedStatement.executeUpdate();
            System.out.printf("Enter student count: ");
            Scanner scanner = new Scanner(System.in);
            int t1 = scanner.nextInt(), t3;
            String t2;
            for (int i = 1; t1 > 0; t1--, i++) {
                preparedStatement = connection.prepareStatement("insert into stu (id, name, year, avg) values (?,?,?,?)");
                preparedStatement.setLong(1, i);
                System.out.printf("Enter Full Name: ");
                t2 = scanner.next();
                preparedStatement.setString(2, t2);
                System.out.printf("Entry Year: ");
                t3 = scanner.nextInt();
                preparedStatement.setLong(3, t3);
                System.out.printf("Average: ");
                t3 = scanner.nextInt();
                preparedStatement.setLong(4, t3);
                preparedStatement.executeUpdate();
            }
            System.out.printf("Enter student ID to modify: ");
            t1 = scanner.nextInt();
            System.out.println("1\tUpdate\n2\tDelete");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.printf("What Do You Want To Update?\n1\tID\n2\tName\n3\tEntry Year\n4\tAverage\n");
                    switch (scanner.next()) {
                        case "1":
                            t2 = getUpdate();
                            preparedStatement = connection.prepareStatement("update stu set id=? where id=?");
                            preparedStatement.setLong(1, Long.parseLong(t2));
                            preparedStatement.setLong(2, t1);
                            preparedStatement.executeUpdate();
                            break;
                        case "2":
                            t2 = getUpdate();
                            preparedStatement = connection.prepareStatement("update stu set name=? where id=?");
                            preparedStatement.setString(1, t2);
                            preparedStatement.setLong(2, t1);
                            preparedStatement.executeUpdate();
                            break;
                        case "3":
                            t2 = getUpdate();
                            preparedStatement = connection.prepareStatement("update stu set year=? where id=?");
                            preparedStatement.setLong(1, Long.parseLong(t2));
                            preparedStatement.setLong(2, t1);
                            preparedStatement.executeUpdate();
                            break;
                        case "4":
                            t2 = getUpdate();
                            preparedStatement = connection.prepareStatement("update stu set avg=? where id=?");
                            preparedStatement.setLong(1, Long.parseLong(t2));
                            preparedStatement.setLong(2, t1);
                            preparedStatement.executeUpdate();
                            break;
                    }
                    break;
                case 2:
                    preparedStatement = connection.prepareStatement("delete from stu where id=?");
                    preparedStatement.setLong(1, t1);
                    preparedStatement.executeUpdate();
                    exit(preparedStatement, connection);
                    break;
            }
        } catch(SQLException e){
            System.out.println("DB ERROR " + e.getMessage());
        }
    }
    public static void exit (PreparedStatement preparedStatement, Connection connection){
        try {
            //preparedStatement = connection.prepareStatement("drop table stu");
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