package com.example.thymeleaf.answer9;

public enum Role {
    ADMIN("ADMIN"),USER("USER"),SUPER_ADMIN("SUPER_ADMIN");
    String type;

    Role(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

