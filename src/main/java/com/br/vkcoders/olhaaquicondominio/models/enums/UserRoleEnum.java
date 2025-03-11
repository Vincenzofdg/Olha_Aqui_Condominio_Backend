package com.br.vkcoders.olhaaquicondominio.models.enums;

public enum UserRoleEnum {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRoleEnum (String role) {
        this.role = role;
    }

    public String getRole () {
        return role;
    }
}
