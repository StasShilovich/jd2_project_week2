package com.gmail.shilovich.stas.ds.converter.impl;

import com.gmail.shilovich.stas.ds.converter.DocumentConverter;
import com.gmail.shilovich.stas.ds.model.Document;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;
import org.springframework.stereotype.Component;

@Component("documentConverter")
public class DocumentConverterImpl implements DocumentConverter {
    @Override
    public DocumentDTO toDTO(Document document) {
        return null;
    }
}
