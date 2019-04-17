package com.gmail.shilovich.stas.controller.app;

import com.gmail.shilovich.stas.controller.DocumentController;
import com.gmail.shilovich.stas.controller.config.DocumetServiceAppConfig;
import com.gmail.shilovich.stas.controller.impl.DocumentControllerImpl;
import com.gmail.shilovich.stas.service.model.DocumentDTO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DocumetServiceAppConfig.class);
        context.refresh();
        DocumentController documentController = context.getBean(DocumentController.class);
        documentController.add(new DocumentDTO(1l, "3232","12312312312312-23"));
    }
}
