package com.gmail.shilovich.stas.ds;

import com.gmail.shilovich.stas.ds.model.Document;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;

public interface DocumentConverter {
    DocumentDTO toDTO(Document document);


}
