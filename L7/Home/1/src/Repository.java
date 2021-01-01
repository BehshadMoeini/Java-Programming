import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ali", "ali");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("insert into users (id, username, password, bill, dataPlan) values (?,?,?,?,?)");
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, "qwe");
        preparedStatement.setString(3, "123");
        preparedStatement.setInt(4, 1000);
        preparedStatement.setInt(5, 1);
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity) throws Exception {
        preparedStatement = connection.prepareStatement("update users set username=?, password=?, bill=?, dataPlan=? where id=?");
        preparedStatement.setString(1, entity.getUsername());
        preparedStatement.setString(2, entity.getPassword());
        preparedStatement.setInt(3, entity.getBill());
        preparedStatement.setInt(4, entity.getDataPlan());
        preparedStatement.setInt(5,1);
        preparedStatement.executeUpdate();
    }
    public List<Entity> select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Entity> entityList = new ArrayList<>();
        while (resultSet.next()) {
            Entity entity = new Entity();
            entity.setId(resultSet.getInt("id"));
            entity.setUsername(resultSet.getString("username"));
            entity.setPassword(resultSet.getString("password"));
            entity.setBill(resultSet.getInt("bill"));
            entity.setDataPlan(resultSet.getInt("dataPlan"));
            entityList.add(entity);
        }
        return entityList;
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