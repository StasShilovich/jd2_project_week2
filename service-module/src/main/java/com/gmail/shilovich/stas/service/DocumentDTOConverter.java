package com.gmail.shilovich.stas.service;

import com.gmail.shilovich.stas.repository.model.Document;
import com.gmail.shilovich.stas.service.model.DocumentDTO;

public interface DocumentDTOConverter {
    Document fromDTO(DocumentDTO dto);
}
