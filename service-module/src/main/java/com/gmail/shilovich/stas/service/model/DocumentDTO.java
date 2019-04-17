package com.gmail.shilovich.stas.service.model;

public class DocumentDTO {

    private Long id;
    private String description;
    private String unique_number;

    public DocumentDTO() {
    }

    public DocumentDTO(Long id, String description, String unique_number) {
        this.id = id;
        this.description = description;
        this.unique_number = unique_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnique_number() {
        return unique_number;
    }

    public void setUnique_number(String unique_number) {
        this.unique_number = unique_number;
    }
}
