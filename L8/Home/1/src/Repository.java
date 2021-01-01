import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (id, name, melli, age, city, spec) values (?,?,?,?,?,?)");
        preparedStatement.setInt(1,entity.getId());
        preparedStatement.setString(2,entity.getName());
        preparedStatement.setString(3,entity.getMelli());
        preparedStatement.setInt(4,entity.getAge());
        preparedStatement.setString(5,entity.getCity());
        preparedStatement.setString(6,entity.getSpec());
        preparedStatement.executeUpdate();
    }
    public void commit() throws Exception {
        connection.commit ();
    }
    public void rollback() throws Exception {
        connection.rollback ();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}