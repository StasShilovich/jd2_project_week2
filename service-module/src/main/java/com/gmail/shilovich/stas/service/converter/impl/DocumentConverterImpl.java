package com.gmail.shilovich.stas.service.converter.impl;

import com.gmail.shilovich.stas.service.converter.DocumentConverter;
import com.gmail.shilovich.stas.repository.model.Document;
import com.gmail.shilovich.stas.service.model.DocumentDTO;
import org.springframework.stereotype.Component;

@Component("documentConverter")
public class DocumentConverterImpl implements DocumentConverter {

    @Override
    public DocumentDTO toDTO(Document document) {
        DocumentDTO documentDTO=new DocumentDTO();
        documentDTO.setId(document.getId());
        documentDTO.setDescription(document.getDescription());
        documentDTO.setUnique_number(document.getUnique_number());
        return documentDTO;
    }
}
