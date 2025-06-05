import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class MysqlConfig {

    private static final String URL = "jdbc:mysql://192.168.68.53:3306/mentoria1_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public Connection getConnection() {
        if (Objects.nonNull(connection)) return connection;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection;

        } catch (SQLException e) {
            throw new RuntimeException("CONEXAO COM O BANCO FALHOU!", e);
        }
    }

}
