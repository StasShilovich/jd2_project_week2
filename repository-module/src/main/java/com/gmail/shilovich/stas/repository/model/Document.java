package com.gmail.shilovich.stas.repository.model;

public class Document {
    private Long id;
    private String unique_numver;
    private String description;
    private boolean deleted;

    public Document(Long id, String unique_numver, String description, boolean deleted) {
        this.id = id;
        this.unique_numver = unique_numver;
        this.description = description;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnique_numver() {
        return unique_numver;
    }

    public void setUnique_numver(String unique_numver) {
        this.unique_numver = unique_numver;
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
