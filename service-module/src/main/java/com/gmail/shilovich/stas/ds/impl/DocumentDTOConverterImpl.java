package com.gmail.shilovich.stas.ds.impl;

import com.gmail.shilovich.stas.ds.DocumentDTOConverter;
import com.gmail.shilovich.stas.ds.model.Document;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("documentDTOConverter")
public class DocumentDTOConverterImpl implements DocumentDTOConverter {


    @Override
    public Document fromDTO(DocumentDTO dto) {
        return null;
    }
}
