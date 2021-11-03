package com.example.testproject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Todos {
    private Integer userId;
    private Integer id;
    private String title;
    private boolean completed;
}
