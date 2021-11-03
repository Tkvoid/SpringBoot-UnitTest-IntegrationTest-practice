package com.example.testproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MangaService {

    Logger logger = LoggerFactory.getLogger(MangaService.class);
    // private static final String MANGA_SEARCH_URL="https://jsonplaceholder.typicode.com/todos/";
    private static final String MANGA_SEARCH_URL="https://api.jikan.moe/v3/search/manga?q=";

    @Autowired
    RestTemplate restTemplate;


    public List<Manga> getMangasByTitle(String title) {
        // return restTemplate.getForEntity(MANGA_SEARCH_URL+title, Todos.class).getBody().getTitle();
        return restTemplate.getForEntity(MANGA_SEARCH_URL+title, MangaResult.class).getBody().getResults();
    }

}