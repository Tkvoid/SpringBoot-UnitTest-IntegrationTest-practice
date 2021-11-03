package com.example.testproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MangaServiceUnitTest {
    @Autowired
    private MangaService mangaService;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    public void testGetMangasByTitle() throws IOException {
        // Parsing mock file
        MangaResult mRs = JsonUtils.jsonFile2Object("ken.json", MangaResult.class);
        // Mocking remote service
        when(restTemplate.getForEntity(any(String.class), any(Class.class))).thenReturn(new ResponseEntity(mRs, HttpStatus.OK));
        // I search for goku but system will use mocked response containing only ken, so I can check that mock is used.
        List<Manga> mangasByTitle = mangaService.getMangasByTitle("goku");
        assertThat(mangasByTitle).isNotNull()
                .isNotEmpty()
                .allMatch(p -> p.getTitle()
                        .toLowerCase()
                        .contains("ken"));

    }
}
