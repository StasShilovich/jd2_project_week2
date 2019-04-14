package com.gmail.shilovich.stas.ds;

import com.gmail.shilovich.stas.ds.config.Config;
import com.gmail.shilovich.stas.ds.model.Document;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        DocumentRepository documentRepository=context.getBean(DocumentRepository.class);
        documentRepository.addDocument(new Document(2l,"32323","2323131",true));
    }
}
