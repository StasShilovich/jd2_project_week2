package com.gmail.shilovich.stas.ds;

import com.gmail.shilovich.stas.ds.model.DocumentDTO;

public interface DocumentController {
    DocumentDTO add(DocumentDTO documentDTO);

    DocumentDTO getDocumentById(Long id);

    void delete(Long id);
}
