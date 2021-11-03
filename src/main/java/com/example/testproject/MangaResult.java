package com.example.testproject;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @NoArgsConstructor
public class MangaResult {
    private String request_hash;
    private boolean request_cached;
    private Integer request_cache_expiry;
    private List<Manga> results;
    private Integer last_page;

}
