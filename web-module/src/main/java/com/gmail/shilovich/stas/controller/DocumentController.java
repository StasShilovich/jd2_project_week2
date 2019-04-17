package com.gmail.shilovich.stas.controller;

import com.gmail.shilovich.stas.service.model.DocumentDTO;

public interface DocumentController {
    DocumentDTO add(DocumentDTO documentDTO);

    DocumentDTO getDocumentById(Long id);

    void delete(Long id);
}
