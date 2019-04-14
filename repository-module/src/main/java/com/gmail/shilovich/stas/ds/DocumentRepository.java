package com.gmail.shilovich.stas.ds;

import com.gmail.shilovich.stas.ds.model.Document;

public interface DocumentRepository {
    Document addDocument(Document document);

    Document getDocument(Long id);

    void deleteDocument(Long id);
}
