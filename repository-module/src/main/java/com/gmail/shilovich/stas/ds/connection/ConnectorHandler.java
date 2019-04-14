package com.gmail.shilovich.stas.ds.connection;

import com.gmail.shilovich.stas.ds.exception.DatabaseException;
import com.gmail.shilovich.stas.ds.properties.DatabaseProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


@Component
public class ConnectorHandler {
    private final DatabaseProperties databaseProperties;
    private static final Logger logger = LogManager.getLogger(ConnectorHandler.class);
    private static final String ERROR_MESSAGE = "Connection failed";


    @Autowired
    public ConnectorHandler(DatabaseProperties databaseProperties) {
        try {
            Class.forName(databaseProperties.getDriver());
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage(), e);
        }
        this.databaseProperties = databaseProperties;
    }

    public Connection getConnection() {
        try {
            Properties properties = new Properties();
            properties.setProperty("user", databaseProperties.getUsername());
            properties.setProperty("password", databaseProperties.getPassword());
            properties.setProperty("useUnicode", "true");
            properties.setProperty("characterEncoding", "cp1251");
            return DriverManager.getConnection(databaseProperties.getUrl(), properties);
        } catch (SQLException e) {
            logger.error(ERROR_MESSAGE, e);
            throw new DatabaseException(ERROR_MESSAGE);
        }
    }

    @PostConstruct
    public void createDatabaseTables() {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS t_document(f_id INT NOT NULL AUTO_INCREMENT," +
                " f_description  VARCHAR(100) NULL, f_unique_number VARCHAR(45)  NOT NULL," +
                " f_deleted TINYINT NOT NULL, PRIMARY KEY (f_id))";
        executeQuery(createTableQuery);
    }

    @PostConstruct
    public void insertDatabaseStartParameters() {
        String createTableQuery = "INSERT INTO t_document(f_id, f_description, f_unique_number, f_deleted)" +
                " VALUES (1, 'Test Document Description','7dc53df5-703e-49b3-8670-b1c468f47f1f',0)";
        executeQuery(createTableQuery);
    }

    private void executeQuery(String createTableQuery) {
        try (Connection connection = getConnection()) {
            connection.setAutoCommit(false);
            try (Statement statement = connection.createStatement()) {
                statement.execute(createTableQuery);
                connection.commit();
            } catch (Exception e) {
                connection.rollback();
            }
        } catch (SQLException e) {
            logger.error(ERROR_MESSAGE, e);
            throw new DatabaseException(ERROR_MESSAGE);
        }
    }


}
