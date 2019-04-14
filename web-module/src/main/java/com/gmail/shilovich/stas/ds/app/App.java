package com.gmail.shilovich.stas.ds.app;

import com.gmail.shilovich.stas.ds.DocumentController;
import com.gmail.shilovich.stas.ds.config.DocumetServiceAppConfig;
import com.gmail.shilovich.stas.ds.model.DocumentDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DocumetServiceAppConfig.class);
        context.refresh();
        DocumentController documentController = context.getBean(DocumentController.class);
        DocumentDTO documentDTO = documentController.add(new DocumentDTO(1l, "3232"));
    }
}
