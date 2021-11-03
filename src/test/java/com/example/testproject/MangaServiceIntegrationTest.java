package com.example.testproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MangaServiceIntegrationTest {

    @Autowired
    private MangaService mangaService;

    @Test
    public void testGetMangasByTitle() {
        List<Manga> mangasByTitle = mangaService.getMangasByTitle("ken");
        assertThat(mangasByTitle).isNotNull().isNotEmpty();
    }

}
