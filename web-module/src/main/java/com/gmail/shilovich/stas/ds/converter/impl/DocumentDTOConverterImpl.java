package com.gmail.shilovich.stas.ds.converter.impl;

import com.gmail.shilovich.stas.ds.converter.DocumentDTOConverter;
import com.gmail.shilovich.stas.ds.model.Document;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;
import org.springframework.stereotype.Component;

@Component("documentDTOConverter")
public class DocumentDTOConverterImpl implements DocumentDTOConverter {
    @Override
    public Document fromDTO(DocumentDTO dto) {
        return null;
    }
}
