package com.gmail.shilovich.stas.ds.converter;

import com.gmail.shilovich.stas.ds.model.Document;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;

public interface DocumentDTOConverter {
    Document fromDTO(DocumentDTO dto);
}
