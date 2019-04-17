package com.gmail.shilovich.stas.controller.impl;

import com.gmail.shilovich.stas.controller.DocumentController;
import com.gmail.shilovich.stas.repository.DocumentRepository;
import com.gmail.shilovich.stas.repository.model.Document;
import com.gmail.shilovich.stas.service.DocumentConverter;
import com.gmail.shilovich.stas.service.DocumentDTOConverter;
import com.gmail.shilovich.stas.service.model.DocumentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class DocumentControllerImpl implements DocumentController {
    private final DocumentRepository documentRepository;
    private final DocumentConverter documentConverter;
    private final DocumentDTOConverter documentDTOConverter;

    @Autowired
    public DocumentControllerImpl(DocumentRepository documentRepository, DocumentConverter documentConverter, DocumentDTOConverter documentDTOConverter) {
        this.documentRepository = documentRepository;
        this.documentConverter = documentConverter;
        this.documentDTOConverter = documentDTOConverter;
    }

    @Override
    public DocumentDTO add(DocumentDTO documentDTO) {
        Document documentIn = documentDTOConverter.fromDTO(documentDTO);
        Document documentOut = documentRepository.addDocument(documentIn);
        DocumentDTO documentDTOOut = documentConverter.toDTO(documentOut);
        return documentDTOOut;
    }

    @Override
    public DocumentDTO getDocumentById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
