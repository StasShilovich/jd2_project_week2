package com.gmail.shilovich.stas.ds.impl;

import com.gmail.shilovich.stas.ds.DocumentConverter;
import com.gmail.shilovich.stas.ds.DocumentRepository;
import com.gmail.shilovich.stas.ds.model.Document;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("documentConverter")
public class DocumentConverterImpl implements DocumentConverter {


    @Override
    public DocumentDTO toDTO(Document document) {
        return null;
    }
}
