package com.gmail.shilovich.stas.repository.model;

public class Document {
    private Long id;
    private String unique_number;
    private String description;
    private boolean deleted;

    public Document(Long id, String unique_numver, String description, boolean deleted) {
        this.id = id;
        this.unique_number = unique_numver;
        this.description = description;
        this.deleted = deleted;
    }

    public Document() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnique_number() {
        return unique_number;
    }

    public void setUnique_number(String unique_number) {
        this.unique_number = unique_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
