package com.example.testproject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Manga {

    private Integer mal_id;
    private String url;
    private String image_url;
    private String title;
    private boolean publishing;
    private String synopsis;
    private String type;
    private Integer chapters;
    private Integer volumes;
    private Double score;
    private String start_date;
    private String end_date;
    private Integer members;
}