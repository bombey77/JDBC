import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by Ромашка on 07.09.2017.
 */
public class DBWorker {

    private static final String URL = "jdbc:mysql://localhost:3306/sqldb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    Connection connection;

    public DBWorker() {

        try {
            Driver driver = new FabricMySQLDriver();

            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

            //statement.execute("INSERT INTO users(name, age, email) VALUES('Gaxy', 34, 'fraogala@mail.ru');");

            //int res = statement.executeUpdate("UPDATE users SET name = 'Valya', age = 43, email = 'valka@mail' WHERE id = 11;");
            //System.out.println(res);

            //statement.executeUpdate("UPDATE users SET name = 'Valechka' WHERE id = 11;");

            //statement.executeUpdate("INSERT INTO users(name, age, email) VALUES('Gala', 32, 'fraogala@mail.ru');");

            //ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            //statement.addBatch("INSERT INTO users(name, age, email) VALUES('Roman', 30, 'bombey');");
            //statement.addBatch("INSERT INTO users(name, age, email) VALUES('Roman', 30, 'bombey');");
            //statement.addBatch("INSERT INTO users(name, age, email) VALUES('Roman', 30, 'bombey');");
            //statement.executeBatch();

            //statement.clearBatch(); //вытирает запросы

            //boolean status = statement.isClosed();
            //System.out.println(status);

            Connection status = statement.getConnection();

            //statement.close(); //усли statement в блоке try/catch то не нужно закрывать

        } catch (SQLException e) {
            System.err.println("Нет подключения!");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
