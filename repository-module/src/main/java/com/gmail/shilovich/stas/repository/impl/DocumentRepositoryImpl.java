package com.gmail.shilovich.stas.repository.impl;

import com.gmail.shilovich.stas.repository.DocumentRepository;
import com.gmail.shilovich.stas.repository.connection.ConnectorHandler;
import com.gmail.shilovich.stas.repository.exception.DatabaseException;
import com.gmail.shilovich.stas.repository.model.Document;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {
    private static final Logger logger = LogManager.getLogger(ConnectorHandler.class);
    private static final String ERROR_MESSAGE = "Document repository operation failed";

    @Autowired
    private final ConnectorHandler connectorHandler;

    public DocumentRepositoryImpl(ConnectorHandler connectorHandler) {
        this.connectorHandler = connectorHandler;
    }

    @Override

    public Document addDocument(Document document) {
        String sql = "INSERT INTO t_document( f_description, f_unique_number, f_deleted) VALUES(?,?,?)";
        try (PreparedStatement statement = connectorHandler.getConnection().prepareStatement(sql)) {
            statement.setString(1, document.getDescription());
            String uuid;
            if (document.getUnique_number().isEmpty()) {
                uuid = UUID.randomUUID().toString();
            } else {
                uuid = document.getUnique_number();
            }
            statement.setString(2, uuid);
            int deleted = 0;
            if (document.isDeleted()) {
                deleted = 1;
            }
            statement.setString(3, String.valueOf(deleted));
            int rows = statement.executeUpdate();
            if (rows == 0) {
                throw new DatabaseException("No rows affected");
            }
        } catch (SQLException e) {
            logger.error(e.getMessage());
            throw new DatabaseException(ERROR_MESSAGE);
        }
        return document;
    }

    @Override
    public Document getDocument(Long id) {
        return null;
    }

    @Override
    public void deleteDocument(Long id) {

    }
}
