package com.gmail.shilovich.stas.repository;

import com.gmail.shilovich.stas.repository.model.Document;

public interface DocumentRepository {
    Document addDocument(Document document);

    Document getDocument(Long id);

    void deleteDocument(Long id);
}
