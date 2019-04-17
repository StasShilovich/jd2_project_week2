package com.gmail.shilovich.stas.service.impl;

import com.gmail.shilovich.stas.service.DocumentConverter;
import com.gmail.shilovich.stas.repository.model.Document;
import com.gmail.shilovich.stas.service.model.DocumentDTO;
import org.springframework.stereotype.Component;

@Component("documentConverter")
public class DocumentConverterImpl implements DocumentConverter {


    @Override
    public DocumentDTO toDTO(Document document) {
        return null;
    }
}
