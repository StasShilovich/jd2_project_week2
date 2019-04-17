package com.gmail.shilovich.stas.service.impl;

import com.gmail.shilovich.stas.service.DocumentDTOConverter;
import com.gmail.shilovich.stas.repository.model.Document;
import com.gmail.shilovich.stas.service.model.DocumentDTO;
import org.springframework.stereotype.Component;

@Component("documentDTOConverter")
public class DocumentDTOConverterImpl implements DocumentDTOConverter {


    @Override
    public Document fromDTO(DocumentDTO dto) {
        Document document = new Document();
        document.setId(dto.getId());
        document.setDescription(dto.getDescription());
        document.setUnique_number(dto.getUnique_number());
        return document;
    }
}
