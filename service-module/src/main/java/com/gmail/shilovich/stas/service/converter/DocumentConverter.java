package com.gmail.shilovich.stas.service.converter;

import com.gmail.shilovich.stas.repository.model.Document;
import com.gmail.shilovich.stas.service.model.DocumentDTO;

public interface DocumentConverter {
    DocumentDTO toDTO(Document document);


}
