package com.juaracoding.smartpro_rest_api.dto.validation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.juaracoding.smartpro_rest_api.dto.relation.RelMenuDTO;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.List;

public class RoleDTO {

    @NotNull
    private Long id;

    @Pattern(regexp = "^([a-zA-Z0-9\\.]{8,16})$",
            message = "Invalid format! Allowed format: Uppercase & lowercase letters, numbers and dots only, length allowed 8-16 characters, for example: Michael.Laksa123")
    private String name;

    @NotNull(message = "Relation Cannot Be NULL")
    @JsonProperty("list-menu")
    private List<RelMenuDTO> listMenu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RelMenuDTO> getListMenu() {
        return listMenu;
    }

    public void setListMenu(List<RelMenuDTO> listMenu) {
        this.listMenu = listMenu;
    }
}
